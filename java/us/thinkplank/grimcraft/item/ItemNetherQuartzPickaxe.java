package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemNetherQuartzPickaxe extends ItemPickaxe {
    public ItemNetherQuartzPickaxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_quartz_pickaxe");
        setTextureName("grimcraft:nether_quartz_pickaxe");
    }
}
