package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemNetherGoldSword extends ItemSword {
    public ItemNetherGoldSword(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("nether_gold_sword");
        setTextureName("grimcraft:nether_gold_sword");
    }
}
