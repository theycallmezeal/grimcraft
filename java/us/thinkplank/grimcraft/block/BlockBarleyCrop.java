package us.thinkplank.grimcraft.block;

import java.util.ArrayList;
import java.util.Random;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBarleyCrop extends BlockCrops {
	private IIcon[] icons;
	
	public BlockBarleyCrop() {
		super();
		setStepSound(Block.soundTypeGrass);
		setBlockName("barley_crop");
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	protected boolean canPlaceBlockOn(Block block)
    {
        return block == Grimcraft.peat;
    }
	
	protected Item func_149866_i()
    {
        return Grimcraft.barley_seeds;
    }

    protected Item func_149865_P()
    {
        return Grimcraft.barley;
    }
    
    //i think i have to override this to alter light requirement
//    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
//    {
//        super.updateTick(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);
//
//        if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 4)
//        {
//            int l = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);
//
//            if (l < 7)
//            {
//                float f = this.func_149864_n(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
//
//                if (p_149674_5_.nextInt((int)(25.0F / f) + 1) == 0)
//                {
//                    ++l;
//                    p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, l, 2);
//                }
//            }
//        }
//    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.icons = new IIcon[8];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = p_149651_1_.registerIcon("grimcraft:barley_crop_stage_" + i);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ > 7)
        {
            p_149691_2_ = 7;
        }

        return this.icons[p_149691_2_];
    }
}
