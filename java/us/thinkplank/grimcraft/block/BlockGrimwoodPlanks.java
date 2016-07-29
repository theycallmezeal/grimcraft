package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrimwoodPlanks extends Block {
    public BlockGrimwoodPlanks () {
        super(Material.wood);
        setHardness(2F);
        setStepSound(SoundType.WOOD);
        setRegistryName("grimwood_planks");
        setUnlocalizedName("grimwood_planks");
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("axe", 0);
    }
}