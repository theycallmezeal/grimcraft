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
    
    //TODO make it work with peat only. probably have to mess with canSustainPlant
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
    	if (side != EnumFacing.UP) {
            return false;
        }
    	
        else if (!player.canPlayerEdit(pos.offset(side), side, stack)) {
            return false;
        }
    	
        else if (worldIn.getBlockState(pos).getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up())) {
            worldIn.setBlockState(pos.up(), GrimcraftBlocks.barley_crop.getDefaultState());
            stack.stackSize--;
            return true;
        }
    	
        return false;
    }
}
