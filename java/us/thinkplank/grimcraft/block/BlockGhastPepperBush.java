package us.thinkplank.grimcraft.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IShearable;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGhastPepperBush extends BlockBush implements IShearable {
	
	public BlockGhastPepperBush () {
        setRegistryName("ghast_pepper_bush");
    }
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Nether;
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == GrimcraftBlocks.peat;
    }
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int meta, int fortune) {
		// this should not be reached if meta is 0 because of the event handler
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftItems.ghast_pepper));
		return ret;
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random)
    {
        int meta = world.getBlockMetadata(x, y, z);

        if (meta < 1 && random.nextInt(10) == 0)
        {
            meta++;
            world.setBlockMetadataWithNotify(x, y, z, meta, 2);
        }

        super.updateTick(world, x, y, z, random);
    }

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z) {
		return true;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftBlocks.ghast_pepper_bush));
		
		if (world.getBlockMetadata(x, y, z) != 0) {
			ret.add(new ItemStack(GrimcraftItems.ghast_pepper));
		}
		
		return ret;
	}
}
