package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemTOOLTYPE;

public class ItemCAMELCASE_NAME extends ItemTOOLTYPE {
    public ItemCAMELCASE_NAME(ToolMaterial material) {
        super(material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("UNDERSCORED_NAME");
    }
    
    public void registerItemIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:UNDERSCORED_NAME");
    }
}
