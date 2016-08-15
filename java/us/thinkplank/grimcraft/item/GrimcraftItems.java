package us.thinkplank.grimcraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GrimcraftItems {
	//TODO remove all setMaxStackSize(64) since 64 is the default value
	// name, harvest level, maxUses, efficiency, damage, enchantability
    static ToolMaterial grimwood_material = EnumHelper.addToolMaterial("GRIMWOOD", 0, 59, 2.0F, 1.0F, 15);
    static ToolMaterial netherrack_material = EnumHelper.addToolMaterial("NETHERRACK", 1, 131, 5.0F, 1.0F, 5);
    static ToolMaterial nether_quartz_material = EnumHelper.addToolMaterial("NETHER_QUARTZ", 0, 32, 13.0F, 0.0F, 22);
    static ToolMaterial nether_gold_material = EnumHelper.addToolMaterial("NETHER_GOLD", 3, 250, 7.0F, 2.0F, 14);
    
    public final static Item grimwood_shovel = new GrimcraftTools.Shovel(grimwood_material, "grimwood_shovel");
    public final static Item grimwood_pickaxe = new GrimcraftTools.Pickaxe(grimwood_material, "grimwood_pickaxe");
    public final static Item grimwood_axe = new GrimcraftTools.Axe(grimwood_material, "grimwood_axe");
    public final static Item grimwood_hoe = new GrimcraftTools.Hoe(grimwood_material, "grimwood_hoe");
    public final static Item grimwood_sword = new GrimcraftTools.Sword(grimwood_material, "grimwood_sword");
    
    public final static Item netherrack_shovel = new GrimcraftTools.Shovel(netherrack_material, "netherrack_shovel");
    public final static Item netherrack_pickaxe = new GrimcraftTools.Pickaxe(netherrack_material, "netherrack_pickaxe");
    public final static Item netherrack_axe = new GrimcraftTools.Axe(netherrack_material, "netherrack_axe");
    public final static Item netherrack_hoe = new GrimcraftTools.Hoe(netherrack_material, "netherrack_hoe");
    public final static Item netherrack_sword = new GrimcraftTools.Sword(netherrack_material, "netherrack_sword");
    
    public final static Item nether_quartz_shovel = new GrimcraftTools.Shovel(nether_quartz_material, "nether_quartz_shovel");
    public final static Item nether_quartz_pickaxe = new GrimcraftTools.Pickaxe(nether_quartz_material, "nether_quartz_pickaxe");
    public final static Item nether_quartz_axe = new GrimcraftTools.Axe(nether_quartz_material, "nether_quartz_axe");
    public final static Item nether_quartz_hoe = new GrimcraftTools.Hoe(nether_quartz_material, "nether_quartz_hoe");
    public final static Item nether_quartz_sword = new GrimcraftTools.Sword(nether_quartz_material, "nether_quartz_sword");
    
    public final static Item nether_gold_shovel = new GrimcraftTools.Shovel(nether_gold_material, "nether_gold_shovel");
    public final static Item nether_gold_pickaxe = new GrimcraftTools.Pickaxe(nether_gold_material, "nether_gold_pickaxe");
    public final static Item nether_gold_axe = new GrimcraftTools.Axe(nether_gold_material, "nether_gold_axe");
    public final static Item nether_gold_hoe = new GrimcraftTools.Hoe(nether_gold_material, "nether_gold_hoe");
    public final static Item nether_gold_sword = new GrimcraftTools.Sword(nether_gold_material, "nether_gold_sword");
    
    public final static Item grimwood_stick = new Item().setCreativeTab(CreativeTabs.tabMaterials).setRegistryName("grimwood_stick").setUnlocalizedName("grimwood_stick");
    public final static Item wither_bone = new Item().setCreativeTab(CreativeTabs.tabMaterials).setRegistryName("wither_bone").setUnlocalizedName("wither_bone");
    public final static Item wither_bonemeal = new ItemWitherBonemeal();
    public final static Item brimstone = new Item().setCreativeTab(CreativeTabs.tabMaterials).setRegistryName("brimstone").setUnlocalizedName("brimstone");
    public final static Item barley = new Item().setCreativeTab(CreativeTabs.tabMaterials).setRegistryName("barley").setUnlocalizedName("barley");
    public final static Item barley_seeds = new ItemBarleySeeds();
    public final static Item vulpiberry = new ItemFood(1, 0.1F, false).setCreativeTab(CreativeTabs.tabFood).setRegistryName("vulpiberry").setUnlocalizedName("vulpiberry");
    public final static Item ghast_pepper = new ItemGhastPepper();
    public final static Item netherroot = new ItemNetherroot();
    public final static Item phoenix_egg = new ItemPhoenixEgg();
    public final static Item netherroot_soup = new ItemNetherRootSoup();
    
    public static void register() {
    	registerItem(grimwood_shovel);
        registerItem(grimwood_pickaxe);
        registerItem(grimwood_axe);
        registerItem(grimwood_hoe);
        registerItem(grimwood_sword);
        
        registerItem(netherrack_shovel);
        registerItem(netherrack_pickaxe);
        registerItem(netherrack_axe);
        registerItem(netherrack_hoe);
        registerItem(netherrack_sword);
        
        registerItem(nether_quartz_shovel);
        registerItem(nether_quartz_pickaxe);
        registerItem(nether_quartz_axe);
        registerItem(nether_quartz_hoe);
        registerItem(nether_quartz_sword);
        
        registerItem(nether_gold_shovel);
        registerItem(nether_gold_pickaxe);
        registerItem(nether_gold_axe);
        registerItem(nether_gold_hoe);
        registerItem(nether_gold_sword);
        
        registerItem(grimwood_stick);
        registerItem(wither_bone);
        registerItem(wither_bonemeal);
        registerItem(brimstone);
        registerItem(barley);
        registerItem(barley_seeds);
        registerItem(vulpiberry);
        registerItem(ghast_pepper);
        registerItem(netherroot);
        registerItem(netherroot_soup);
        registerItem(phoenix_egg);
    }
    
    public static void registerModels() {
    	registerItemModel(grimwood_shovel);
        registerItemModel(grimwood_pickaxe);
        registerItemModel(grimwood_axe);
        registerItemModel(grimwood_hoe);
        registerItemModel(grimwood_sword);
        
        registerItemModel(netherrack_shovel);
        registerItemModel(netherrack_pickaxe);
        registerItemModel(netherrack_axe);
        registerItemModel(netherrack_hoe);
        registerItemModel(netherrack_sword);
        
        registerItemModel(nether_quartz_shovel);
        registerItemModel(nether_quartz_pickaxe);
        registerItemModel(nether_quartz_axe);
        registerItemModel(nether_quartz_hoe);
        registerItemModel(nether_quartz_sword);
        
        registerItemModel(nether_gold_shovel);
        registerItemModel(nether_gold_pickaxe);
        registerItemModel(nether_gold_axe);
        registerItemModel(nether_gold_hoe);
        registerItemModel(nether_gold_sword);
        
        registerItemModel(grimwood_stick);
        registerItemModel(wither_bone);
        registerItemModel(wither_bonemeal);
        registerItemModel(brimstone);
        registerItemModel(barley);
        registerItemModel(barley_seeds);
        registerItemModel(vulpiberry);
        registerItemModel(ghast_pepper);
        registerItemModel(netherroot);
        registerItemModel(netherroot_soup);
        registerItemModel(phoenix_egg);
    }
    
    public static void registerItem(Item item) {
    	GameRegistry.register(item);
    }
    
    public static void registerItemModel(Item item) {
    	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
