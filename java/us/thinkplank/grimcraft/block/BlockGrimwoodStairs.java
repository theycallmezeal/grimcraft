package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGrimwoodStairs extends BlockStairs {

	public BlockGrimwoodStairs() {
		super(GrimcraftBlocks.grimwood_planks, 0);
		setHardness(2F);
        setStepSound(SoundType.WOOD);
        setRegistryName("grimwood_stairs");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
	}
}
