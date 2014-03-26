package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemStrawberry extends Item {
    public ItemStrawberry() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("strawberry");
        setTextureName("grimcraft:strawberry");
    }
}
