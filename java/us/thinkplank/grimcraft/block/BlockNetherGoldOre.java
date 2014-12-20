package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherGoldOre extends Block {
    public BlockNetherGoldOre () {
        super(Material.rock);
        setHardness(3F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("nether_gold_ore");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:nether_gold_ore");
    }
}
