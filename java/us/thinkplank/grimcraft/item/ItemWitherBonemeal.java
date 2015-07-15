package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWitherBonemeal extends Item {
    public ItemWitherBonemeal() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("wither_bonemeal");
        setTextureName("grimcraft:wither_bonemeal");
    }
    
    //TODO find out what the rest of these args do
    //TODO add sparklies
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
    	if (itemStack == null) {
    		return false;
    	} else if (player.canPlayerEdit(x, y, z, par7, itemStack)) {
    		if (world.getBlock(x, y, z) == GrimcraftBlocks.barley_crop) {
    			int currentMeta = world.getBlockMetadata(x, y, z);
				world.setBlockMetadataWithNotify(x, y, z, currentMeta + 1, 2);
				itemStack.stackSize--;
				return true;
    		}
    	} else if (player.canPlayerEdit(x, y, z, par7, itemStack)) {
    		if (world.getBlock(x, y, z) == GrimcraftBlocks.netherroot_crop) {
    			int currentMeta = world.getBlockMetadata(x, y, z);
				world.setBlockMetadataWithNotify(x, y, z, currentMeta + 1, 2);
				itemStack.stackSize--;
				return true;
    		}
    	}
    	return false;
    }
}
