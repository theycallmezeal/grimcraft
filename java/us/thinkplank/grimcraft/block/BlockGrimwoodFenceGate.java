package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.util.IIcon;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodFenceGate extends BlockFenceGate {
	public BlockGrimwoodFenceGate() {
		super();
		setHardness(2F);
		setRegistryName("grimwood_fence_gate");
	}
}
