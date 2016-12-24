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
 * test: do nether crops grow in the nether? they correctly do not grow in the overworld
 * rename textures/blocks to textures/block (and update the models...)
 * update ja_JP.lang
 * redo the gradient for barley
 * figure out why the slab shows up as last in the list
 */

package us.thinkplank.grimcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
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
	
    public static final CreativeTabs tabGrimcraft = new CreativeTabs("grimcraft") {
        @Override public Item getTabIconItem() {
            return GrimcraftItems.phoenix_egg;
        }
    };

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
    	
    	EntityRegistry.addSpawn(EntityCaveSpider.class, 75, 1, 3, EnumCreatureType.MONSTER, Biomes.HELL);
    	EntityRegistry.addSpawn(EntityEnderman.class, 75, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    }
}
