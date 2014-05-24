package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemChiliPepper extends Item {
    public ItemChiliPepper() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("chili_pepper");
        setTextureName("grimcraft:chili_pepper");
    }
}
