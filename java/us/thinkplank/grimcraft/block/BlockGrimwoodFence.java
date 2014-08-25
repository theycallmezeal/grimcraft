package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;

public class BlockGrimwoodFence extends BlockFence {
	public BlockGrimwoodFence() {
		super("grimcraft:grimwood_planks", Material.wood);
		setBlockName("grimwood_fence");
		setCreativeTab(CreativeTabs.tabDecorations);
	}
	
	public boolean canConnectFenceTo(IBlockAccess blockAccess, int x, int y, int z)
    {
        Block block = blockAccess.getBlock(x, y, z);
        return block != this && block != Blocks.fence_gate ? (block.getMaterial().isOpaque() && block.renderAsNormalBlock() ? block.getMaterial() != Material.gourd : false) : true;
    }
}
