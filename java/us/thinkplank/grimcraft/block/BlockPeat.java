package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPeat extends BlockFalling {
    public BlockPeat () {
        super(Material.grass);
        setHardness(3F);
        setStepSound(Block.soundTypeGrass);
        setBlockName("peat");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("shovel", 0);
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        float f = 0.125F;
        return AxisAlignedBB.getBoundingBox((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)((float)(p_149668_3_ + 1) - f), (double)(p_149668_4_ + 1));
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
        p_149670_5_.motionX *= 0.4D;
        p_149670_5_.motionZ *= 0.4D;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("grimcraft:peat");
    }
    
    //TODO should all this tree code go in BlockPeat?
    @Override
    public void updateTick(World world, int x, int y, int z, Random random) {
    	if (isSurroundedByLava(world, x, y, z)) {
    		Block above = world.getBlock(x, y + 1, z);
    		if (above.equals(Blocks.nether_wart)){
    			growTree(world, x, y, z);
    		}
    	}
    }
    
    private boolean isSurroundedByLava(World world, int x, int y, int z) {
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
//    	if (!world.getBlock(x + 1, y, z).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x + 1, y, z + 1).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x, y, z + 1).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x - 1, y, z + 1).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x - 1, y, z).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x - 1, y, z - 1).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x, y, z - 1).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	if (!world.getBlock(x + 1, y, z - 1).equals(Blocks.lava)) {
//    		return false;
//    	}
//    	
//    	return true;
    
    private void growTree(World world, int x, int y, int z) {
    	int random = (int)(Math.random() * 4) + 3; // 3, 4, 5, or 6... if I did the math right.
    	for (int i = 0; i < random; i++) {
    		attemptLogPlace(world, x, y + i, z);
    	}
    }
    
    private void attemptLogPlace(World world, int x, int y, int z) {
    	if (world.getBlock(x, y, z).equals(Blocks.air) || world.getBlock(x, y, z).equals(Blocks.nether_wart)) {
    		world.setBlock(x, y, z, GrimcraftBlocks.grimwood_log);
    	}
    }
}
