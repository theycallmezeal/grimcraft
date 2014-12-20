package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBarleyCrop extends BlockCrops {
	
	public BlockBarleyCrop() {
		super();
		setStepSound(Block.soundTypeGrass);
		setUnlocalizedName("barley_crop");
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	protected boolean canPlaceBlockOn(Block block)
    {
        return block == GrimcraftBlocks.peat;
    }
	
	protected Item func_149866_i()
    {
        return GrimcraftItems.barley_seeds;
    }

    protected Item func_149865_P()
    {
        return GrimcraftItems.barley;
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
}
