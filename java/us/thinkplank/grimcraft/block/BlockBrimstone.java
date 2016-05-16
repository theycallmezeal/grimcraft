package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBrimstone extends Block {
    public BlockBrimstone () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(SoundType.STONE);
        setRegistryName("brimstone_block");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }
}
