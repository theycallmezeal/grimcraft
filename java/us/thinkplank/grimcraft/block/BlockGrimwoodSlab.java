package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodSlab extends BlockSlab {
    public BlockGrimwoodSlab (boolean isDouble) {
        super(Material.wood);
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimwood_slab");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
    }
    
    public String func_150002_b(int p_150002_1_) {
        return super.getUnlocalizedName();
    }

	@Override
	public String getUnlocalizedName(int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IProperty getVariantProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getVariant(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}
}