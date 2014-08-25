package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ItemNetherrackShovel extends ItemSpade {
    public ItemNetherrackShovel(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("netherrack_shovel");
        setTextureName("grimcraft:netherrack_shovel");
    }
}