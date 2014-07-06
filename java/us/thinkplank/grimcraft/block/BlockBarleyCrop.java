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

public class BlockBarleyCrop extends BlockCrops {
	private IIcon[] textures;
	
	public BlockBarleyCrop() {
		super();
		setHardness(3F);
		setStepSound(Block.soundTypeGrass);
		setBlockName("barley_crop");
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	protected boolean canPlaceBlockOn(Block block)
    {
        return block == Grimcraft.peat;
    }
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.textures = new IIcon[8];

        for (int i = 0; i < this.textures.length; ++i)
        {
            this.textures[i] = iconRegister.registerIcon("grimcraft:barley_stage_" + i);
        }
    }
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
    {
        if (metadata < 7)
        {
            if (metadata == 6)
            {
                metadata = 5;
            }

            return this.textures[metadata >> 1];
        }
        else
        {
            return this.textures[3];
        }
    }
	
	protected Item func_149866_i()
    {
        return Grimcraft.barley_seeds;
    }

    protected Item func_149865_P()
    {
        return Grimcraft.barley;
    }
}
