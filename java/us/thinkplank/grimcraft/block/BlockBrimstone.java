package us.thinkplank.grimcraft.block;

import java.util.Random;

import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBrimstone extends Block {
    public BlockBrimstone () {
        super(Material.ROCK);
        setHardness(3F);
        setSoundType(SoundType.STONE);
        setRegistryName("brimstone_block");
        setHarvestLevel("pickaxe", 1);
        setTickRandomly(true);
    }
    
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
    	if (random.nextDouble() > 0.1) {
    		return;
    	}
    	
    	for (int x = -3; x <= 3; x++) {
    		for (int y = -3; y <= 3; y++) {
    			for (int z = -3; z <= 3; z++) {
    				Block blockAtPos = worldIn.getBlockState(pos.add(x, y, z)).getBlock();
    				if (blockAtPos.equals(Blocks.PORTAL)) {
    					// replace this block with brimstone essence
    					int numEssence = random.nextInt(5) + 4;
    					worldIn.spawnEntityInWorld(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(GrimcraftItems.brimstone_essence, numEssence)));
    					worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
    					break;
    				}
    			}
    		}
    	}
    }
}
