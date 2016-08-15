package us.thinkplank.grimcraft;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		super.preInit();
		GrimcraftBlocks.registerModels();
		GrimcraftItems.registerModels();
	}
}
