package us.thinkplank.grimcraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.GrimcraftPlants;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemWitherBonemeal extends Item {
    public ItemWitherBonemeal() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("wither_bonemeal");
        setUnlocalizedName("wither_bonemeal");
    }
    
    //TODO check facing?
    @Override
    public EnumActionResult onItemUse(ItemStack itemStack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (itemStack == null) {
    		return EnumActionResult.FAIL;
    	} else if (player.canPlayerEdit(pos, facing, itemStack)) {
    		Block block = world.getBlockState(pos).getBlock();
    		
    		if (block.equals(Blocks.DEADBUSH)) {
    			if (world.getBlockState(pos.down()).getBlock().equals(GrimcraftBlocks.peat) && GrimcraftPlants.isSurroundedByLava(world, pos.down())) {
    				world.setBlockState(pos, GrimcraftBlocks.ghast_pepper_bush.getDefaultState());
    			} else {
    				world.setBlockState(pos, GrimcraftBlocks.vulpiberry_bush.getDefaultState());
    			}
    			world.playAuxSFX(2005, pos, 0);
    			itemStack.stackSize--;
    			return EnumActionResult.SUCCESS;
    		}
    		
    		if (block.equals(Blocks.NETHER_WART)) {
    			GrimcraftPlants.attemptTree(world, pos);
    			world.playAuxSFX(2005, pos, 0);
    			itemStack.stackSize--;
    			return EnumActionResult.SUCCESS;
    		}
    		
    		if (block.equals(GrimcraftBlocks.barley_crop) || block.equals(GrimcraftBlocks.netherroot_crop) || block.equals(Blocks.NETHER_WART)) {
    			IBlockState state = world.getBlockState(pos);
    			int currentGrowth = state.getValue(BlockCrops.AGE);
    			if (currentGrowth < 7) {
    				world.setBlockState(pos, state.withProperty(BlockCrops.AGE, currentGrowth + 1));
    			}
    			world.playAuxSFX(2005, pos, 0);
				itemStack.stackSize--;
				return EnumActionResult.SUCCESS;
    		}
    	}
    	return EnumActionResult.FAIL;
    }
}
