package us.thinkplank.grimcraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class CommonProxy {
    public void preInit() {
    	GrimcraftBlocks.register();
        GrimcraftItems.register();
        GrimcraftRecipes.register();
        GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
        GameRegistry.registerWorldGenerator(new GrimcraftWorldGenerator(), 20);
    }
}
