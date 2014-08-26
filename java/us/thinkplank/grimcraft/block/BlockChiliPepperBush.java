package us.thinkplank.grimcraft.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IShearable;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockChiliPepperBush extends BlockBush implements IShearable {
	private IIcon[] icons;
	
	public BlockChiliPepperBush () {
        setBlockName("chili_pepper_plant");
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
		ret.add(new ItemStack(GrimcraftItems.chili_pepper));
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
		ret.add(new ItemStack(GrimcraftBlocks.chili_pepper_plant));
		
		if (world.getBlockMetadata(x, y, z) != 0) {
			ret.add(new ItemStack(GrimcraftItems.chili_pepper));
		}
		
		return ret;
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
		this.icons = new IIcon[2];
		
        this.icons[0] = iconRegister.registerIcon("grimcraft:chili_pepper_bush_stage_0");
        this.icons[1] = iconRegister.registerIcon("grimcraft:chili_pepper_bush_stage_1");
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta];
	}
}
