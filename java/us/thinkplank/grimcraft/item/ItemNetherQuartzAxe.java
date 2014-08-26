package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemNetherQuartzAxe extends ItemAxe {
    public ItemNetherQuartzAxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_quartz_axe");
        setTextureName("grimcraft:nether_quartz_axe");
    }
}
