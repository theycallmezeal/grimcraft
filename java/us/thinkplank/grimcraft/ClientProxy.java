package us.thinkplank.grimcraft;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import us.thinkplank.grimcraft.mobs.GrimcraftMobs;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
		GrimcraftBlocks.registerModels();
		GrimcraftItems.registerModels();
		GrimcraftMobs.registerModels();
	}
}
