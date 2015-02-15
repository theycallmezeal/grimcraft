package us.thinkplank.grimcraft.block;

import java.util.Random;

import us.thinkplank.grimcraft.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class BlockGrimwoodSlab extends BlockSlab {
	private static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
	private static final int HALF_META_BIT = 8;

	public BlockGrimwoodSlab() {
        super(Material.wood);
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimwood_slab");
        if (!this.isDouble()) {
        	setCreativeTab(CreativeTabs.tabBlock);
        }
        setHarvestLevel("axe", 0);
        setLightOpacity(0);
    }

	public final String getId() {
		return this.innerGetId(this.isDouble());
	}

	@Override
	public final String getUnlocalizedName(final int metadata) {
	    return this.getUnlocalizedName();
	}
	
	@Override
	public final Object getVariant(final ItemStack itemStack) {
	    return false;
	}
	
	@Override
	public final IProperty getVariantProperty() {
	    return VARIANT_PROPERTY;
	}
	
	@Override
	public final IBlockState getStateFromMeta(final int meta) {
	    IBlockState blockState = this.getDefaultState();
	    blockState = blockState.withProperty(VARIANT_PROPERTY, false);
	    if (!this.isDouble()) {
	        EnumBlockHalf value = EnumBlockHalf.BOTTOM;
	        if ((meta & HALF_META_BIT) != 0) {
	            value = EnumBlockHalf.TOP;
	        }
	
	        blockState = blockState.withProperty(HALF, value);
	    }
	
	    return blockState;
	}
	
	@Override
	public final int getMetaFromState(IBlockState state) {
	    if (this.isDouble()) {
	       return 0;
	    }
	
	    if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
	        return HALF_META_BIT;
	    } else {
	        return 0;
	    }
	}
	
	@Override
	public final int damageDropped(IBlockState state) {
	    return 0;
	}
	
	@Override
	public Item getItemDropped(IBlockState blockState, Random random,
	    final int unused) {
	    String blockId = this.innerGetId(false);
	    return GameRegistry.findItem("grimcraft", blockId);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Item getItem(World world, BlockPos blockPos) {
	    String blockId = this.innerGetId(false);
	    return GameRegistry.findItem("grimcraft", blockId);
	    //TODO make this string not hardcoded
	}
	
	@Override
	protected final BlockState createBlockState() {
	    if (this.isDouble()) {
	        return new BlockState(this, new IProperty[] {VARIANT_PROPERTY});
	    } else {
	        return new BlockState(this,new IProperty[] {VARIANT_PROPERTY, HALF});
	    }
	}
	
	private String innerGetId(boolean isDoubleStacked) {
	    if (isDoubleStacked) {
	        return "double_grimwood_slab";
	    }
	    return "single_grimwood_slab";
	}
}