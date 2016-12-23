package us.thinkplank.grimcraft.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class BlockGrimwoodSlab extends BlockSlab {
    public static final PropertyEnum<BlockGrimwoodSlab.Variant> VARIANT = PropertyEnum.<BlockGrimwoodSlab.Variant>create("variant", BlockGrimwoodSlab.Variant.class);

    public BlockGrimwoodSlab() {
        super(Material.WOOD);
        IBlockState iblockstate = this.blockState.getBaseState();
        if (!isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }
        setDefaultState(iblockstate.withProperty(VARIANT, BlockGrimwoodSlab.Variant.DEFAULT));
        
        setHardness(2F);
        setSoundType(SoundType.WOOD);
        if (!isDouble()) {
        	setRegistryName("grimwood_slab");
        } else {
        	setRegistryName("grimwood_double_slab");
        }
        setHarvestLevel("axe", 0);
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Override
	@Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(GrimcraftBlocks.grimwood_slab);
    }

    @Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(GrimcraftBlocks.grimwood_slab);
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
	public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, BlockGrimwoodSlab.Variant.DEFAULT);

        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
	public int getMetaFromState(IBlockState state) {
        int i = 0;

        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP) {
            i |= 8;
        }

        return i;
    }

    @Override
	protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {VARIANT}): new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
    }

    /**
     * Returns the slab block name with the type associated with it
     */
    @Override
	public String getUnlocalizedName(int meta) {
        return super.getUnlocalizedName();
    }

    @Override
	public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
        return false;
    }

    public static class Double extends BlockGrimwoodSlab {
            @Override
			public boolean isDouble() {
                return true;
            }
        }

    public static class Half extends BlockGrimwoodSlab {
            @Override
			public boolean isDouble() {
                return false;
            }
        }

    public static enum Variant implements IStringSerializable {
        DEFAULT;

        @Override
		public String getName() {
            return "default";
        }
    }
}