package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemNetherQuartzHoe extends ItemHoe {
    public ItemNetherQuartzHoe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_quartz_hoe");
        setTextureName("grimcraft:nether_quartz_hoe");
    }
}
