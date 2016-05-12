package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLavaLamp extends BlockGlowstone {
    public BlockLavaLamp () {
        super(Material.glass);
        setHardness(3F);
        setStepSound(Block.soundTypeGlass);
        setRegistryName("lava_lamp");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHarvestLevel("pickaxe", 1);
    }
    
    //TODO findItem()
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return GameRegistry.findItem("minecraft", "lava_bucket");
    }
}
