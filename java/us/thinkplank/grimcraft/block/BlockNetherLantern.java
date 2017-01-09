package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherLantern extends Block {
    public BlockNetherLantern () {
        super(Material.GLASS);
        setHardness(3F);
        setSoundType(SoundType.GLASS);
        setRegistryName("nether_lantern");
        setHarvestLevel("pickaxe", 1);
        setLightLevel(1.0F);
    }
    
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }
    
    public boolean isOpaqueCube(IBlockState state) {
    	return false;
    }
}
