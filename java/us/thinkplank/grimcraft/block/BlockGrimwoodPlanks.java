package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGrimwoodPlanks extends Block {
    public BlockGrimwoodPlanks () {
        super(Material.wood);
        setHardness(2F);
        setStepSound(SoundType.WOOD);
        setRegistryName("grimwood_planks");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
    }
}