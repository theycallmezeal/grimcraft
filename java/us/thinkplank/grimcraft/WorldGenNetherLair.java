/*
* modified from code generated by MrPonyCaptain's
* .schematic to .java converting tool v2.0
*/

package us.thinkplank.grimcraft;

import java.util.Random;

import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenNetherLair extends WorldGenerator implements IWorldGenerator {
	
	//WeightedRandomChestContent(Item, meta, min stack size, max stack size, freq)
    public static final WeightedRandomChestContent[] loot = new WeightedRandomChestContent[] {
    	new WeightedRandomChestContent(GrimcraftItems.wither_bone, 0, 1, 4, 10), 
    	new WeightedRandomChestContent(GrimcraftItems.wither_bonemeal, 0, 1, 4, 10), 
    	new WeightedRandomChestContent(Items.bread, 0, 1, 1, 10), 
    	new WeightedRandomChestContent(GrimcraftItems.barley, 0, 1, 4, 10), 
    	new WeightedRandomChestContent(GrimcraftItems.brimstone, 0, 1, 4, 10), 
    	new WeightedRandomChestContent(Items.string, 0, 1, 4, 10), 
    	new WeightedRandomChestContent(Items.bucket, 0, 1, 1, 10), 
    	new WeightedRandomChestContent(Items.golden_apple, 0, 1, 1, 1), 
    	new WeightedRandomChestContent(GrimcraftItems.ghast_pepper, 0, 1, 4, 10),
    	new WeightedRandomChestContent(GrimcraftItems.vulpiberry, 0, 1, 4, 10), 
    	new WeightedRandomChestContent(Items.record_11, 0, 1, 1, 10), 
    	new WeightedRandomChestContent(Items.record_wait, 0, 1, 1, 10), 
    	new WeightedRandomChestContent(Items.name_tag, 0, 1, 1, 10), 
    };
	
	Block air = Blocks.air;
	Block brick = Blocks.nether_brick;
	Block tnt = Blocks.tnt;
	Block sand = Blocks.soul_sand;
	Block lava = Blocks.lava;
	Block torch = Blocks.redstone_torch;
	Block chest = Blocks.trapped_chest;
	Block wart = Blocks.nether_wart;
	
	Block[][] layer7 = {
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, brick, air, air, air, air, air, brick, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
	};
	
	Block[][] layer6 = {
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{brick, brick, brick, air, brick, air, brick, brick, brick},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
	};
	
	Block[][] layer5 = {
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, brick, brick, brick, brick, brick, brick, brick, air},
		{air, brick, brick, brick, brick, brick, brick, brick, air},
		{air, brick, brick, brick, brick, brick, brick, brick, air},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, lava, brick, brick, brick, brick, brick, lava, brick},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
	};
	
	Block[][] layer4 = {
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{air, air, air, brick, air, brick, air, air, air},
		{air, air, air, air, air, air, air, air, air}
	};
	
	Block[][] layer3 = {
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, brick, brick, brick, torch, brick, brick, brick, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, brick, brick, brick, air, brick, brick, brick, brick},
		{air, air, air, brick, air, brick, air, air, air},
		{air, air, air, air, air, air, air, air, air}
	};
	
	Block[][] layer2 = {
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, brick, brick, torch, chest, torch, brick, brick, brick},
		{brick, wart, wart, air, air, air, wart, wart, brick},
		{brick, wart, air, air, air, air, air, wart, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, air, air, air, air, air, air, air, brick},
		{brick, brick, brick, brick, air, brick, brick, brick, brick},
		{air, air, air, brick, air, brick, air, air, air},
		{air, air, air, air, air, air, air, air, air}
	};
	
	Block[][] layer1 = {
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, brick, brick, brick, tnt, brick, brick, brick, brick},
		{brick, sand, sand, brick, brick, brick, sand, sand, brick},
		{brick, sand, brick, brick, brick, brick, brick, sand, brick},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick},
		{brick, air, brick, brick, brick, brick, brick, air, brick},
		{brick, brick, brick, brick, brick, brick, brick, brick, brick}
	};
	
	Block[][] layer0 = {
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, air, air, air, air, air, air, air, air},
		{air, brick, air, air, air, air, air, brick, air},
		{air, air, air, air, air, air, air, air, air},
	};
	
	protected Block[] getValidSpawnBlocks() {
		return new Block[] {
			Blocks.netherrack,
			Blocks.soul_sand
		};
	}

	public boolean locationIsValidSpawn(World world, BlockPos pos) {
		int distanceToAir = 0;
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();
		
		Block check = world.getBlockState(new BlockPos(i, j, k)).getBlock();

		while (check != Blocks.air){
			if (distanceToAir > 3) {
				return false;
			}

			distanceToAir++;
			check = world.getBlockState(new BlockPos(i, j + distanceToAir, k)).getBlock();
		}

		j += distanceToAir - 1;

		Block block = world.getBlockState(new BlockPos(i, j, k)).getBlock();
		Block blockAbove = world.getBlockState(new BlockPos(i, j + 1, k)).getBlock();
		Block blockBelow = world.getBlockState(new BlockPos(i, j - 1, k)).getBlock();
		
		for (Block x : getValidSpawnBlocks()){
			if (blockAbove != Blocks.air){
				return false;
			}
			if (block == x) {
				return true;
			} else if (block == Blocks.snow && blockBelow == x) {
				return true;
			}
		}
		
		return false;
	}

	public WorldGenNetherLair() {
		
	}
	
	private void fillChest(World world, Random rand, BlockPos pos) {
		TileEntityChest chest = (TileEntityChest) world.getTileEntity(pos);
		
		if (chest != null) {
			//TODO ResourceLocation for the loot?
			chest.setLoot(loot, world.getSeed());
		}
	}
	
	private void setBlocksInArray(Block[][] array, int height, BlockPos pos, World world, Random rand, int rotateNum) {
		for (int x = 0; x < rotateNum; x++) {
			array = rotateMatrix(array);
		}
		
		for (int x = 0; x < array.length; x++) {
			for (int z = 0; z < array[0].length; z++) {
				BlockPos thisPos = pos.add(x, height, z);
				world.setBlockState(thisPos, array[x][z].getDefaultState());
				
				if (array[x][z] == chest) {
					fillChest(world, rand, thisPos);
				}
			}
		}
	}
	
	private Block[][] rotateMatrix(Block[][] matrix) {
	    /* W and H are already swapped */
	    int w = matrix.length;
	    int h = matrix[0].length;   
	    Block[][] ret = new Block[h][w];
	    for (int i = 0; i < h; ++i) {
	        for (int j = 0; j < w; ++j) {
	            ret[i][j] = matrix[j][h - i - 1];
	        }
	    }
	    return ret;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		//check that each corner is one of the valid spawn blocks
		if (!locationIsValidSpawn(world, pos) || 
			!locationIsValidSpawn(world, pos.add(8, 0, 0)) || 
			!locationIsValidSpawn(world, pos.add(8, 0, 8)) || 
			!locationIsValidSpawn(world, pos.add(0, 0, 8))) {
			return false;
		}
		
		int rotateNum = (int) Math.floor(rand.nextDouble() * 4);
		
		setBlocksInArray(layer0, 0, pos, world, rand, rotateNum);
		setBlocksInArray(layer1, 1, pos, world, rand, rotateNum);
		setBlocksInArray(layer2, 2, pos, world, rand, rotateNum);
		setBlocksInArray(layer3, 3, pos, world, rand, rotateNum);
		setBlocksInArray(layer4, 4, pos, world, rand, rotateNum);
		setBlocksInArray(layer5, 5, pos, world, rand, rotateNum);
		setBlocksInArray(layer6, 6, pos, world, rand, rotateNum);
		setBlocksInArray(layer7, 7, pos, world, rand, rotateNum);
		
		return true;
	}
}
