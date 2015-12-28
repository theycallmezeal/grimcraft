package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//TODO make sure all the food is edible!
//TODO give this a chance of setting you on fire? other funny uses?

public class ItemGhastPepper extends Item {
    public ItemGhastPepper() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ghast_pepper");
        setTextureName("grimcraft:ghast_pepper");
    }
}
