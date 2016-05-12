package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBarleyCrop extends BlockCrops {
	
	public BlockBarleyCrop() {
		super();
		setStepSound(SoundType.PLANT);
		setRegistryName("barley_crop");
	}
	
	protected boolean canPlaceBlockOn(Block block) {
        return block == GrimcraftBlocks.peat;
    }
	
	@Override
	protected Item func_149866_i() {
        return GrimcraftItems.barley_seeds;
    }
	
	@Override
    protected Item func_149865_P() {
        return GrimcraftItems.barley;
    }
	
	@Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
		if (world.provider.dimensionId == -1) {
			super.updateTick(world, x, y, z, rand);
		}
	}
}
