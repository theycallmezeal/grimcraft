package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

import us.thinkplank.grimcraft.GrimcraftPlants;

public class BlockPeat extends BlockFalling {
	
    public BlockPeat () {
        super(Material.grass);
        setHardness(3F);
        setStepSound(Block.soundTypeGrass);
        setBlockName("peat");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("shovel", 0);
        setTickRandomly(true);
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
    public void updateTick(World world, int x, int y, int z, Random random) {
    	if (world.getBlock(x, y + 1, z).equals(Blocks.nether_wart) && world.getBlockMetadata(x, y + 1, z) > 0) {
    		GrimcraftPlants.attemptTree(world, x, y + 1, z);
    	}
    }
    
    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
    	Block plant = plantable.getPlant(world, x, y + 1, z);
    	if (plant.equals(GrimcraftBlocks.barley_crop) || plant.equals(GrimcraftBlocks.netherroot_crop) || plant.equals(Blocks.nether_wart)
    			|| plant.equals(GrimcraftBlocks.vulpiberry_bush) || plant.equals(GrimcraftBlocks.ghast_pepper_bush) || plant.equals(Blocks.deadbush)) {
    		return true;
    	}
    	return false;
    }
}
