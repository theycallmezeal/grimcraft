package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPhoenixEgg extends Item {
    public ItemPhoenixEgg() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("phoenixEgg");
        setTextureName("grimcraft:phoenixegg");
    }
}
