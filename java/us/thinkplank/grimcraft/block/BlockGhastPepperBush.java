package us.thinkplank.grimcraft.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IShearable;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGhastPepperBush extends BlockBush implements IShearable {
	
	public BlockGhastPepperBush () {
        setUnlocalizedName("ghast_pepper_bush");
    }
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Nether;
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == GrimcraftBlocks.peat;
    }
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, BlockPos pos, int meta, int fortune) {
		// this should not be reached if meta is 0 because of the event handler
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftItems.ghast_pepper));
		return ret;
	}
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        int meta = world.getBlockMetadata(pos);

        if (meta < 1 && rand.nextInt(10) == 0)
        {
            meta++;
            world.setBlockMetadataWithNotify(pos, meta, 2);
        }

        super.updateTick(world, pos, rand);
    }

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
		ret.add(new ItemStack(GrimcraftBlocks.ghast_pepper_bush));
		
		if (world.getBlockMetadata(pos) != 0) {
			ret.add(new ItemStack(GrimcraftItems.ghast_pepper));
		}
		
		return ret;
	}
}
