package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherRedstoneOre extends Block {
    public BlockNetherRedstoneOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("nether_redstone_ore");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return GameRegistry.findItem("minecraft", "redstone");
    }

    public int quantityDropped(Random random) {
        return random.nextInt(2) + 4;
    }
}
