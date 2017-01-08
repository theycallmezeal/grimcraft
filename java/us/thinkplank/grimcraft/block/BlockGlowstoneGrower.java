package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
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
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
		int radius = 5;
		
		for (int i = 0 - radius; i <= radius; i++) {
			for (int j = 0 - radius; j <= radius; j++) {
				for (int k = 0 - radius; k <= radius; k++) {
					if (random.nextInt(100) > 10) {
						continue;
					}
					
					Block cBlock = worldIn.getBlockState(pos.add(i, j, k)).getBlock();
					if (cBlock == Blocks.GLOWSTONE) {
						int dx = random.nextInt(3) - 1;
						int dy = random.nextInt(3) - 1;
						int dz = random.nextInt(3) - 1;
						
						BlockPos newLoc = pos.add(i + dx, j + dy, k + dz);
						Block blockAtLoc = worldIn.getBlockState(newLoc).getBlock();
						
						if (blockAtLoc == GrimcraftBlocks.glowstone_grower) {
							continue;
						}
						
						if (blockAtLoc == Blocks.AIR) {
							continue;
						}
						
						worldIn.setBlockState(newLoc, Blocks.GLOWSTONE.getDefaultState());
					}
				}
			}
		}
		worldIn.scheduleBlockUpdate(pos, this, 0, 1);
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		worldIn.scheduleBlockUpdate(pos, this, 0, 1);
	}
}
