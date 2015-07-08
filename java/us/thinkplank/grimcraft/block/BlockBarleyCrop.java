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
	}
	
	protected boolean canPlaceBlockOn(Block block) {
        return block == GrimcraftBlocks.peat;
    }
	
	protected Item getSeed() {
        return GrimcraftItems.barley_seeds;
    }

    protected Item getCrop() {
        return GrimcraftItems.barley;
    }
    
    //TODO make it grow in less light
}
