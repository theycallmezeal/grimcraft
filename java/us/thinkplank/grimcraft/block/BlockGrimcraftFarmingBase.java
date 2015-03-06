package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimcraftFarmingBase extends Block {
	@SideOnly(Side.CLIENT)
	
	public BlockGrimcraftFarmingBase () {
        super(Material.ground);
        setHardness(2F);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName("gc_farming_base");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 0);
        setTickRandomly(true);
    }
	
	public void updateTick(World world, BlockPos pos, Random random) {
	    int x = pos.getX();
	    int y = pos.getY();
	    int z = pos.getZ();
		int radius = 5;
		for(int i = x - radius; i < x + radius; i++) {
			for(int j = y - radius; j < y + radius; j++) {
				for(int k = z - radius; k < z + radius; k++) {
					if(random.nextInt(100) > 10) {
						continue;
					}  
					Block cBlock = world.getBlockState(new BlockPos(i, j, k)).getBlock();
					if(Block.isEqualTo(cBlock, Blocks.glowstone)) {
						int xo = random.nextInt(3) - 1;
						int yo = random.nextInt(3) - 1;
						int zo = random.nextInt(3) - 1;
						BlockPos newPos = new BlockPos (i + xo, j + yo, k + zo);
						
						if (Block.isEqualTo(this, world.getBlockState(newPos).getBlock())) {
							continue;
						}
						if (!Block.isEqualTo(Blocks.air, world.getBlockState(newPos).getBlock())) {
							continue;
						}
						world.setBlockState(new BlockPos(i + xo, j + yo, k + zo), Blocks.glowstone.getDefaultState());
						world.markBlockForUpdate(new BlockPos(i + xo, j + yo, k + zo));
					}
				}
			}
		}
		// world.scheduleBlockUpdate(x, y, z, this, tickRate());
	}
	
	/* Override
	public void onBlockAdded(World world, int x, int y, int z) {
		world.scheduleBlockUpdate(x, y, z, this, tickRate());
	} */
	
	public int tickRate() {
		return 40;
	}
}
