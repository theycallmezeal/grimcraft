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

    public final static Item grimWoodShovel = new ItemGrimWoodShovel(grimWoodMaterial);
    public final static Item grimWoodPickaxe = new ItemGrimWoodPickaxe(grimWoodMaterial);
    public final static Item grimWoodAxe = new ItemGrimWoodAxe(grimWoodMaterial);
    public final static Item grimWoodHoe = new ItemGrimWoodHoe(grimWoodMaterial);
    public final static Item grimWoodSword = new ItemGrimWoodSword(grimWoodMaterial);

    public final static Item netherrackPickaxe = new ItemNetherrackPickaxe(netherrackMaterial);
    /* rest of tools */

    public final static Item grimWoodStick = new ItemGrimWoodStick();
    public final static Item witherBone = new ItemWitherBone();
    public final static Item witherBonemeal = new ItemWitherBonemeal();
    public final static Item sulfur = new ItemSulfur();
    public final static Item barley = new ItemBarley();
    public final static Item barleySeeds = new ItemBarleySeeds();
    public final static Item strawberry = new ItemStrawberry();
    public final static Item chiliPepper = new ItemChiliPepper();
    public final static Item phoenixEgg = new ItemPhoenixEgg();

    @SidedProxy(clientSide="us.thinkplank.grimcraft.client.ClientProxy", serverSide="us.thinkplank.grimcraft.CommonProxy")
        public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	this.config = new Configuration(event.getSuggestedConfigurationFile());
    	
    	GameRegistry.registerBlock(grimwood_log, "grimwood_log");
        GameRegistry.registerBlock(grimwood_planks, "grimwood_planks");
        GameRegistry.registerBlock(single_grimwood_slab, ItemGrimWoodSlab.class, "single_grimwood_slab");
        GameRegistry.registerBlock(double_grimwood_slab, ItemGrimWoodSlab.class, "double_grimwood_slab");
        GameRegistry.registerBlock(grimwood_stairs, "grimwood_stairs");
        GameRegistry.registerBlock(fossilstone_ore, "fossilstone_ore");
        GameRegistry.registerBlock(nether_coal_ore, "nether_coal_ore");
        GameRegistry.registerBlock(nether_gold_ore, "nether_gold_ore");
        GameRegistry.registerBlock(nether_redstone_ore, "nether_redstone_ore");
        GameRegistry.registerBlock(sulfur_ore, "sulfur_ore");
        GameRegistry.registerBlock(peat, "peat");
        
        GameRegistry.registerItem(grimWoodShovel, "grimWoodShovel");
        GameRegistry.registerItem(grimWoodPickaxe, "grimWoodPickaxe");
        GameRegistry.registerItem(grimWoodAxe, "grimWoodAxe");
        GameRegistry.registerItem(grimWoodHoe, "grimWoodHoe");
        GameRegistry.registerItem(grimWoodSword, "grimWoodSword");
        
        GameRegistry.registerItem(netherrackPickaxe, "netherrackPickaxe");
        /* rest of tools */
        
        GameRegistry.registerItem(grimWoodStick, "grimWoodStick");
        GameRegistry.registerItem(witherBone, "witherBone");
        GameRegistry.registerItem(witherBonemeal, "witherBoneMeal");
        GameRegistry.registerItem(sulfur, "sulfur");
        GameRegistry.registerItem(barley, "barley");
        GameRegistry.registerItem(barleySeeds, "barleySeeds");
        GameRegistry.registerItem(strawberry, "strawberry");
        GameRegistry.registerItem(chiliPepper, "chiliPepper");
        GameRegistry.registerItem(phoenixEgg, "phoenixEgg");
        
        GameRegistry.addRecipe(new ItemStack(grimwood_planks, 4), "x", 'x', new ItemStack(grimwood_log));
        GameRegistry.addRecipe(new ItemStack(grimWoodStick), "x", "x", 'x', new ItemStack(grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.wooden_door), "xx", "xx", "xx", 'x', new ItemStack(grimwood_planks)); //grimwood door?
        GameRegistry.addRecipe(new ItemStack(Blocks.fence), "xxx", "xxx", 'x', new ItemStack(grimWoodStick)); //grimwood fence?
        GameRegistry.addRecipe(new ItemStack(Blocks.fence_gate), "xyx", "xyx", 'x', new ItemStack(grimWoodStick), 'y', new ItemStack(grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), "xxx", "xxx", 'x', new ItemStack(grimwood_planks)); //grimwood trapdoor?
        
        GameRegistry.addRecipe(new ItemStack(witherBonemeal, 3), "x", 'x', new ItemStack(witherBone));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodShovel), "x", "y", "y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimWoodStick));
        GameRegistry.addRecipe(new ItemStack(netherrackPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodAxe), "xx", "xy", " y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodHoe), "xx", " y", " y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodSword), "x", "x", "y", 'x', new ItemStack(grimwood_planks), 'y', new ItemStack(grimWoodStick));

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
