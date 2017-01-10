package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockBarleyCrop extends BlockCrops {
    private static final AxisAlignedBB[] CROPS_AABB = new AxisAlignedBB[] {
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), 
    	new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)
    };

	public BlockBarleyCrop() {
		super();
		setRegistryName("barley_crop");
		setSoundType(SoundType.PLANT);
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state) {
        return state.getBlock() == GrimcraftBlocks.peat;
    }
	
	@Override
	protected Item getSeed() {
        return GrimcraftItems.barley_seeds;
    }

	@Override
    protected Item getCrop() {
        return GrimcraftItems.barley;
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
        return CROPS_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    }
}
