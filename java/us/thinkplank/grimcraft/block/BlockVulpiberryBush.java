package us.thinkplank.grimcraft.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IShearable;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockVulpiberryBush extends BlockBush implements IShearable {
	
	public BlockVulpiberryBush () {
        setRegistryName("vulpiberry_bush");
    }
	
	@Override
	public EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Nether;
	}
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos.down()).getBlock() == GrimcraftBlocks.peat;
    }
	
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		// this should not be reached if meta is 0 because of the event handler
		// TODO fortune?
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftItems.vulpiberry));
		return ret;
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		//TODO come back to this
//        if (meta < 1 && random.nextInt(10) == 0) {
//            meta++;
//            world.setBlockMetadataWithNotify(x, y, z, meta, 2);
//        }
    }

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftBlocks.vulpiberry_bush));
		//TODO come back for this
//		
//		if (world.getBlockMetadata(x, y, z) != 0) {
//			ret.add(new ItemStack(GrimcraftItems.ghast_pepper));
//		}
		
		return ret;
	}
}