package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGrimwoodSlab extends BlockSlab {
    public BlockGrimwoodSlab (boolean isDouble) {
        super(isDouble, Material.wood);
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setBlockName("grimwood_slab");
        if (!isDouble) {
        	setCreativeTab(CreativeTabs.tabBlock);
        }
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:grimwood_planks");
    }
    
    @Override
    public String func_150002_b(int p_150002_1_) {
        return getUnlocalizedName();
    }
    
    @Override
    public int getDamageValue(World p_149643_1_, int p_149643_2_, int p_149643_3_, int p_149643_4_) {
        return super.getDamageValue(p_149643_1_, p_149643_2_, p_149643_3_, p_149643_4_) & 7;
    }
    
    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z, EntityPlayer player) {
    	return new ItemStack(GrimcraftBlocks.single_grimwood_slab);
    }
}