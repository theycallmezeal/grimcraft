package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GrimcraftItems {
	//TODO remove all setMaxStackSize(64) since 64 is the default value
	// name, harvest level, maxUses, efficiency, damage, enchantability
    static ToolMaterial grimwood_material = EnumHelper.addToolMaterial("GRIMWOOD", 0, 59, 2.0F, 1.0F, 15);
    static ToolMaterial netherrack_material = EnumHelper.addToolMaterial("NETHERRACK", 1, 131, 5.0F, 1.0F, 5);
    static ToolMaterial nether_quartz_material = EnumHelper.addToolMaterial("NETHER_QUARTZ", 0, 32, 13.0F, 0.0F, 22);
    static ToolMaterial nether_gold_material = EnumHelper.addToolMaterial("NETHER_GOLD", 3, 250, 7.0F, 2.0F, 14);
    
    public final static Item grimwood_shovel = new GrimcraftTools.Shovel(grimwood_material, "grimwood_axe");
    public final static Item grimwood_pickaxe = new GrimcraftTools.Pickaxe(grimwood_material, "grimwood_pickaxe");
    public final static Item grimwood_axe = new GrimcraftTools.Axe(grimwood_material, "grimwood_axe");
    public final static Item grimwood_hoe = new GrimcraftTools.Hoe(grimwood_material, "grimwood_hoe");
    public final static Item grimwood_sword = new GrimcraftTools.Sword(grimwood_material, "grimwood_sword");
    
    public final static Item netherrack_shovel = new GrimcraftTools.Shovel(netherrack_material, "netherrack_axe");
    public final static Item netherrack_pickaxe = new GrimcraftTools.Pickaxe(netherrack_material, "netherrack_pickaxe");
    public final static Item netherrack_axe = new GrimcraftTools.Axe(netherrack_material, "netherrack_axe");
    public final static Item netherrack_hoe = new GrimcraftTools.Hoe(netherrack_material, "netherrack_hoe");
    public final static Item netherrack_sword = new GrimcraftTools.Sword(netherrack_material, "netherrack_sword");
    
    public final static Item nether_quartz_shovel = new GrimcraftTools.Shovel(nether_quartz_material, "nether_quartz_axe");
    public final static Item nether_quartz_pickaxe = new GrimcraftTools.Pickaxe(nether_quartz_material, "nether_quartz_pickaxe");
    public final static Item nether_quartz_axe = new GrimcraftTools.Axe(nether_quartz_material, "nether_quartz_axe");
    public final static Item nether_quartz_hoe = new GrimcraftTools.Hoe(nether_quartz_material, "nether_quartz_hoe");
    public final static Item nether_quartz_sword = new GrimcraftTools.Sword(nether_quartz_material, "nether_quartz_sword");
    
    public final static Item nether_gold_shovel = new GrimcraftTools.Shovel(nether_gold_material, "nether_gold_axe");
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
    	GameRegistry.register(grimwood_shovel);
        GameRegistry.register(grimwood_pickaxe);
        GameRegistry.register(grimwood_axe);
        GameRegistry.register(grimwood_hoe);
        GameRegistry.register(grimwood_sword);
        
        GameRegistry.register(netherrack_shovel);
        GameRegistry.register(netherrack_pickaxe);
        GameRegistry.register(netherrack_axe);
        GameRegistry.register(netherrack_hoe);
        GameRegistry.register(netherrack_sword);
        
        GameRegistry.register(nether_quartz_shovel);
        GameRegistry.register(nether_quartz_pickaxe);
        GameRegistry.register(nether_quartz_axe);
        GameRegistry.register(nether_quartz_hoe);
        GameRegistry.register(nether_quartz_sword);
        
        GameRegistry.register(nether_gold_shovel);
        GameRegistry.register(nether_gold_pickaxe);
        GameRegistry.register(nether_gold_axe);
        GameRegistry.register(nether_gold_hoe);
        GameRegistry.register(nether_gold_sword);
        
        GameRegistry.register(grimwood_stick);
        GameRegistry.register(wither_bone);
        GameRegistry.register(wither_bonemeal);
        GameRegistry.register(brimstone);
        GameRegistry.register(barley);
        GameRegistry.register(barley_seeds);
        GameRegistry.register(vulpiberry);
        GameRegistry.register(ghast_pepper);
        GameRegistry.register(netherroot);
        GameRegistry.register(netherroot_soup);
        GameRegistry.register(phoenix_egg);
    }
}
