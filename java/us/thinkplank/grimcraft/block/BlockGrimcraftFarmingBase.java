package us.thinkplank.grimcraft.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimcraftFarmingBase extends Block {
	@SideOnly(Side.CLIENT)
	
	public BlockGrimcraftFarmingBase () {
        super(Material.ground);
        setHardness(2F);
        setStepSound(Block.soundTypeStone);
        setBlockName("gc_farming_base");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 0);
        setTickRandomly(true);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon("grimcraft:fossilstone_ore");
	}
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		int radius = 5;
		for(int i = x-radius; i < x+radius; i++) {
			for(int j = y-radius; j < y+radius; j++) {
				for(int k = z-radius; k < z+radius; k++) {
					if(random.nextInt(100) > 10) {
						continue;
					}  
					Block cBlock = world.getBlock(i, j, k);
					if(Block.isEqualTo(cBlock, Blocks.glowstone)) {
						int xo = random.nextInt(3)-1;
						int yo = random.nextInt(3)-1;
						int zo = random.nextInt(3)-1;
						
						if(Block.isEqualTo(this, world.getBlock(i+xo, j+yo, k+zo))) {
							continue;
						}
						if(!Block.isEqualTo(Blocks.air, world.getBlock(i+xo, j+yo, k+zo))) {
							continue;
						}
						world.setBlock(i+xo, j+yo, k+zo, Blocks.glowstone);
						world.markBlockForUpdate(i+xo, j+yo, k+zo);
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
