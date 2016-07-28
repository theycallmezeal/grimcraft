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
        super(Material.glass);
        setHardness(3F);
        setStepSound(SoundType.GLASS);
        setRegistryName("lava_lamp");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHarvestLevel("pickaxe", 1);
    }
    
    //TODO findItem()
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Items.lava_bucket;
    }
}
