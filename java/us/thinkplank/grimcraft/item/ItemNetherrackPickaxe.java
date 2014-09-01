package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemNetherrackPickaxe extends ItemPickaxe {
    public ItemNetherrackPickaxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("netherrack_pickaxe");
        setTextureName("grimcraft:netherrack_pickaxe");
    }
}
