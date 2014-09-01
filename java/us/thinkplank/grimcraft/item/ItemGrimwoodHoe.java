package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemGrimwoodHoe extends ItemHoe {
    public ItemGrimwoodHoe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimwood_hoe");
        setTextureName("grimcraft:grimwood_hoe");
    }
}
