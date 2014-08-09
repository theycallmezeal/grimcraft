package us.thinkplank.grimcraft;

import us.thinkplank.grimcraft.block.BlockPeat;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GrimcraftEventHandler {
	
	@SubscribeEvent
	public void onUseHoe(UseHoeEvent event) {
		Block targetBlock = event.world.getBlock(event.x, event.y, event.z);
		
		if (targetBlock.equals(Blocks.soul_sand)) {
			event.world.playSoundEffect((double)((float)event.x + 0.5F), (double)((float)event.y + 0.5F), (double)((float)event.z + 0.5F), targetBlock.stepSound.getStepResourcePath(), (targetBlock.stepSound.getVolume() + 1.0F) / 2.0F, targetBlock.stepSound.getPitch() * 0.8F);
			
			if (event.world.isRemote) {
				return;
			}
			
			event.world.setBlock(event.x, event.y, event.z, Grimcraft.peat);
            event.current.damageItem(1, event.entityPlayer);
		}
	}
	
	@SubscribeEvent
	public void onUseBonemeal(BonemealEvent event) {
		Block targetBlock = event.block;
		
		if (targetBlock.equals(Grimcraft.barley_crop) || targetBlock.equals(Grimcraft.netherroot_crop)) {
			event.setCanceled(true);
		}
	}
	
	public void onPlayerInteract(PlayerInteractEvent event) {
		Block targetBlock = event.world.getBlock(event.x, event.y, event.z);
		
		if (targetBlock.equals(Grimcraft.strawberry_plant) && event.action == event.action.LEFT_CLICK_BLOCK) {
			event.world.setBlockMetadataWithNotify(event.x, event.y, event.z, 0, 2);
			event.setCanceled(true);
		}
	}
}