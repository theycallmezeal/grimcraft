/*
 * TODO does the same seed give you the same ores every time?
 */

package us.thinkplank.grimcraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import net.minecraftforge.fml.common.IWorldGenerator;

public class GrimcraftWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
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

	private void generateNether(World world, Random random, int x, int z) {
		generateOre(world, random, x, z, GrimcraftBlocks.fossilstone_ore, 4, 32);
		generateOre(world, random, x, z, GrimcraftBlocks.nether_coal_ore, 20, 12);
		generateOre(world, random, x, z, GrimcraftBlocks.nether_gold_ore, 2, 10);
		generateOre(world, random, x, z, GrimcraftBlocks.nether_redstone_ore, 8, 7);
		generateOre(world, random, x, z, GrimcraftBlocks.fossilstone_ore, 10, 12);
		
		int y = random.nextInt(64) + 32;
		new WorldGenNetherLair().generate(world, random, new BlockPos(x, y, z));
	}
	
	private void generateOre(World world, Random random, int x, int z, Block ore, int veinsPerChunk, int oresPerVein) {
		for (int i = 0; i < veinsPerChunk; i++) {
			int xCoord = x + random.nextInt(16);
			int yCoord = random.nextInt(128);
			int zCoord = z + random.nextInt(16);
			
			new WorldGenMinable(ore.getDefaultState(), oresPerVein).generate(world, random, new BlockPos(xCoord, yCoord, zCoord));
		}
	}
}
