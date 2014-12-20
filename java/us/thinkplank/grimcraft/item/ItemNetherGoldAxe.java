package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemNetherGoldAxe extends ItemAxe {
    public ItemNetherGoldAxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_gold_axe");
    }
}
