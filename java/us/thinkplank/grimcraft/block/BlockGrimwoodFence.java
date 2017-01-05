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
		super(Material.WOOD, MapColor.WOOD);
		setHardness(2F);
		setRegistryName("grimwood_fence");
	}
	
	@Override
	public boolean canConnectTo(IBlockAccess worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Material material = iblockstate.getMaterial();
        Block block = iblockstate.getBlock();
        return block == Blocks.BARRIER ? false : ((!(block instanceof BlockFence) || material != this.blockMaterial) && !(block instanceof BlockFenceGate) ? (material.isOpaque() && iblockstate.isFullCube() ? material != Material.GOURD : false) : true);
    }
}