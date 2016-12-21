package us.thinkplank.grimcraft.block;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockBush;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IShearable;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockGhastPepperBush extends BlockBush implements IShearable {
	public static final PropertyBool GROWN = PropertyBool.create("grown");
	
	public BlockGhastPepperBush() {
		setCreativeTab(CreativeTabs.DECORATIONS);
        setRegistryName("ghast_pepper_bush");
    }
	
    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, GROWN);
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (meta == 1) {
        	return getDefaultState().withProperty(GROWN, true);
        }
        return getDefaultState().withProperty(GROWN, false);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (state.getValue(GROWN)) {
        	return 1;
        }
        return 0;
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
		// TODO fortune?
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftBlocks.ghast_pepper_bush));
		if (state.getValue(GROWN)) {
			ret.add(new ItemStack(GrimcraftItems.ghast_pepper, 3));
		}
		return ret;
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
        if (state.getValue(GROWN) == false && random.nextInt(10) == 0) {
            worldIn.setBlockState(pos, state.withProperty(GROWN, true));
        }
    }

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftBlocks.ghast_pepper_bush));
		
		if (world.getBlockState(pos).getValue(GROWN) == true) {
			ret.add(new ItemStack(GrimcraftItems.ghast_pepper));
		}
		
		return ret;
	}
}
