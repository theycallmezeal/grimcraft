package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWitherBonemeal extends Item {
    public ItemWitherBonemeal() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("witherBonemeal");
        setTextureName("grimcraft:witherBonemeal");
    }
}
