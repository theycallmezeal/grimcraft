package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemGrimwoodSword extends ItemHoe {
    public ItemGrimwoodSword(ToolMaterial material) {
        super(material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimwood_sword");
    }
    
    public void registerItemIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:grimwood_sword");
    }
}
