package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemStrawberry extends ItemFood {
    public ItemStrawberry() {
        super(1, 0.1F, false);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("strawberry");
        setTextureName("grimcraft:strawberry");
    }
}
