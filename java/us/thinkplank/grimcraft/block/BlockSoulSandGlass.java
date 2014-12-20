package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSoulSandGlass extends Block {
    public BlockSoulSandGlass () {
        // super(Material.glass, true);
    	super(Material.glass);
        setHardness(3F);
        setStepSound(Block.soundTypeGlass);
        setUnlocalizedName("soul_sand_glass");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHarvestLevel("pickaxe", 1);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return null;
    }
}
