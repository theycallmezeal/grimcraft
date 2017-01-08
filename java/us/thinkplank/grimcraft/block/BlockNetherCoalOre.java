package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockNetherCoalOre extends Block {
    public BlockNetherCoalOre () {
        super(Material.ROCK);
        setHardness(3F);
        setSoundType(SoundType.STONE);
        setRegistryName("nether_coal_ore");
        setHarvestLevel("pickaxe", 1);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.COAL;
    }
}
