/*
 * Grimcraft.java 1.0.0 5-18-2014
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 * To-do: Figure out the tool material stuff (TC compatibility is the ultimate goal)
 * Nether alternatives for vanilla blocks?
 * Finish tools (ugh)
 * maybe a ModBlocks and ModItems class?
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
    
    public final static Block grimWoodLog = new BlockGrimWoodLog();
    public final static Block grimWoodPlanks = new BlockGrimWoodPlanks();
    public final static Block fossilstoneOre = new BlockFossilstoneOre();
    public final static Block netherCoalOre = new BlockNetherCoalOre();
    public final static Block netherGoldOre = new BlockNetherGoldOre();
    public final static Block netherRedstoneOre = new BlockNetherRedstoneOre();
    public final static Block sulfurOre = new BlockSulfurOre();
    public final static Block blockSulfur = new BlockSulfur();
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
    	
    	GameRegistry.registerBlock(grimWoodLog, "grimWoodLog");
        GameRegistry.registerBlock(grimWoodPlanks, "grimwoodPlanks");
        GameRegistry.registerBlock(fossilstoneOre, "fossilstoneOre");
        GameRegistry.registerBlock(netherCoalOre, "netherCoalOre");
        GameRegistry.registerBlock(netherGoldOre, "netherGoldOre");
        GameRegistry.registerBlock(netherRedstoneOre, "netherRedstoneOre");
        GameRegistry.registerBlock(sulfurOre, "sulfurOre");
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
        
        GameRegistry.addRecipe(new ItemStack(grimWoodPlanks, 4), "x", 'x', new ItemStack(grimWoodLog));
        GameRegistry.addRecipe(new ItemStack(grimWoodStick), "x", "x", 'x', new ItemStack(grimWoodPlanks));
        GameRegistry.addRecipe(new ItemStack(Blocks.wooden_door), "xx", "xx", "xx", 'x', new ItemStack(grimWoodPlanks)); //grimwood door?
        GameRegistry.addRecipe(new ItemStack(Blocks.fence), "xxx", "xxx", 'x', new ItemStack(grimWoodStick)); //grimwood fence?
        GameRegistry.addRecipe(new ItemStack(Blocks.fence_gate), "xyx", "xyx", 'x', new ItemStack(grimWoodStick), 'y', new ItemStack(grimWoodPlanks));
        GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), "xxx", "xxx", 'x', new ItemStack(grimWoodPlanks)); //grimwood trapdoor?
        
        GameRegistry.addRecipe(new ItemStack(witherBonemeal, 3), "x", 'x', new ItemStack(witherBone));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodShovel), "x", "y", "y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
        GameRegistry.addRecipe(new ItemStack(netherrackPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodAxe), "xx", "xy", " y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodHoe), "xx", " y", " y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));
        
        GameRegistry.addRecipe(new ItemStack(grimWoodSword), "x", "x", "y", 'x', new ItemStack(grimWoodPlanks), 'y', new ItemStack(grimWoodStick));

        GameRegistry.addSmelting(netherCoalOre, new ItemStack(Items.coal), 0.2f);
        GameRegistry.addSmelting(netherGoldOre, new ItemStack(Items.gold_ingot), 1.2f);
        GameRegistry.addSmelting(netherRedstoneOre, new ItemStack(Items.redstone), 0.9f);
        GameRegistry.addSmelting(sulfurOre, new ItemStack(sulfur), 0.2f);
        GameRegistry.addSmelting(fossilstoneOre, new ItemStack(Items.dye, 1, 15), 0.2f);

        GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
