package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSoup;

//TODO make sure this returns a bowl once you eat it

public class ItemNetherRootSoup extends ItemSoup {
    public ItemNetherRootSoup() {
        super(6); // 6 = hunger points
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("netherrootsoup");
        setTextureName("grimcraft:netherrootsoup");
    }
}