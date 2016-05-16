package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockBrimstoneOre extends Block {
    public BlockBrimstoneOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(SoundType.STONE);
        setRegistryName("brimstone_ore");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return GrimcraftItems.brimstone;
    }

    public int quantityDropped(Random random) {
        return random.nextInt(5) + 4;
    }
}
