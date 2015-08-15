package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrimwoodFenceGate extends BlockFenceGate {
	public BlockGrimwoodFenceGate() {
		super();
		setHardness(2F);
		setBlockName("grimwood_fence_gate");
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return GrimcraftBlocks.grimwood_planks.getBlockTextureFromSide(side);
    }
}
