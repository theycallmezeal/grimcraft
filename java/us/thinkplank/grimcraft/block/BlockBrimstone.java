package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBrimstone extends Block {
    public BlockBrimstone () {
        super(Material.ROCK);
        setHardness(3F);
        setSoundType(SoundType.STONE);
        setRegistryName("brimstone_block");
        setHarvestLevel("pickaxe", 1);
    }
}
