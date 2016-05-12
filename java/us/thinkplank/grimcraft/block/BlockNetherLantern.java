package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherLantern extends Block {
    public BlockNetherLantern () {
        super(Material.glass);
        setHardness(3F);
        setStepSound(Block.soundTypeGlass);
        setRegistryName("nether_lantern");
        setCreativeTab(CreativeTabs.tabDecorations);
        setHarvestLevel("pickaxe", 1);
        setLightLevel(15F);
    }
}
