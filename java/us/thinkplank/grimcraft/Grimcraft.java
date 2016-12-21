/*
 * Grimcraft.java 1.0.0
 * Made with love by Lapiman and Fox
 * Licensed under whatever we decide
 * 
 * TODO
 * hunt down any Block == Block and replace with .equals()
 * hunt down world and replace with worldIn
 * hunt down any hard-coded "grimcraft" and replace with a .modid reference
 * give nether foods a growth rate boost
 * maybe make netherroot de-corruptible into potatoes, carrots, and beetroot?
 * make sure all headers match public Item getItemDropped(IBlockState state, Random rand, int fortune)
 * retexture the ugly ass vulpiberry
 * make peat's block model match soul sand's height
 * fix the slabs
 * test: do nether crops grow in the nether? they correctly do not grow in the overworld
 * rename textures/blocks to textures/block (and update the models...)
 */

package us.thinkplank.grimcraft;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

@Mod(modid="grimcraft", name="grimcraft", version="1.0.0")
public class Grimcraft {
    @Instance("Grimcraft")
    public Configuration config;
	
    public static Grimcraft instance;

    @SidedProxy(clientSide="us.thinkplank.grimcraft.ClientProxy", serverSide="us.thinkplank.grimcraft.CommonProxy")
        public static CommonProxy proxy;
	

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
    	
//    	//TODO do boars spawn at all...?
//    	//TODO don't use deprecated stuff
//    	EntityRegistry.registerGlobalEntityID(EntityBoar.class, "boar", EntityRegistry.findGlobalUniqueEntityId(), 0xA26C60, 0x8C3519);
//    	EntityRegistry.registerModEntity(EntityBoar.class, "boar", EntityRegistry.findGlobalUniqueEntityId(), this, 80, 1, true);
//    	RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(new ModelBoar(), 0.5F));
//    	
//    	EntityRegistry.registerGlobalEntityID(EntityPhoenix.class, "phoenix", EntityRegistry.findGlobalUniqueEntityId(), 0x383838, 0x9e2d08);
//    	EntityRegistry.registerModEntity(EntityPhoenix.class, "phoenix", EntityRegistry.findGlobalUniqueEntityId(), this, 80, 1, true);
//    	RenderingRegistry.registerEntityRenderingHandler(EntityPhoenix.class, new RenderPhoenix(new ModelPhoenix(), 0.5F));
//    	
//    	EntityRegistry.addSpawn(EntityCaveSpider.class, 75, 1, 3, EnumCreatureType.MONSTER, Biomes.hell);
//    	EntityRegistry.addSpawn(EntityEnderman.class, 75, 1, 1, EnumCreatureType.MONSTER, Biomes.hell);
//    	EntityRegistry.addSpawn(EntityBoar.class, 100, 1, 3, EnumCreatureType.MONSTER, Biomes.hell);
//    	EntityRegistry.addSpawn(EntityPhoenix.class, 100, 1, 3, EnumCreatureType.MONSTER, Biomes.hell);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
