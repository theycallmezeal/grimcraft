package us.thinkplank.grimcraft;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

//helper class for some plants methods
public class GrimcraftPlants {
    public static void attemptTree(World world, BlockPos pos) {
    	if (isSurroundedByLava(world, pos.down())) {
    		growTree(world, pos);
    	}
    }
    
    public static boolean isSurroundedByLava(World world, BlockPos pos) {
    	int lava = 0;
    	if (isLava(world, pos.north()) &&
    		isLava(world, pos.north().east()) &&
    		isLava(world, pos.east()) &&
    		isLava(world, pos.south().east()) &&
    		isLava(world, pos.south()) &&
    		isLava(world, pos.south().west()) &&
    		isLava(world, pos.west()) &&
    		isLava(world, pos.north().west()) ) {
    		return true;
    	}
    	return false;
    }
    
    private static boolean isLava(World world, BlockPos pos) {
    	if (world.getBlockState(pos).getBlock().equals(Blocks.LAVA)) {
    		return true;
    	}
    	return false;
    }
    
    private static void growTree(World world, BlockPos pos) {
    	int random = (int)(Math.random() * 4) + 3; // 3, 4, 5, or 6... if I did the math right.
    	for (int i = 0; i < random; i++) {
    		Block block = world.getBlockState(pos.up(i)).getBlock();
    		if (block.equals(Blocks.AIR) || block.equals(Blocks.NETHER_WART)) {
        		world.setBlockState(pos.up(i), GrimcraftBlocks.grimwood_log.getDefaultState());
        	} else {
        		return;
        	}
    	}
    }
    
    public static EnumActionResult attemptCrop(Block crop, Block ground, ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (facing != EnumFacing.UP) {
            return EnumActionResult.FAIL;
        } else if (playerIn.canPlayerEdit(pos, facing, stack) && playerIn.canPlayerEdit(pos.up(), facing, stack)) {
            if (worldIn.getBlockState(pos).getBlock().equals(ground) && worldIn.getBlockState(pos.up()).getBlock().equals(Blocks.AIR)) {
            	worldIn.setBlockState(pos.up(), crop.getDefaultState());
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
