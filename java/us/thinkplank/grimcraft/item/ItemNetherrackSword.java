package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemNetherrackSword extends ItemSword {
    public ItemNetherrackSword(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("netherrack_sword");
        setTextureName("grimcraft:netherrack_sword");
    }
}
