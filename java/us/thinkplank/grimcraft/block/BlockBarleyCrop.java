package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockBarleyCrop extends BlockCrops {
	
	public BlockBarleyCrop() {
		super();
		setRegistryName("barley_crop");
		setSoundType(SoundType.PLANT);
	}
	
	protected boolean canPlaceBlockOn(Block block) {
        return block == GrimcraftBlocks.peat;
    }
	
	@Override
	protected Item getSeed() {
        return Items.WHEAT_SEEDS;
    }

	@Override
    protected Item getCrop() {
        return Items.WHEAT;
    }
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (worldIn.provider.getDimension() == -1) {
			super.updateTick(worldIn, pos, state, rand);
		}
	}
}
