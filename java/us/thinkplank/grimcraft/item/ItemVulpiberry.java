package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemVulpiberry extends ItemFood {
    public ItemVulpiberry() {
        super(1, 0.1F, false);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("vulpiberry");
        setTextureName("grimcraft:vulpiberry");
    }
}
