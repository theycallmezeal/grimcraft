package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemGrimwoodPickaxe extends ItemPickaxe {
    public ItemGrimwoodPickaxe(ToolMaterial material) {
        super(material);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("grimWoodPickaxe");
    }
    
    public void registerItemIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:grimwoodpickaxe");
    }
}
