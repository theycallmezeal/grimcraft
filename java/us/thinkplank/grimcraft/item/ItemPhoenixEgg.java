package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.mobs.EntityPhoenix;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPhoenixEgg extends Item {
    public ItemPhoenixEgg() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("phoenix_egg");
        setTextureName("grimcraft:phoenix_egg");
    }
    
    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
		if (itemStack == null) {
			return false;
		} else if (player.canPlayerEdit(x, y, z, par7, itemStack)) {
			Block block = world.getBlock(x, y, z);
			
			if (block.equals(Blocks.gravel) && !world.isRemote){
				world.setBlock(x, y, z, Blocks.air);
				world.playAuxSFX(2005, x, y, z, 0);
				EntityPhoenix phoenix = new EntityPhoenix(world);
				phoenix.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
				world.spawnEntityInWorld(phoenix);
			}
		}
    	return true;
    }
}
