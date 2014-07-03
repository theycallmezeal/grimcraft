package us.thinkplank.grimcraft.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IIcon;

public class BlockBarleyCrop extends BlockCrops {
	private IIcon[] textures;
	
	public BlockBarleyCrop() {
		super();
		setHardness(3F);
		setStepSound(Block.soundTypeGrass);
		setBlockName("barley_crop");
	}
	
	protected boolean canPlaceBlockOn(Block block)
    {
        return block == Grimcraft.peat;
    }
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.textures = new IIcon[8];

        for (int i = 0; i < this.textures.length; ++i)
        {
            this.textures[i] = p_149651_1_.registerIcon(this.getTextureName() + "_stage_" + i);
        }
    }
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ > 7)
        {
            p_149691_2_ = 7;
        }

        return this.textures[p_149691_2_];
    }
	
	public Item getItemDropped(int wow, Random random, int somethingelse) {
		return Grimcraft.barley_seeds;
	}
}
