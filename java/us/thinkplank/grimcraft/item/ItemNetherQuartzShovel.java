package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemNetherQuartzShovel extends ItemSpade {
    public ItemNetherQuartzShovel(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_quartz_shovel");
        setTextureName("grimcraft:nether_quartz_shovel");
    }
}