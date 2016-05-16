package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNetherLantern extends Block {
    public BlockNetherLantern () {
        super(Material.glass);
        setHardness(3F);
        setStepSound(SoundType.GLASS);
        setRegistryName("nether_lantern");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(15F);
    }
}
