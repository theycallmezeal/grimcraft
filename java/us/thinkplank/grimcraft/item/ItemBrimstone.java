package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBrimstone extends Item {
    public ItemBrimstone() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("sulfur");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:sulfur");
    }
}
