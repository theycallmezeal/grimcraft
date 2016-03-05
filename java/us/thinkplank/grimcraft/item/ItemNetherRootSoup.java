package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSoup;

public class ItemNetherRootSoup extends ItemSoup {
    public ItemNetherRootSoup() {
        super(6); // 6 = hunger points
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("netherroot_soup");
        setTextureName("grimcraft:netherroot_soup");
    }
}