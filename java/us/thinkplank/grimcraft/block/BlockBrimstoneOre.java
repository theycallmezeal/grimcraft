package us.thinkplank.grimcraft.block;

import java.util.Random;

import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBrimstoneOre extends Block {
    public BlockBrimstoneOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("brimstone_ore");
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
