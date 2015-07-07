package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodLog extends BlockNewLog {
	@SideOnly(Side.CLIENT)
	
	public BlockGrimwoodLog () {
        super();
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimwood_log");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
    }
}
