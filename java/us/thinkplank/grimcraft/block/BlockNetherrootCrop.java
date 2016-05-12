package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockNetherrootCrop extends BlockCrops {
	
	public BlockNetherrootCrop() {
		super();
		setStepSound(Block.soundTypeGrass);
		setRegistryName("netherroot_crop");
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block block) {
        return block == GrimcraftBlocks.peat;
    }
	
	protected Item func_149866_i() {
        return GrimcraftItems.netherroot;
    }

    protected Item func_149865_P() {
        return GrimcraftItems.netherroot;
    }
}
