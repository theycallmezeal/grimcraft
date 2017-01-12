package us.thinkplank.grimcraft.block;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class BlockGrimwoodDoor extends BlockDoor {
	protected BlockGrimwoodDoor() {
		super(Material.WOOD);
        setHardness(2F);
        setSoundType(SoundType.WOOD);
        setRegistryName("grimwood_door");
        setHarvestLevel("axe", 0);
	}
	
	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return new ItemStack(GrimcraftItems.item_grimwood_door);
    }
	
	private Item getItem() {
        return GrimcraftItems.item_grimwood_door;
    }
	
	@Override
	@Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return state.getValue(HALF) == BlockDoor.EnumDoorHalf.UPPER ? null : this.getItem();
    }
}
