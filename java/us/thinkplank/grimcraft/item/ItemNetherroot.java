package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemNetherroot extends ItemSeedFood {
    public ItemNetherroot() {
        super(4, 0.6F, GrimcraftBlocks.netherroot_crop, GrimcraftBlocks.peat);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("netherroot");
        setUnlocalizedName("netherroot");
    }
    
    @Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (facing != EnumFacing.UP) {
            return EnumActionResult.FAIL;
        } else if (playerIn.canPlayerEdit(pos, facing, stack) && playerIn.canPlayerEdit(pos.up(), facing, stack)) {
            if (worldIn.getBlockState(pos).getBlock().equals(GrimcraftBlocks.peat) && worldIn.getBlockState(pos.up()).getBlock().equals(Blocks.AIR)) {
            	worldIn.setBlockState(pos.up(), GrimcraftBlocks.netherroot_crop.getDefaultState());
                stack.stackSize--;
                return EnumActionResult.SUCCESS;
            } else {
            	return EnumActionResult.FAIL;
            }
        } else {
        	return EnumActionResult.FAIL;
        }
    }
}
