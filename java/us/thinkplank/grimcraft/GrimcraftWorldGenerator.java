/*
 * Untested and numbers need tweaking
 */

package us.thinkplank.grimcraft;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

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
		for (int i = 0; i < 5; i++) { //veins per chunk
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(Grimcraft.fossilstone_ore, 10)).generate(world, random, xCoord, yCoord, zCoord); //ores per vein
		}
		
		/* nether coal */
		for (int i = 0; i < 10; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(Grimcraft.nether_coal_ore, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		/* nether gold*/
		for (int i = 0; i < 10; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(Grimcraft.nether_gold_ore, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		/* nether redstone */
		for (int i = 0; i < 10; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(Grimcraft.nether_redstone_ore, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
		
		/* sulfur */
		for (int i = 0; i < 10; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(64);
			int zCoord = y + random.nextInt(16);
			
			(new WorldGenMinable(Grimcraft.sulfur_ore, 10)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}
