package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemNetherGoldPickaxe extends ItemPickaxe {
    public ItemNetherGoldPickaxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("nether_gold_pickaxe");
        setTextureName("grimcraft:nether_gold_pickaxe");
    }
}
