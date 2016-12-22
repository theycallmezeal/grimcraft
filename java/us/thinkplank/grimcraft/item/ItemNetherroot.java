package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemNetherroot extends ItemSeedFood {
    public ItemNetherroot() {
        super(4, 0.6F, GrimcraftBlocks.netherroot_crop, GrimcraftBlocks.peat);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("netherroot");
        setUnlocalizedName("netherroot");
    }
    
    //TODO do I need to check the face that you click?
    @Override
    public EnumActionResult onItemUse(ItemStack itemStack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    	if (itemStack == null) {
    		return EnumActionResult.FAIL;
    	} else if (player.canPlayerEdit(pos, facing, itemStack)) {
    		if (world.getBlockState(pos).getBlock().equals(GrimcraftBlocks.peat) && facing == EnumFacing.UP) {
    			world.setBlockState(pos.up(), GrimcraftBlocks.netherroot_crop.getDefaultState());
				itemStack.stackSize--;
				return EnumActionResult.SUCCESS;
    		}
    	}
    	return EnumActionResult.FAIL;
    }
}
