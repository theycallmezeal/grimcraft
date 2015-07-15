package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNetherroot extends ItemSeedFood {
    public ItemNetherroot() {
        super(4, 0.6F, GrimcraftBlocks.netherroot_crop, GrimcraftBlocks.peat);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("netherroot");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("grimcraft:netherroot");
    }
    
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
    	if (itemStack == null) {
    		return false;
    	} else if (player.canPlayerEdit(x, y, z, par7, itemStack)) {
    		if (world.getBlock(x, y, z) == GrimcraftBlocks.peat) {
    			world.setBlock(x, y + 1, z, GrimcraftBlocks.netherroot_crop);
				itemStack.stackSize--;
				return true;
    		}
    	}
    	return false;
    }
}
