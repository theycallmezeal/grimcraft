package us.thinkplank.grimcraft;

import us.thinkplank.grimcraft.block.BlockPeat;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class GrimcraftEventHandler {
	
	@SubscribeEvent
	public void onUseHoe(UseHoeEvent event) {
		Block targetBlock = event.world.getBlock(event.x, event.y, event.z);
		
		if (targetBlock.equals(Blocks.soul_sand)) {
			event.world.setBlock(event.x, event.y, event.z, Grimcraft.peat);
		}
	}
}