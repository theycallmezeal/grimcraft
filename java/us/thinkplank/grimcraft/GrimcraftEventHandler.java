package us.thinkplank.grimcraft;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.SkeletonType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import us.thinkplank.grimcraft.block.BlockGhastPepperBush;
import us.thinkplank.grimcraft.block.BlockVulpiberryBush;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class GrimcraftEventHandler {
	
	@SubscribeEvent
	public void onUseHoe(UseHoeEvent event) {
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		EntityPlayer player = event.getEntityPlayer();
		
		Block targetBlock = world.getBlockState(pos).getBlock();
		
		if (targetBlock.equals(Blocks.SOUL_SAND)) {
			world.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
			
			if (world.isRemote) {
				return;
			}
			
			world.setBlockState(event.getPos(), GrimcraftBlocks.peat.getDefaultState());
            event.getCurrent().damageItem(1, player);
		}
	}
	
	@SubscribeEvent
	public void onMobDeath(LivingDropsEvent event) {
		Entity entity = event.getEntity();
		
		List<EntityItem> drops = event.getDrops();
		
	    if (entity instanceof EntitySkeleton && ((EntitySkeleton) entity).func_189771_df() == SkeletonType.WITHER) { // if entity is wither skeleton
	        for (int i = 0; i < drops.size(); i++) {
	        	if (drops.get(i).getEntityItem().getItem().equals(Items.BONE)) {
	        		drops.get(i).setEntityItemStack(new ItemStack(GrimcraftItems.wither_bone));
	        	}
	        }
	        
	        int random = (int) (Math.random() * 3) + 3; // 3 to 5
	        for (int i = 0; i < random; i++) {
	        	drops.add(new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, new ItemStack(GrimcraftItems.brimstone)));
	        }
	    }
	    
	    if (entity instanceof EntityGhast || entity instanceof EntityBlaze || entity instanceof EntityMagmaCube || entity instanceof EntityPigZombie) {
	    	int random = (int) (Math.random() * 3) + 3; // 3 to 5
	        for (int i = 0; i < random; i++) {
	        	drops.add(new EntityItem(entity.worldObj, entity.posX, entity.posY, entity.posZ, new ItemStack(GrimcraftItems.brimstone)));
	        }
	    }
	} 
	
	@SubscribeEvent
	public void onUseBonemeal(BonemealEvent event) {
		Block targetBlock = event.getWorld().getBlockState(event.getPos()).getBlock();
		
		if (targetBlock.equals(GrimcraftBlocks.barley_crop) || targetBlock.equals(GrimcraftBlocks.netherroot_crop)) {
			event.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void onPlayerRightClick(RightClickBlock event) {
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		Block targetBlock = world.getBlockState(event.getPos()).getBlock();
		EntityPlayer player = event.getEntityPlayer();
		
		// handles poisoning with sulfur in furnaces
		EnumDifficulty difficulty = world.getDifficulty();
		double chance = 0;
		if (difficulty == EnumDifficulty.NORMAL) {
			chance = 0.2;
		} else if (difficulty == EnumDifficulty.HARD) {
			chance = 0.4;
		}
		
		if (targetBlock instanceof BlockFurnace) {
			TileEntityFurnace furnace = (TileEntityFurnace) world.getTileEntity(pos);
			ItemStack furnaceFuel = furnace.getStackInSlot(1);
			if (furnaceFuel != null && furnaceFuel.getItem() == GrimcraftItems.brimstone) {
				int poisonStrength = 0;
				if (difficulty == EnumDifficulty.NORMAL) {
					poisonStrength = 7;
				} else if (difficulty == EnumDifficulty.HARD){
					poisonStrength = 15;
				}
				
				if (poisonStrength > 0) {
					player.addPotionEffect(new PotionEffect(MobEffects.POISON, poisonStrength * 20, 0));
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerBreakBlock(BreakEvent event) {
		World worldIn = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = worldIn.getBlockState(pos);
		
		Block targetBlock = worldIn.getBlockState(pos).getBlock();
		
		// handles vulpiberry harvesting
		if (targetBlock.equals(GrimcraftBlocks.vulpiberry_bush)) {
			if (state.getValue(BlockVulpiberryBush.GROWN)) {
				event.setCanceled(true);
				if (!worldIn.isRemote) {
					worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(GrimcraftItems.vulpiberry, 3)));
				}
				worldIn.setBlockState(pos, state.withProperty(BlockVulpiberryBush.GROWN, false));
			}
		}
		
		// handles ghast pepper harvesting
		if (targetBlock.equals(GrimcraftBlocks.ghast_pepper_bush)) {
			if (state.getValue(BlockGhastPepperBush.GROWN)) {
				event.setCanceled(true);
				if (!worldIn.isRemote) {
					worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(GrimcraftItems.ghast_pepper, 3)));
				}
				worldIn.setBlockState(pos, state.withProperty(BlockGhastPepperBush.GROWN, false));
			}
		}
	}
	
	/* this makes lava push around mobs */
	@SubscribeEvent
	public void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
		Entity entity = event.getEntity();
		entity.worldObj.handleMaterialAcceleration(entity.getEntityBoundingBox().expand(0.0D, -0.4000000059604645D, 0.0D).contract(0.001D), Material.LAVA, entity);
	}
}