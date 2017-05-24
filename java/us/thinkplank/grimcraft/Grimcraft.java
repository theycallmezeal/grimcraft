/*
 * Grimcraft.java 1.0.0
 * Made with love by Lapiman
 * Thanks to Fox for the help
 * Licensed under whatever I decide
 * 
 * TODO
 * implement the mechanic to create overworld materials
 * add fox
 * config for...
 * 	ore gen
 *  nether lair on/off
 *  mobs dropping brimstone
 *  mob spawns (all)
 *  ghast peppers setting you on fire
 *  brimstone chance of poisoning
 * ensure the same seed gives you the same ore locations every time
 * give block hardnesses a look-through
 * make boars and phoenixes attack you
 * update ja_JP.lang
 * see if the creative tab ordering is still wonky when the mod is loaded completely anew
 */

package us.thinkplank.grimcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Biomes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.oredict.OreDictionary;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
public class Grimcraft {
	public static final String MODID = "grimcraft";
    public Configuration config;
    
    @Instance("grimcraft")
    public static Grimcraft instance;
    public Grimcraft() {
    	instance = this;
    }

    @SidedProxy(clientSide="us.thinkplank.grimcraft.ClientProxy", serverSide="us.thinkplank.grimcraft.CommonProxy")
    public static CommonProxy proxy;
	
    public static final CreativeTabs tabGrimcraft = new GrimcraftCreativeTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	this.config = new Configuration(event.getSuggestedConfigurationFile());
    	proxy.preInit();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new GrimcraftEventHandler());
    	
    	OreDictionary.registerOre("oreFossilstone", GrimcraftBlocks.fossilstone_ore);
    	OreDictionary.registerOre("oreCoal", GrimcraftBlocks.nether_coal_ore);
    	OreDictionary.registerOre("oreGold", GrimcraftBlocks.nether_gold_ore);
    	OreDictionary.registerOre("oreRedstone", GrimcraftBlocks.nether_redstone_ore);
    	OreDictionary.registerOre("oreSulfur", GrimcraftBlocks.brimstone_ore); //makes brimstone work as sulfur
    	
    	OreDictionary.registerOre("logWood", GrimcraftBlocks.grimwood_log);
    	OreDictionary.registerOre("plankWood", GrimcraftBlocks.grimwood_planks);
    	OreDictionary.registerOre("slabWood", GrimcraftBlocks.grimwood_slab);
    	OreDictionary.registerOre("stairWood", GrimcraftBlocks.grimwood_stairs);
    	OreDictionary.registerOre("stickWood", GrimcraftItems.grimwood_stick);
    	
    	EntityRegistry.addSpawn(EntityCaveSpider.class, 75, 1, 3, EnumCreatureType.MONSTER, Biomes.HELL);
    	EntityRegistry.addSpawn(EntityEnderman.class, 75, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
