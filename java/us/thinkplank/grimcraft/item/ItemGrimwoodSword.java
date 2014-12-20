package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemGrimwoodSword extends ItemHoe {
    public ItemGrimwoodSword(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("grimwood_sword");
    }
}
