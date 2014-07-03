package us.thinkplank.grimcraft.block;

import java.util.Random;

import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockGrowingBarley extends BlockCrops {
	public BlockGrowingBarley() {
		super();
		setHardness(3F);
		setStepSound(Block.soundTypeGrass);
		setBlockName("growingbarley");
	}
	
	public Item getItemDropped(int wow, Random pls, int somethingelse) {
		return Grimcraft.barley_seeds;
	}
}
