package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.GrimcraftPlants;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemNetherroot extends ItemSeedFood {
    public ItemNetherroot() {
        super(4, 0.6F, GrimcraftBlocks.netherroot_crop, GrimcraftBlocks.peat);
        setRegistryName("netherroot");
        setUnlocalizedName("netherroot");
    }
    
    @Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	return GrimcraftPlants.attemptCrop(GrimcraftBlocks.netherroot_crop, GrimcraftBlocks.peat, stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
