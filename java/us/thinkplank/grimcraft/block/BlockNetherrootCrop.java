package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockNetherrootCrop extends BlockCrops {
	private IIcon[] icons;
	
	public BlockNetherrootCrop() {
		super();
		setStepSound(Block.soundTypeGrass);
		setBlockName("netherroot_crop");
		setCreativeTab(CreativeTabs.tabFood);
	}
	
	protected boolean canPlaceBlockOn(Block block) {
        return block == GrimcraftBlocks.peat;
    }
	
	protected Item func_149866_i() {
        return GrimcraftItems.netherroot;
    }

    protected Item func_149865_P() {
        return GrimcraftItems.netherroot;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.icons = new IIcon[4];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = p_149651_1_.registerIcon("grimcraft:netherroot_crop_stage_" + i);
        }
    }
    
    public IIcon getIcon(int side, int meta) {
        if (meta < 7)
        {
            if (meta == 6)
            {
                meta = 5;
            }

            return this.icons[meta >> 1];
        }
        else
        {
            return this.icons[3];
        }
    }
}
