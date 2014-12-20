/*
 * Grimcraft.java 1.0.0 12-20-2014
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 * 
 * to do:
 * fix falling through peat
 */

package us.thinkplank.grimcraft;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.oredict.OreDictionary;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
public class Grimcraft {
    @Instance("Grimcraft")
    public Configuration config;
	
    public static Grimcraft instance;

    @SidedProxy(clientSide="us.thinkplank.grimcraft.client.ClientProxy", serverSide="us.thinkplank.grimcraft.CommonProxy")
        public static CommonProxy proxy;
	

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	this.config = new Configuration(event.getSuggestedConfigurationFile());
    	GrimcraftBlocks.register();
        GrimcraftItems.register();
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_planks, 4), "x", 'x', new ItemStack(GrimcraftBlocks.grimwood_log));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_stick), "x", "x", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.single_grimwood_slab, 6), "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_stairs, 4), "x  ", "xx ", "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.oak_door), "xx", "xx", "xx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks)); //grimwood door?
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_fence), "xxx", "xxx", 'x', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_fence_gate), "xyx", "xyx", 'x', new ItemStack(GrimcraftItems.grimwood_stick), 'y', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), "xxx", "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks)); //grimwood trapdoor?
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.wither_bonemeal, 3), "x", 'x', new ItemStack(GrimcraftItems.wither_bone));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_shovel), "x", "y", "y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_shovel), "x", "y", "y", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_shovel), "x", "y", "y", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_shovel), "x", "y", "y", 'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_axe), "xx", "xy", " y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_axe), "xx", "xy", " y", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_axe), "xx", "xy", " y", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_axe), "xx", "xy", " y", 'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_hoe), "xx", " y", " y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_hoe), "xx", " y", " y", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_hoe), "xx", " y", " y", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_hoe), "xx", " y", " y", 'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_sword), "x", "x", "y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_sword), "x", "x", "y", 'x', new ItemStack(Blocks.netherrack), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_sword), "x", "x", "y", 'x', new ItemStack(Items.quartz), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_sword), "x", "x", "y", 'x', new ItemStack(Items.gold_ingot), 'y', new ItemStack(GrimcraftItems.grimwood_stick));

        GameRegistry.addSmelting(GrimcraftBlocks.nether_coal_ore, new ItemStack(Items.coal), 0.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.nether_gold_ore, new ItemStack(Items.gold_ingot), 1.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.nether_redstone_ore, new ItemStack(Items.redstone), 0.9f);
        GameRegistry.addSmelting(GrimcraftBlocks.brimstone_ore, new ItemStack(GrimcraftItems.brimstone), 0.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.fossilstone_ore, new ItemStack(Items.dye, 1, 15), 0.2f);

        GameRegistry.registerFuelHandler(new GrimcraftFuelHandler());
        GameRegistry.registerWorldGenerator(new GrimcraftWorldGenerator(), 20); //is this value fine?
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new GrimcraftEventHandler());
    	
    	OreDictionary.registerOre("oreFossilstone", GrimcraftBlocks.fossilstone_ore);
    	OreDictionary.registerOre("oreCoal", GrimcraftBlocks.nether_coal_ore);
    	OreDictionary.registerOre("oreGold", GrimcraftBlocks.nether_gold_ore);
    	OreDictionary.registerOre("oreRedstone", GrimcraftBlocks.nether_redstone_ore);
    	OreDictionary.registerOre("oreSulfur", GrimcraftBlocks.brimstone_ore); //makes brimstone work as sulfur
    	
    	EntityRegistry.addSpawn(EntityCaveSpider.class, 10, 1, 3, EnumCreatureType.MONSTER, BiomeGenBase.hell); //spawns with prob. 10 in groups of 1-3
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
