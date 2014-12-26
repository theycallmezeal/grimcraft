package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodFenceGate extends BlockFenceGate {
	public BlockGrimwoodFenceGate() {
		super();
		setHardness(2F);
		setUnlocalizedName("grimwood_fence_gate");
	}
}
