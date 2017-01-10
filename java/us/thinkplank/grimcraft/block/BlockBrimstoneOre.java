package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockBrimstoneOre extends Block {
    public BlockBrimstoneOre () {
        super(Material.ROCK);
        setHardness(3F);
        setSoundType(SoundType.STONE);
        setRegistryName("brimstone_ore");
        setHarvestLevel("pickaxe", 1);
    }

    @Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return GrimcraftItems.brimstone;
    }

    @Override
	public int quantityDropped(Random random) {
        return random.nextInt(5) + 4;
    }
}
