package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import us.thinkplank.grimcraft.GrimcraftPlants;

public class BlockPeat extends BlockFalling {
	
    public BlockPeat () {
        super(Material.GLASS);
        setHardness(3F);
        setSoundType(SoundType.GROUND);
        setRegistryName("peat");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHarvestLevel("shovel", 0);
        setTickRandomly(true);
    }
    
    @Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);
    }
    
    @Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        entityIn.motionX *= 0.4D;
        entityIn.motionZ *= 0.4D;
    }
    
    @Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        super.updateTick(worldIn, pos, state, rand);
        IBlockState blockStateAbove = worldIn.getBlockState(pos.up());
        
        if (blockStateAbove.getBlock().equals(Blocks.NETHER_WART)
        		&& blockStateAbove.getValue(BlockNetherWart.AGE) > 0) { //check if the nether wart has grown a little bit
    		GrimcraftPlants.attemptTree(worldIn, pos.up());
    	}
    }
    
    @Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
    	Block plant = plantable.getPlant(world, pos).getBlock();
    	
    	if (plant.equals(GrimcraftBlocks.barley_crop)
    			|| plant.equals(GrimcraftBlocks.netherroot_crop)
    			|| plant.equals(Blocks.NETHER_WART)
    			|| plant.equals(GrimcraftBlocks.vulpiberry_bush)
    			|| plant.equals(GrimcraftBlocks.ghast_pepper_bush)
    			|| plant.equals(Blocks.DEADBUSH)) {
    		return true;
    	}
    	
    	return false;
    }
}
