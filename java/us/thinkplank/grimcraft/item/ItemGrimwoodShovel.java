package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemGrimwoodShovel extends ItemSpade {
    public ItemGrimwoodShovel(ToolMaterial material) {
        super(material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimWoodShovel");
    }
    
    public void registerItemIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:grimwoodshovel");
    }
}
