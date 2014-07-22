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

public class BlockBeetrootCrop extends BlockCrops {
	private IIcon[] field_149867_a;
	
	public BlockBeetrootCrop() {
		super();
		setHardness(3F);
		setStepSound(Block.soundTypeGrass);
		setBlockName("beetroot_crop");
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	protected boolean canPlaceBlockOn(Block block)
    {
        return block instanceof BlockPeat;
    }
	
	protected Item func_149866_i()
    {
        return Grimcraft.beetroot;
    }

    protected Item func_149865_P()
    {
        return Grimcraft.beetroot;
    }
}
