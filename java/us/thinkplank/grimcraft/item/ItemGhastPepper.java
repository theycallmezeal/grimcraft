package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGhastPepper extends Item {
    public ItemGhastPepper() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ghast_pepper");
        setTextureName("grimcraft:ghast_pepper");
    }
}
