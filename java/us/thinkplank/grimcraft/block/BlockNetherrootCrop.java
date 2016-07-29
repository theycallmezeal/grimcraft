package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockNetherrootCrop extends BlockCrops {
	
	public BlockNetherrootCrop() {
		super();
		setCreativeTab(CreativeTabs.tabDecorations);
		setStepSound(SoundType.PLANT);
		setRegistryName("netherroot_crop");
	}
	
	//TODO make every world argument worldIn
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos.down()).getBlock() == GrimcraftBlocks.peat;
    }
	
	protected Item func_149866_i() {
        return GrimcraftItems.netherroot;
    }

    protected Item func_149865_P() {
        return GrimcraftItems.netherroot;
    }
}
