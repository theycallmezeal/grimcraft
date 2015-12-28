package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

// TODO does crop growth depend on water? how does it compare to wheat
// TODO can I disable crop growth in the overworld?

public class BlockBarleyCrop extends BlockCrops {
	private IIcon[] icons;
	
	public BlockBarleyCrop() {
		super();
		setStepSound(Block.soundTypeGrass);
		setBlockName("barley_crop");
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
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_) {
        this.icons = new IIcon[8];

        for (int i = 0; i < this.icons.length; ++i) {
            this.icons[i] = p_149651_1_.registerIcon("grimcraft:barley_crop_stage_" + i);
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        if (p_149691_2_ < 0 || p_149691_2_ > 7) {
            p_149691_2_ = 7;
        }

        return this.icons[p_149691_2_];
    }
}
