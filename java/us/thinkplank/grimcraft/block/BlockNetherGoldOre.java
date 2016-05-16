package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNetherGoldOre extends Block {
    public BlockNetherGoldOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(SoundType.STONE);
        setRegistryName("nether_gold_ore");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }
}
