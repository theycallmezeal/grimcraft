package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemBarleySeeds extends ItemSeeds {
    public ItemBarleySeeds() {
        super(GrimcraftBlocks.barley_crop, GrimcraftBlocks.peat);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("barley_seeds");
    }
    
    //TODO refactor this
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
            if (par3World.getBlock(par4, par5, par6) == GrimcraftBlocks.peat && par3World.isAirBlock(new BlockPos(par4, par5 + 1, par6)))
            {
                par3World.setBlock(par4, par5 + 1, par6, GrimcraftBlocks.barley_crop);
                par1ItemStack.stackSize--;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
