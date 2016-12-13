package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodLog extends BlockOldLog {
	@SideOnly(Side.CLIENT)
	
	public BlockGrimwoodLog () {
        super();
        setHardness(2F);
        setSoundType(SoundType.WOOD);
        setRegistryName("grimwood_log");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHarvestLevel("axe", 0);
    }
}
