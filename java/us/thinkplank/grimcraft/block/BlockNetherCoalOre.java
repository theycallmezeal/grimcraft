package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherCoalOre extends Block {
    public BlockNetherCoalOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setBlockName("nether_coal_ore");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Items.coal;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:nether_coal_ore");
    }
}
