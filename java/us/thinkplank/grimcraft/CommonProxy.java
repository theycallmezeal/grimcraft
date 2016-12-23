package us.thinkplank.grimcraft;

import net.minecraftforge.fml.common.registry.GameRegistry;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import us.thinkplank.grimcraft.mobs.GrimcraftMobs;

public class CommonProxy {
    public void preInit() {
    	GrimcraftBlocks.register();
        GrimcraftItems.register();
        GrimcraftRecipes.register();
        GrimcraftMobs.register();
        GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
        GameRegistry.registerWorldGenerator(new GrimcraftWorldGenerator(), 20);
    }
}
