package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemNetherQuartzSword extends ItemSword {
    public ItemNetherQuartzSword(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName("nether_quartz_sword");
        setTextureName("grimcraft:nether_quartz_sword");
    }
}
