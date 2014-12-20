package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodLog extends BlockLog {
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public BlockGrimwoodLog () {
        super();
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimwood_log");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
    }
	
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
