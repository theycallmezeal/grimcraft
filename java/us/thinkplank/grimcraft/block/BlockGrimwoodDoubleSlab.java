package us.thinkplank.grimcraft.block;

import net.minecraft.block.material.Material;

public class BlockGrimwoodDoubleSlab extends BlockGrimwoodSlab {
	public BlockGrimwoodDoubleSlab(Material material) {
		super(material);
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return "grimwood_double_slab";
	}

	@Override
	public boolean isDouble() {
		return true;
	}
}
