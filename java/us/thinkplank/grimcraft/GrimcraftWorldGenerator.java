/*
 * Untested and numbers need tweaking
 */

package us.thinkplank.grimcraft;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GrimcraftWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
        	case -1: {
        		generateNether(world, random, chunkX * 16, chunkZ * 16);
        		break;
        	} case 0: {
        		break;
        	} case 1: {
        		break;
        	}
        }
	}

	private void generateNether(World world, Random random, int x, int y) {
		/* fossilstone */
		for (int i = 0; i < 4; i++) { //veins per chunk
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(GrimcraftBlocks.fossilstone_ore, 32, Blocks.netherrack)).generate(world, random, xCoord, yCoord, zCoord); //ores per vein
		}
		
		/* nether coal */
		for (int i = 0; i < 20; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(GrimcraftBlocks.nether_coal_ore, 12, Blocks.netherrack)).generate(world, random, xCoord, yCoord, zCoord); //vanilla 16
		}
		
		/* nether gold*/
		for (int i = 0; i < 2; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(GrimcraftBlocks.nether_gold_ore, 10, Blocks.netherrack)).generate(world, random, xCoord, yCoord, zCoord); //vanilla 8
		}
		
		/* nether redstone */
		for (int i = 0; i < 8; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(GrimcraftBlocks.nether_redstone_ore, 7, Blocks.netherrack)).generate(world, random, xCoord, yCoord, zCoord); //vanilla 7
		}
		
		/* sulfur */
		for (int i = 0; i < 10; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(GrimcraftBlocks.brimstone_ore, 12, Blocks.netherrack)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}
