package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockNetherrootCrop extends BlockCrops {
    private static final AxisAlignedBB[] ROOT_AABB = new AxisAlignedBB[] {
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 
		new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)
    };

	public BlockNetherrootCrop() {
		super();
		setSoundType(SoundType.PLANT);
		setRegistryName("netherroot_crop");
	}
	
	@Override
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
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		if (worldIn.provider.getDimension() == -1) {
			/* super.super.updateTick() */
			this.checkAndDropBlock(worldIn, pos, state);
	        
			/* BlockCrops.updateTick() without light level check */
            int i = this.getAge(state);
            if (i < this.getMaxAge()) {
                float f = getGrowthChance(this, worldIn, pos) * 1.2F; /* 1.2x-ish growth rate boost */

                if (rand.nextInt((int)(25.0F / f) + 1) == 0) {
                    worldIn.setBlockState(pos, this.withAge(i + 1), 2);
                }
            }
		}
	}
	
	@Override
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
		/* BlockCrops.canBlockStay() without light level / sky visible check */
		IBlockState soil = worldIn.getBlockState(pos.down());
        return soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return ROOT_AABB[state.getValue(this.getAgeProperty()).intValue()];
    }
}
