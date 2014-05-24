package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemGrimwoodAxe extends ItemAxe {
    public ItemGrimwoodAxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimwood_axe");
    }
    
    public void registerItemIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:grimwood_axe");
    }
}
