package us.thinkplank.grimcraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
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
        setRegistryName("wither_bonemeal");
    }
    
    @Override
    public EnumActionResult onItemUse(ItemStack itemStack, EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (itemStack == null) {
    		return EnumActionResult.FAIL;
    	} else if (player.dimension == -1 && player.canPlayerEdit(pos, facing, itemStack)) {
    		Block block = worldIn.getBlockState(pos).getBlock();
    		
    		if (block == Blocks.DEADBUSH) {
    			if (worldIn.getBlockState(pos.down()).getBlock() == GrimcraftBlocks.peat && GrimcraftPlants.isSurroundedByLava(worldIn, pos.down())) {
    				worldIn.setBlockState(pos, GrimcraftBlocks.ghast_pepper_bush.getDefaultState());
    			} else {
    				worldIn.setBlockState(pos, GrimcraftBlocks.vulpiberry_bush.getDefaultState());
    			}
    			ItemDye.spawnBonemealParticles(worldIn, pos, 15);
    			itemStack.stackSize--;
    			return EnumActionResult.SUCCESS;
    		}
    		
    		if (block == Blocks.NETHER_WART) {
    			GrimcraftPlants.attemptTree(worldIn, pos);
    			ItemDye.spawnBonemealParticles(worldIn, pos, 15);
    			itemStack.stackSize--;
    			return EnumActionResult.SUCCESS;
    		}
    		
    		if (block == GrimcraftBlocks.barley_crop || block == GrimcraftBlocks.netherroot_crop || block == Blocks.NETHER_WART) {
    			IBlockState state = worldIn.getBlockState(pos);
    			int currentGrowth = state.getValue(BlockCrops.AGE);
    			if (currentGrowth < 7) {
    				worldIn.setBlockState(pos, state.withProperty(BlockCrops.AGE, currentGrowth + 1));
    			}
    			ItemDye.spawnBonemealParticles(worldIn, pos, 15);
				itemStack.stackSize--;
				return EnumActionResult.SUCCESS;
    		}
    	}
    	return EnumActionResult.FAIL;
    }
}
