package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

//TODO give this a chance of setting you on fire? other funny uses?

public class ItemGhastPepper extends ItemFood {
    public ItemGhastPepper() {
        super(2, 0.8F, false);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ghast_pepper");
        setTextureName("grimcraft:ghast_pepper");
    }
}
