package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodLog extends BlockRotatedPillar {
	@SideOnly(Side.CLIENT)
	
	public BlockGrimwoodLog () {
        super(Material.WOOD);
        setHardness(2F);
        setSoundType(SoundType.WOOD);
        setRegistryName("grimwood_log");
        setHarvestLevel("axe", 0);
    }
}
