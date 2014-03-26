package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGrimWoodStick extends Item {
    public ItemGrimWoodStick() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("grimWoodStick");
        setTextureName("grimcraft:grimwoodstick");
    }
}
