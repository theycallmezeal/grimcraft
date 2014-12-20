package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodPlanks extends Block {
    public BlockGrimwoodPlanks () {
        super(Material.wood);
        setHardness(2F);
        setStepSound(Block.soundTypeWood);
        setUnlocalizedName("grimwood_planks");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
    }
}