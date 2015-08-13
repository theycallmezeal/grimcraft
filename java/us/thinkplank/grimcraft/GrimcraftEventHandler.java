package us.thinkplank.grimcraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerOpenContainerEvent;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import us.thinkplank.mobs.EntityBoar;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class GrimcraftEventHandler {
	
	@SubscribeEvent
	public void onUseHoe(UseHoeEvent event) {
		Block targetBlock = event.world.getBlock(event.x, event.y, event.z);
		
		if (targetBlock.equals(Blocks.soul_sand)) {
			event.world.playSoundEffect((double)((float)event.x + 0.5F), (double)((float)event.y + 0.5F), (double)((float)event.z + 0.5F), targetBlock.stepSound.getStepResourcePath(), (targetBlock.stepSound.getVolume() + 1.0F) / 2.0F, targetBlock.stepSound.getPitch() * 0.8F);
			
			if (event.world.isRemote) {
				return;
			}
			
			//TODO fix player dropping through block when this happens
			event.world.setBlock(event.x, event.y, event.z, GrimcraftBlocks.peat);
            event.current.damageItem(1, event.entityPlayer);
		}
	}
	
	@SubscribeEvent
	public void onUseBonemeal(BonemealEvent event) {
		Block targetBlock = event.block;
		
		if (targetBlock.equals(GrimcraftBlocks.barley_crop) || targetBlock.equals(GrimcraftBlocks.netherroot_crop)) {
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void onPlayerInteract(PlayerInteractEvent event) {
		Block targetBlock = event.world.getBlock(event.x, event.y, event.z);
		ItemStack heldItemStack = event.entityPlayer.inventory.getCurrentItem();
		
		// handles strawberry harvesting
		if (targetBlock.equals(GrimcraftBlocks.vulpiberry_bush) && event.action == event.action.LEFT_CLICK_BLOCK) {
			if (event.world.getBlockMetadata(event.x, event.y, event.z) == 1) {
				event.setCanceled(true);
				event.world.spawnEntityInWorld(new EntityItem(event.world, (double)event.x, (double)event.y, (double)event.z, new ItemStack(GrimcraftItems.vulpiberry, 3)));
				event.world.setBlockMetadataWithNotify(event.x, event.y, event.z, 0, 2);
			}
		}
		
		// handles ghast pepper harvesting
		if (targetBlock.equals(GrimcraftBlocks.ghast_pepper_bush) && event.action == event.action.LEFT_CLICK_BLOCK) {
			if (event.world.getBlockMetadata(event.x, event.y, event.z) == 1) {
				event.setCanceled(true);
				event.world.spawnEntityInWorld(new EntityItem(event.world, (double)event.x, (double)event.y, (double)event.z, new ItemStack(GrimcraftItems.ghast_pepper, 3)));
				event.world.setBlockMetadataWithNotify(event.x, event.y, event.z, 0, 2);
			}
		}
		
		//TODO give this nasty ass code a refactor
		// handles poisoning with sulfur in furnaces
		EnumDifficulty difficulty = event.world.difficultySetting;
		double chance = 0;
		if (difficulty == EnumDifficulty.NORMAL) {
			chance = 0.2;
		} else if (difficulty == EnumDifficulty.HARD) {
			chance = 0.4;
		}
		
		if (targetBlock.equals(Blocks.furnace) && event.action == event.action.RIGHT_CLICK_BLOCK && Math.random() < chance) {
			TileEntityFurnace furnace = (TileEntityFurnace) event.world.getTileEntity(event.x, event.y, event.z);
			ItemStack furnaceFuel = furnace.getStackInSlot(1);
			if (furnaceFuel != null && furnaceFuel.getItem() == GrimcraftItems.brimstone) {
				int poisonStrength = 0;
				if (difficulty == EnumDifficulty.NORMAL) {
					poisonStrength = 7;
				} else if (difficulty == EnumDifficulty.HARD){
					poisonStrength = 15;
				}
				
				if (poisonStrength > 0) {
					event.entityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, poisonStrength * 20, 0));
				}
			}
		}
	}
	
	/* this makes lava push around mobs */
	@SubscribeEvent
	public void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
		event.entity.worldObj.handleMaterialAcceleration(event.entity.boundingBox.expand(0.0D, -0.4000000059604645D, 0.0D).contract(0.001D, 0.001D, 0.001D), Material.lava, event.entity);
	}
}