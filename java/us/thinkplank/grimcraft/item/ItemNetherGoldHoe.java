package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemNetherGoldHoe extends ItemHoe {
    public ItemNetherGoldHoe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_gold_hoe");
        setTextureName("grimcraft:nether_gold_hoe");
    }
}
