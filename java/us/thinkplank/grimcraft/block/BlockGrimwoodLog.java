package us.thinkplank.grimcraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockGrimwoodLog extends BlockLog {
	
	public BlockGrimwoodLog () {
        super();
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setBlockName("grimwood_log");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
    }
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		icons = new IIcon[2];
		icons[0] = iconRegister.registerIcon("grimcraft:grimwood_log_bottom");
		icons[1] = iconRegister.registerIcon("grimcraft:grimwood_log_side");
	}
	
	@SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int p_150161_1_)
    {
        return this.icons[0];
    }

	@SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int p_150163_1_)
    {
        return this.icons[1];
    }
}
