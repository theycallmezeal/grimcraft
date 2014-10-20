package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class BlockGrimwoodFence extends BlockFence {
	public BlockGrimwoodFence() {
		super("grimcraft:grimwood_planks", Material.wood);
		setHardness(2F);
		setBlockName("grimwood_fence");
	}
	
	public boolean canConnectFenceTo(IBlockAccess blockAccess, int x, int y, int z)
    {
        Block block = blockAccess.getBlock(x, y, z);
        return block != this && block != GrimcraftBlocks.grimwood_fence_gate ? (block.getMaterial().isOpaque() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false) : true;
    }
}