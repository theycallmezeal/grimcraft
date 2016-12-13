package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGrimwoodFenceGate extends BlockFenceGate {
	public BlockGrimwoodFenceGate() {
		super(BlockPlanks.EnumType.OAK); //TODO does this screw anything up?
		setHardness(2F);
		setCreativeTab(CreativeTabs.DECORATIONS);
		setRegistryName("grimwood_fence_gate");
	}
}
