package us.thinkplank.grimcraft.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import us.thinkplank.grimcraft.item.ItemGrimwoodSlab;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GrimcraftBlocks {
	public final static Block grimwood_log = new BlockGrimwoodLog();
    public final static Block grimwood_planks = new BlockGrimwoodPlanks();
    public final static Block half_grimwood_slab = new BlockHalfGrimwoodSlab();
    public final static Block double_grimwood_slab = new BlockDoubleGrimwoodSlab();
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
    public final static Block soul_sand_glass = new BlockSoulSandGlass();
    public final static Block barley_crop = new BlockBarleyCrop();
    public final static Block netherroot_crop = new BlockNetherrootCrop();
    public final static Block vulpiberry_bush = new BlockVulpiberryBush();
    public final static Block ghast_pepper_bush = new BlockGhastPepperBush();
    public final static Block nether_lantern = new BlockNetherLantern();
    public final static Block lava_lamp = new BlockLavaLamp();
    public final static Block gc_farming_base = new BlockGrimcraftFarmingBase();
    
    private final static ItemModelMesher renderItem = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    
    public static void register() {
    	registerBlock(grimwood_log, "grimwood_log");
        registerBlock(grimwood_planks, "grimwood_planks");
        
        //TODO figure out why the slab is getting bumped to the end of the list
        //TODO make this less hideous
        GameRegistry.registerBlock(half_grimwood_slab, ItemBlockGrimwoodSlab.class, "half_grimwood_slab", half_grimwood_slab, double_grimwood_slab, false);
        GameRegistry.registerBlock(double_grimwood_slab, ItemBlockGrimwoodSlab.class, "double_grimwood_slab", half_grimwood_slab, double_grimwood_slab, true);
        renderItem.register(Item.getItemFromBlock(half_grimwood_slab), 0, new ModelResourceLocation("grimcraft:half_grimwood_slab", "inventory"));
        renderItem.register(Item.getItemFromBlock(double_grimwood_slab), 0, new ModelResourceLocation("grimcraft:double_grimwood_slab", "inventory"));
        
        registerBlock(grimwood_stairs, "grimwood_stairs");
        registerBlock(grimwood_fence, "grimwood_fence");
        registerBlock(grimwood_fence_gate, "grimwood_fence_gate");
        registerBlock(fossilstone_ore, "fossilstone_ore");
        registerBlock(nether_coal_ore, "nether_coal_ore");
        registerBlock(nether_gold_ore, "nether_gold_ore");
        registerBlock(nether_redstone_ore, "nether_redstone_ore");
        registerBlock(peat, "peat");
        registerBlock(brimstone_ore, "brimstone_ore");
        registerBlock(brimstone_block, "brimstone_block");
        registerBlock(soul_sand_glass, "soul_sand_glass");
        registerBlock(barley_crop, "barley_crop");
        registerBlock(netherroot_crop, "netherroot_crop");
        registerBlock(vulpiberry_bush, "vulpiberry_bush");
        registerBlock(ghast_pepper_bush, "ghast_pepper_bush");
        registerBlock(nether_lantern, "nether_lantern");
        registerBlock(lava_lamp, "lava_lamp");
        registerBlock(gc_farming_base, "gc_farming_base");
    }
    
    private static void registerBlock(Block block, String name) {
    	GameRegistry.registerBlock(block, name);
    	renderItem.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("grimcraft:" + name, "inventory"));
    }
}
