package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLavaLamp extends BlockGlowstone {
    public BlockLavaLamp () {
        super(Material.GLASS);
        setHardness(3F);
        setSoundType(SoundType.GLASS);
        setRegistryName("lava_lamp");
        setHarvestLevel("pickaxe", 1);
    }
}
