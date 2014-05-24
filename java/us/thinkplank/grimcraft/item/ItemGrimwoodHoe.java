package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemGrimwoodHoe extends ItemHoe {
    public ItemGrimwoodHoe(ToolMaterial material) {
        super(material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimWoodHoe");
    }
    
    public void registerItemIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:grimwoodhoe");
    }
}
