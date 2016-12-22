package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockGlowstoneGrower extends Block {
	
	public BlockGlowstoneGrower () {
        super(Material.GROUND);
        setHardness(2F);
        setSoundType(SoundType.STONE);
        setRegistryName("glowstone_grower");
        setHarvestLevel("pickaxe", 0);
        setTickRandomly(true);
        setLightLevel(1.0F);
    }
	
	@Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
		int radius = 5;
		
		for (int i = 0 - radius; i <= radius; i++) {
			for (int j = 0 - radius; j <= radius; j++) {
				for (int k = 0 - radius; k <= radius; k++) {
					if (random.nextInt(100) > 10) {
						continue;
					}
					
					Block cBlock = world.getBlockState(pos.add(i, j, k)).getBlock();
					if (cBlock.equals(Blocks.GLOWSTONE)) {
						int dx = random.nextInt(3) - 1;
						int dy = random.nextInt(3) - 1;
						int dz = random.nextInt(3) - 1;
						
						BlockPos newLoc = pos.add(i + dx, j + dy, k + dz);
						Block blockAtLoc = world.getBlockState(newLoc).getBlock();
						
						if (blockAtLoc.equals(GrimcraftBlocks.glowstone_grower)) {
							continue;
						}
						
						if (blockAtLoc.equals(Blocks.AIR)) {
							continue;
						}
						
						world.setBlockState(newLoc, Blocks.GLOWSTONE.getDefaultState());
					}
				}
			}
		}
		world.scheduleBlockUpdate(pos, this, 0, 1);
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		world.scheduleBlockUpdate(pos, this, 0, 1);
	}
}
