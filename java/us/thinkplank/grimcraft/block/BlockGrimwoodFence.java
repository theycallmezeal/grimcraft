package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockGrimwoodFence extends BlockFence {
	public BlockGrimwoodFence() {
		super(Material.wood, MapColor.woodColor);
		setHardness(2F);
		setRegistryName("grimwood_fence");
	}
	
	public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
		IBlockState blockState = worldIn.getBlockState(pos);
        Block block = blockState.getBlock();
        Material material = block.getMaterial(blockState);
        
        return block == Blocks.barrier ? false : ((!(block instanceof BlockGrimwoodFence) || material != this.blockMaterial)
        		&& !(block instanceof BlockFenceGate) ? (material.isOpaque()
        		&& blockState.isFullCube() ? material != Material.gourd : false) : true);
    }
}