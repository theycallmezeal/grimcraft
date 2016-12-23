package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGrimwoodStairs extends BlockStairs {

	public BlockGrimwoodStairs() {
		super(GrimcraftBlocks.grimwood_planks.getDefaultState());
		setHardness(2F);
        setSoundType(SoundType.WOOD);
        setRegistryName("grimwood_stairs");
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
	}
}
