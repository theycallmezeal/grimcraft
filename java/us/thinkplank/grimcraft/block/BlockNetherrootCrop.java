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

public class BlockNetherrootCrop extends BlockCrops {
	
	public BlockNetherrootCrop() {
		super();
		setSoundType(SoundType.PLANT);
		setRegistryName("netherroot_crop");
	}
	
	protected boolean canSustainBush(IBlockState state) {
        return state.getBlock() == GrimcraftBlocks.peat;
    }
	
	@Override
	protected Item getSeed() {
        return GrimcraftItems.netherroot;
    }

	@Override
    protected Item getCrop() {
		return GrimcraftItems.netherroot;
    }
	
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (worldIn.provider.getDimension() == -1) {
			super.updateTick(worldIn, pos, state, rand);
		}
	}
}
