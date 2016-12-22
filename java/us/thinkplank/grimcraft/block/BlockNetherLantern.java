package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNetherLantern extends Block {
    public BlockNetherLantern () {
        super(Material.GLASS);
        setHardness(3F);
        setSoundType(SoundType.GLASS);
        setRegistryName("nether_lantern");
        setHarvestLevel("pickaxe", 1);
        setLightLevel(15F);
    }
}
