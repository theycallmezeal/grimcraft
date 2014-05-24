/*
 * Grimcraft.java 1.0.0 5-22-2014
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 * To-do: Figure out the tool material stuff (TC compatibility is the ultimate goal)
 * Nether alternatives for vanilla blocks?
 * Finish tools (ugh)
 * maybe a ModBlocks and ModItems class?
 * Sulfur ore texture
 */


package us.thinkplank.grimcraft;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import us.thinkplank.grimcraft.block.*;
import us.thinkplank.grimcraft.item.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
public class Grimcraft {
    @Instance("Grimcraft")
    public Configuration config;
    public static Grimcraft instance;

    static ToolMaterial grimWoodMaterial = EnumHelper.addToolMaterial("GRIMWOOD", 0, 59, 2.0F, 0.0F, 15); //currently these are equal to vanilla wood / stone
    static ToolMaterial netherrackMaterial = EnumHelper.addToolMaterial("NETHERRACK", 1, 131, 4.0F, 1.0F, 5); //tweak later?
    
    public final static Block grimwood_log = new BlockGrimwoodLog();
    public final static Block grimwood_planks = new BlockGrimwoodPlanks();
    public final static Block single_grimwood_slab = new BlockGrimwoodSlab(false);
    public final static Block double_grimwood_slab = new BlockGrimwoodSlab(true);
    public final static Block grimwood_stairs = new BlockGrimwoodStairs();
    public final static Block fossilstone_ore = new BlockFossilstoneOre();
    public final static Block nether_coal_ore = new BlockNetherCoalOre();
    public final static Block nether_gold_ore = new BlockNetherGoldOre();
    public final static Block nether_redstone_ore = new BlockNetherRedstoneOre();
    public final static Block sulfur_ore = new BlockSulfurOre();
    public final static Block sulfur_block = new BlockSulfur();
    public final static Block peat = new BlockPeat();

    public final static Item grimwood_shovel = new ItemGrimwoodShovel(grimWoodMaterial);
    public final static Item grimwood_pickaxe = new ItemGrimwoodPickaxe(grimWoodMaterial);
    public final static Item grimwood_axe = new ItemGrimwoodAxe(grimWoodMaterial);
    public final static Item grimwood_hoe = new ItemGrimwoodHoe(grimWoodMaterial);
    public final static Item grimwood_sword = new ItemGrimwoodSword(grimWoodMaterial);

    public final static Item netherrack_pickaxe = new ItemNetherrackPickaxe(netherrackMaterial);
    /* rest of tools */

    public final static Item grimwood_stick = new ItemGrimwoodStick();
    public final static Item wither_bone = new ItemWitherBone();
    public final static Item wither_bonemeal = new ItemWitherBonemeal();
    public final static Item sulfur = new ItemSulfur();
    public final static Item barley = new ItemBarley();
    public final static Item barley_seeds = new ItemBarleySeeds();
    public final static Item strawberry = new ItemStrawberry();
    public final static Item chili_pepper = new ItemChiliPepper();
    public final static Item netherroot = new ItemNetherroot();
    public final static Item phoenix_egg = new ItemPhoenixEgg();

    @SidedProxy(clientSide="us.thinkplank.grimcraft.client.ClientProxy", serverSide="us.thinkplank.grimcraft.CommonProxy")
        public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	this.config = new Configuration(event.getSuggestedConfigurationFile());
    	
    	GameRegistry.registerBlock(grimwood_log, "grimwood_log");
        GameRegistry.registerBlock(grimwood_planks, "grimwood_planks");
        GameRegistry.registerBlock(single_grimwood_slab, ItemGrimwoodSlab.class, "single_grimwood_slab");
        GameRegistry.registerBlock(double_grimwood_slab, ItemGrimwoodSlab.class, "double_grimwood_slab");
        GameRegistry.registerBlock(grimwood_stairs, "grimwood_stairs");
        GameRegistry.registerBlock(fossilstone_ore, "fossilstone_ore");
        GameRegistry.registerBlock(nether_coal_ore, "nether_coal_ore");
        GameRegistry.registerBlock(nether_gold_ore, "nether_gold_ore");
        GameRegistry.registerBlock(nether_redstone_ore, "nether_redstone_ore");
        GameRegistry.registerBlock(sulfur_ore, "sulfur_ore");
        GameRegistry.registerBlock(peat, "peat");
        
        GameRegistry.registerItem(grimwood_shovel, "grimwood_shovel");
        GameRegistry.registerItem(grimwood_pickaxe, "grimwood_pickaxe");
        GameRegistry.registerItem(grimwood_axe, "grimwood_axe");
        GameRegistry.registerItem(grimwood_hoe, "grimwood_hoe");
        GameRegistry.registerItem(grimwood_sword, "grimwood_sword");
        
        GameRegistry.registerItem(netherrack_pickaxe, "netherrack_pickaxe");
        /* rest of tools */
        
        GameRegistry.registerItem(grimwood_stick, "grimwood_stick");
        GameRegistry.registerItem(wither_bone, "wither_bone");
        GameRegistry.registerItem(wither_bonemeal, "wither_bonemeal");
        GameRegistry.registerItem(sulfur, "sulfur");
        GameRegistry.registerItem(barley, "barley");
        GameRegistry.registerItem(barley_seeds, "barley_seeds");
        GameRegistry.registerItem(strawberry, "strawberry");
        GameRegistry.registerItem(chili_pepper, "chili_pepper");
        GameRegistry.registerItem(netherroot, "netherroot");
        GameRegistry.registerItem(phoenix_egg, "phoenix_egg");
        
        GameRegistry.addRecipe(new ItemStack(grimwood_planks, 4), "x", 'x', new ItemStack(grimwood_log));
        GameRegistry.addRecipe(new ItemStack(grimwood_stick), "x", "x", 'x', new ItemStack(grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.wooden_door), "xx", "xx", "xx", 'x', new ItemStack(grimwood_planks)); //grimwood door?
        GameRegistry.addRecipe(new ItemStack(Blocks.fence), "xxx", "xxx", 'x', new ItemStack(grimwood_stick)); //grimwood fence?
        GameRegistry.addRecipe(new ItemStack(Blocks.fence_gate), "xyx", "xyx", 'x', new ItemStack(grimwood_stick), 'y', new ItemStack(grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), "xxx", "xxx", 'x', new ItemStack(grimwood_planks)); //grimwood trapdoor?
        
        GameRegistry.addRecipe(new ItemStack(wither_bonemeal, 3), "x", 'x', new ItemStack(wither_bone));
        
        GameRegistry.addRecipe(new ItemStack(grimwood_shovel), "x", "y", "y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(grimwood_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(netherrack_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(grimwood_axe), "xx", "xy", " y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(grimwood_hoe), "xx", " y", " y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(grimwood_sword), "x", "x", "y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimwood_stick));

        GameRegistry.addSmelting(nether_coal_ore, new ItemStack(Items.coal), 0.2f);
        GameRegistry.addSmelting(nether_gold_ore, new ItemStack(Items.gold_ingot), 1.2f);
        GameRegistry.addSmelting(nether_redstone_ore, new ItemStack(Items.redstone), 0.9f);
        GameRegistry.addSmelting(sulfur_ore, new ItemStack(sulfur), 0.2f);
        GameRegistry.addSmelting(fossilstone_ore, new ItemStack(Items.dye, 1, 15), 0.2f);

        GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
