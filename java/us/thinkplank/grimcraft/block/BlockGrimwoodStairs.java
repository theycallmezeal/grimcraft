package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodStairs extends BlockStairs {
	public BlockGrimwoodStairs() {
		super(GrimcraftBlocks.grimwood_planks.getStateFromMeta(0));
		setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimwood_stairs");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
	}
}
