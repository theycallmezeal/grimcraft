package us.thinkplank.grimcraft.block;

import net.minecraft.block.material.Material;

public class BlockGrimwoodHalfSlab extends BlockGrimwoodSlab {

	public BlockGrimwoodHalfSlab(Material material) {
		super(material);
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return "grimwood_half_slab";
	}

	@Override
	public boolean isDouble() {
		return false;
	}
}
