package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherGoldOre extends Block {
    public BlockNetherGoldOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setBlockName("nether_gold_ore");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }
}
