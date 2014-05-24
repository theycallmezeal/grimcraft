package us.thinkplank.grimcraft.block;

import us.thinkplank.grimcraft.Grimcraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGrimwoodStairs extends BlockStairs {

	public BlockGrimwoodStairs() {
		super(Grimcraft.grimwood_planks, 0);
		setHardness(3F);
        setStepSound(Block.soundTypeWood);
        setBlockName("grimwood_stairs");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:grimwood_planks");
    }
}
