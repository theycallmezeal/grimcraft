package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrimWoodSlab extends BlockSlab {
    public BlockGrimWoodSlab (boolean isDouble) {
        super(isDouble, Material.wood);
        setHardness(3F);
        setStepSound(Block.soundTypeWood);
        setBlockName("grimwood_slab");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:grimwoodplanks");
    }
    
    public String func_150002_b(int p_150002_1_) {
        return super.getUnlocalizedName();
    }
}
