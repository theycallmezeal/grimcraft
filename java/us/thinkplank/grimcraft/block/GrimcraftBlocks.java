package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GrimcraftBlocks {
	//TODO add a creative tab
	public final static Block grimwood_log = new BlockGrimwoodLog();
    public final static Block grimwood_planks = new BlockGrimwoodPlanks();
    //TODO make sure that single -> half, consistently
    //public final static Block half_grimwood_slab = new BlockGrimwoodHalfSlab(Material.wood);
    //public final static Block double_grimwood_slab = new BlockGrimwoodDoubleSlab(Material.wood);
    public final static Block grimwood_stairs = new BlockGrimwoodStairs(grimwood_planks);
    public final static Block grimwood_fence = new BlockGrimwoodFence();
    public final static Block grimwood_fence_gate = new BlockGrimwoodFenceGate();
    public final static Block fossilstone_ore = new BlockFossilstoneOre();
    public final static Block nether_coal_ore = new BlockNetherCoalOre();
    public final static Block nether_gold_ore = new BlockNetherGoldOre();
    public final static Block nether_redstone_ore = new BlockNetherRedstoneOre();
    public final static Block peat = new BlockPeat();
    public final static Block brimstone_ore = new BlockBrimstoneOre();
    public final static Block brimstone_block = new BlockBrimstone();
    public final static Block barley_crop = new BlockBarleyCrop();
    public final static Block netherroot_crop = new BlockNetherrootCrop();
    public final static Block vulpiberry_bush = new BlockVulpiberryBush();
    public final static Block ghast_pepper_bush = new BlockGhastPepperBush();
    public final static Block nether_lantern = new BlockNetherLantern();
    public final static Block lava_lamp = new BlockLavaLamp();
    public final static Block glowstone_grower = new BlockGlowstoneGrower();
    
    public static void register() {
    	registerBlock(grimwood_log);
        registerBlock(grimwood_planks);
        //registerBlock(half_grimwood_slab);
        //registerBlock(double_grimwood_slab);
        registerBlock(grimwood_stairs);
        registerBlock(grimwood_fence);
        registerBlock(grimwood_fence_gate);
        registerBlock(fossilstone_ore);
        registerBlock(nether_coal_ore);
        registerBlock(nether_gold_ore);
        registerBlock(nether_redstone_ore);
        registerBlock(peat);
        registerBlock(brimstone_ore);
        registerBlock(brimstone_block);
        registerBlock(barley_crop);
        registerBlock(netherroot_crop);
        registerBlock(vulpiberry_bush);
        registerBlock(ghast_pepper_bush);
        registerBlock(nether_lantern);
        registerBlock(lava_lamp);
        registerBlock(glowstone_grower);
    }
    
    public static void registerModels() {
    	registerBlockModel(grimwood_log);
        registerBlockModel(grimwood_planks);
        //registerBlockModel(half_grimwood_slab);
        //registerBlockModel(double_grimwood_slab);
        registerBlockModel(grimwood_stairs);
        registerBlockModel(grimwood_fence);
        registerBlockModel(grimwood_fence_gate);
        registerBlockModel(fossilstone_ore);
        registerBlockModel(nether_coal_ore);
        registerBlockModel(nether_gold_ore);
        registerBlockModel(nether_redstone_ore);
        registerBlockModel(peat);
        registerBlockModel(brimstone_ore);
        registerBlockModel(brimstone_block);
        registerBlockModel(barley_crop);
        registerBlockModel(netherroot_crop);
        registerBlockModel(vulpiberry_bush);
        registerBlockModel(ghast_pepper_bush);
        registerBlockModel(nether_lantern);
        registerBlockModel(lava_lamp);
        registerBlockModel(glowstone_grower);
    }
    
    private static void registerBlock(Block block) {
    	block.setUnlocalizedName(block.getRegistryName().getResourcePath());
    	GameRegistry.register(block);
    	GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
    
    private static void registerBlockModel(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
