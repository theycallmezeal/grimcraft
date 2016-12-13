package us.thinkplank.grimcraft.item;

//import us.thinkplank.grimcraft.mobs.EntityPhoenix;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPhoenixEgg extends Item {
    public ItemPhoenixEgg() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("phoenix_egg");
        setUnlocalizedName("phoenix_egg");
    }
    
    //TODO check facing?
    @Override
    public EnumActionResult onItemUse(ItemStack itemStack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if (itemStack == null) {
			return EnumActionResult.FAIL;
		} else if (player.canPlayerEdit(pos, facing, itemStack)) {
			Block block = world.getBlockState(pos).getBlock();
			
			if (block.equals(Blocks.GRAVEL) && !world.isRemote){
				world.setBlockState(pos, Blocks.AIR.getDefaultState());
				world.playSound(player, pos, SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.NEUTRAL, 1.0F, 0.5F);
				//TODO come back here once mobs are done again
				//EntityPhoenix phoenix = new EntityPhoenix(world);
				//phoenix.setLocationAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(), (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
				//world.spawnEntityInWorld(phoenix);
			}
		}
    	return EnumActionResult.SUCCESS;
    }
}
