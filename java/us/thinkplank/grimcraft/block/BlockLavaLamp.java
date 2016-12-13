package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockLavaLamp extends BlockGlowstone {
    public BlockLavaLamp () {
        super(Material.GLASS);
        setHardness(3F);
        setSoundType(SoundType.GLASS);
        setRegistryName("lava_lamp");
        setCreativeTab(CreativeTabs.DECORATIONS);
        setHarvestLevel("pickaxe", 1);
    }
}
