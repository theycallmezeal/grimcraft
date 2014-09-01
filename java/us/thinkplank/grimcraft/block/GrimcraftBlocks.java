package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import us.thinkplank.grimcraft.item.ItemGrimwoodSlab;
import cpw.mods.fml.common.registry.GameRegistry;

public class GrimcraftBlocks {
	public final static Block grimwood_log = new BlockGrimwoodLog();
    public final static Block grimwood_planks = new BlockGrimwoodPlanks();
    public final static Block single_grimwood_slab = new BlockGrimwoodSlab(false);
    public final static Block double_grimwood_slab = new BlockGrimwoodSlab(true);
    public final static Block grimwood_stairs = new BlockGrimwoodStairs();
    public final static Block grimwood_fence = new BlockGrimwoodFence();
    public final static Block grimwood_fence_gate = new BlockGrimwoodFenceGate();
    public final static Block fossilstone_ore = new BlockFossilstoneOre();
    public final static Block nether_coal_ore = new BlockNetherCoalOre();
    public final static Block nether_gold_ore = new BlockNetherGoldOre();
    public final static Block nether_redstone_ore = new BlockNetherRedstoneOre();
    public final static Block peat = new BlockPeat();
    public final static Block sulfur_ore = new BlockSulfurOre();
    public final static Block sulfur_block = new BlockSulfur();
    public final static Block soul_sand_glass = new BlockSoulSandGlass();
    public final static Block barley_crop = new BlockBarleyCrop();
    public final static Block netherroot_crop = new BlockNetherrootCrop();
    public final static Block strawberry_plant = new BlockStrawberryBush(); //TODO rename?
    public final static Block chili_pepper_plant = new BlockChiliPepperBush(); //TODO rename?
    public final static Block nether_lantern = new BlockNetherLantern();
    public final static Block lava_lamp = new BlockLavaLamp();
    public final static Block gc_farming_base = new BlockGrimcraftFarmingBase();
    
    public static void register() {
    	GameRegistry.registerBlock(grimwood_log, "grimwood_log");
        GameRegistry.registerBlock(grimwood_planks, "grimwood_planks");
        GameRegistry.registerBlock(single_grimwood_slab, ItemGrimwoodSlab.class, "single_grimwood_slab");
        GameRegistry.registerBlock(double_grimwood_slab, ItemGrimwoodSlab.class, "double_grimwood_slab");
        GameRegistry.registerBlock(grimwood_stairs, "grimwood_stairs");
        GameRegistry.registerBlock(grimwood_fence, "grimwood_fence");
        GameRegistry.registerBlock(grimwood_fence_gate, "grimwood_fence_gate");
        GameRegistry.registerBlock(fossilstone_ore, "fossilstone_ore");
        GameRegistry.registerBlock(nether_coal_ore, "nether_coal_ore");
        GameRegistry.registerBlock(nether_gold_ore, "nether_gold_ore");
        GameRegistry.registerBlock(nether_redstone_ore, "nether_redstone_ore");
        GameRegistry.registerBlock(peat, "peat");
        GameRegistry.registerBlock(sulfur_ore, "sulfur_ore");
        //sulfur block goes here
        GameRegistry.registerBlock(soul_sand_glass, "soul_sand_glass");
        GameRegistry.registerBlock(barley_crop, "barley_crop");
        GameRegistry.registerBlock(netherroot_crop, "netherroot_crop");
        GameRegistry.registerBlock(strawberry_plant, "strawberry_plant");
        GameRegistry.registerBlock(chili_pepper_plant, "chili_pepper_plant");
        GameRegistry.registerBlock(nether_lantern, "nether_lantern");
        GameRegistry.registerBlock(lava_lamp, "lava_lamp");
        GameRegistry.registerBlock(gc_farming_base, "gc_farming_base");
    }
}
