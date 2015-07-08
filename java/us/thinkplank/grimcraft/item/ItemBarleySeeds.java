package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemBarleySeeds extends ItemSeeds {
    public ItemBarleySeeds() {
        super(GrimcraftBlocks.barley_crop, GrimcraftBlocks.peat);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("barley_seeds");
    }
    
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
    	if (side != EnumFacing.UP) {
            return false;
        } else if (!player.canPlayerEdit(pos.offset(side), side, stack)) {
            return false;
        } else if (worldIn.getBlockState(pos).getBlock() == GrimcraftBlocks.peat && worldIn.isAirBlock(pos.up())) {
            worldIn.setBlockState(pos.up(), GrimcraftBlocks.barley_crop.getDefaultState());
            if (!player.capabilities.isCreativeMode) {
            	stack.stackSize--;
            }
            return true;
        }
    	
        return false;
    }
}
