package us.thinkplank.grimcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.GrimcraftPlants;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemBarleySeeds extends ItemSeeds {
    public ItemBarleySeeds() {
        super(GrimcraftBlocks.barley_crop, GrimcraftBlocks.peat);
        setRegistryName("barley_seeds");
    }
    
    @Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	return GrimcraftPlants.attemptCrop(GrimcraftBlocks.barley_crop, GrimcraftBlocks.peat, stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
