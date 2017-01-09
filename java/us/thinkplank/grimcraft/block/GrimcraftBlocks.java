package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.thinkplank.grimcraft.Grimcraft;

public class GrimcraftBlocks {
	public final static Block grimwood_log = new BlockGrimwoodLog();
    public final static Block grimwood_planks = new BlockGrimwoodPlanks();
    public final static Block grimwood_slab = new BlockGrimwoodSlab.Half();
    public final static Block grimwood_double_slab = new BlockGrimwoodSlab.Double();
    public final static Block grimwood_stairs = new BlockGrimwoodStairs();
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
    public final static Block glowstone_grower = new BlockGlowstoneGrower();
    
    public final static ItemSlab itemBlockSlab = new ItemSlab(grimwood_slab, (BlockSlab)grimwood_slab, (BlockSlab)grimwood_double_slab);
    
    public static void register() {
    	registerBlock(grimwood_log);
        registerBlock(grimwood_planks);
        registerBlock(grimwood_slab);
        registerBlock(grimwood_double_slab);
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
        registerBlock(glowstone_grower);
    }
    
    public static void registerModels() {
    	registerBlockModel(grimwood_log);
        registerBlockModel(grimwood_planks);
        ModelLoader.setCustomModelResourceLocation(itemBlockSlab, 0, new ModelResourceLocation(grimwood_slab.getRegistryName(), "inventory"));
        /* don't register double slab model */
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
        /* don't register barley or netherroot crop models */
        registerBlockModel(vulpiberry_bush);
        registerBlockModel(ghast_pepper_bush);
        registerBlockModel(nether_lantern);
        registerBlockModel(glowstone_grower);
    }
    
    private static void registerBlock(Block block) {
    	block.setUnlocalizedName(Grimcraft.MODID + "." + block.getRegistryName().getResourcePath());
    	
    	if (block != barley_crop && block != netherroot_crop) {
    		block.setCreativeTab(Grimcraft.tabGrimcraft);
    	}
    	
    	GameRegistry.register(block);
    	
    	if (block == grimwood_slab) {
    		GameRegistry.register(itemBlockSlab, grimwood_slab.getRegistryName());
    		return;
    	}
    	
    	if (block != grimwood_double_slab) {
    		GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    	}
    }
    
    private static void registerBlockModel(Block block) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
