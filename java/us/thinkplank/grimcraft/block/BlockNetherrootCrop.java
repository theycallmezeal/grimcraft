package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherrootCrop extends BlockCrops {
	
	public BlockNetherrootCrop() {
		super();
		setStepSound(Block.soundTypeGrass);
		setUnlocalizedName("netherroot_crop");
	}
	
	protected boolean canPlaceBlockOn(Block block) {
        return block == GrimcraftBlocks.peat;
    }
	
	protected Item getSeed() {
        return GrimcraftItems.netherroot;
    }

    protected Item getCrop() {
        return GrimcraftItems.netherroot;
    }
}
