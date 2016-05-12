package us.thinkplank.grimcraft.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.GrimcraftPlants;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemWitherBonemeal extends Item {
    public ItemWitherBonemeal() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("wither_bonemeal");
    }
    
    // px, py, pz are the coords on the block face that were clicked
    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int par7, float px, float py, float pz) {
    	if (itemStack == null) {
    		return false;
    	} else if (player.canPlayerEdit(x, y, z, par7, itemStack)) {
    		Block block = world.getBlock(x, y, z);
    		
    		if (block.equals(Blocks.deadbush)) {
    			if (world.getBlock(x, y - 1, z).equals(GrimcraftBlocks.peat) && GrimcraftPlants.isSurroundedByLava(world, x, y - 1, z)) {
    				world.setBlock(x, y, z, GrimcraftBlocks.ghast_pepper_bush);
    			} else {
    				world.setBlock(x, y, z, GrimcraftBlocks.vulpiberry_bush);
    			}
    			world.playAuxSFX(2005, x, y, z, 0);
    			itemStack.stackSize--;
    			return true;
    		}
    		
    		if (block.equals(Blocks.nether_wart)) {
    			GrimcraftPlants.attemptTree(world, x, y, z);
    			world.playAuxSFX(2005, x, y, z, 0);
    			itemStack.stackSize--;
    			return true;
    		}
    		
    		if (block.equals(GrimcraftBlocks.barley_crop) || block.equals(GrimcraftBlocks.netherroot_crop) || block.equals(Blocks.nether_wart)) {
    			int currentMeta = world.getBlockMetadata(x, y, z);
    			if (currentMeta < 7) {
    				world.setBlockMetadataWithNotify(x, y, z, currentMeta + 1, 2);
    			}
    			world.playAuxSFX(2005, x, y, z, 0);
				itemStack.stackSize--;
				return true;
    		}
    	}
    	return false;
    }
}
