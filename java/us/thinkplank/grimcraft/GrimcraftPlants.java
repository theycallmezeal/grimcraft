package us.thinkplank.grimcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

//helper class for some plants methods
public class GrimcraftPlants {
    public static void attemptTree(World world, int x, int y, int z) {
    	if (isSurroundedByLava(world, x, y - 1, z)) {
    		growTree(world, x, y, z);
    	}
    }
    
    public static boolean isSurroundedByLava(World world, int x, int y, int z) {
    	int lava = 0;
    	for (int i = x - 1; i <= x + 1; i++) {
    		for (int j = z - 1; j <= z + 1; j++) {
    			if (world.getBlock(i, y, j).equals(Blocks.lava)) {
    				lava++;
    			}
    		}
    	}
    	
    	if (lava == 8) {
    		return true;
    	}
    	return false;
    }
    
    private static void growTree(World world, int x, int y, int z) {
    	int random = (int)(Math.random() * 4) + 3; // 3, 4, 5, or 6... if I did the math right.
    	for (int i = 0; i < random; i++) {
    		if (world.getBlock(x, y + i, z).equals(Blocks.air) || world.getBlock(x, y + i, z).equals(Blocks.nether_wart)) {
        		world.setBlock(x, y + i, z, GrimcraftBlocks.grimwood_log);
        	} else {
        		return;
        	}
    	}
    }
}
