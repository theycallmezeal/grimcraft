package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

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
    
    public final static Item grimwood_stick = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("grimwood_stick").setTextureName("grimcraft:grimwood_stick");
    public final static Item wither_bone = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("wither_bone").setTextureName("grimcraft:wither_bone");
    public final static Item wither_bonemeal = new ItemWitherBonemeal();
    public final static Item brimstone = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("brimstone").setTextureName("grimcraft:brimstone");
    public final static Item barley = new Item().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("barley").setTextureName("grimcraft:barley");
    public final static Item barley_seeds = new ItemBarleySeeds();
    public final static Item vulpiberry = new ItemFood(1, 0.1F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("vulpiberry").setTextureName("grimcraft:vulpiberry");;
    public final static Item ghast_pepper = new ItemGhastPepper();
    public final static Item netherroot = new ItemNetherroot();
    public final static Item phoenix_egg = new ItemPhoenixEgg();
    public final static Item netherroot_soup = new ItemNetherRootSoup();
    
    public static void register() {
    	GameRegistry.registerItem(grimwood_shovel, "grimwood_shovel");
        GameRegistry.registerItem(grimwood_pickaxe, "grimwood_pickaxe");
        GameRegistry.registerItem(grimwood_axe, "grimwood_axe");
        GameRegistry.registerItem(grimwood_hoe, "grimwood_hoe");
        GameRegistry.registerItem(grimwood_sword, "grimwood_sword");
        
        GameRegistry.registerItem(netherrack_shovel, "netherrack_shovel");
        GameRegistry.registerItem(netherrack_pickaxe, "netherrack_pickaxe");
        GameRegistry.registerItem(netherrack_axe, "netherrack_axe");
        GameRegistry.registerItem(netherrack_hoe, "netherrack_hoe");
        GameRegistry.registerItem(netherrack_sword, "netherrack_sword");
        
        GameRegistry.registerItem(nether_quartz_shovel, "nether_quartz_shovel");
        GameRegistry.registerItem(nether_quartz_pickaxe, "nether_quartz_pickaxe");
        GameRegistry.registerItem(nether_quartz_axe, "nether_quartz_axe");
        GameRegistry.registerItem(nether_quartz_hoe, "nether_quartz_hoe");
        GameRegistry.registerItem(nether_quartz_sword, "nether_quartz_sword");
        
        GameRegistry.registerItem(nether_gold_shovel, "nether_gold_shovel");
        GameRegistry.registerItem(nether_gold_pickaxe, "nether_gold_pickaxe");
        GameRegistry.registerItem(nether_gold_axe, "nether_gold_axe");
        GameRegistry.registerItem(nether_gold_hoe, "nether_gold_hoe");
        GameRegistry.registerItem(nether_gold_sword, "nether_gold_sword");
        
        GameRegistry.registerItem(grimwood_stick, "grimwood_stick");
        GameRegistry.registerItem(wither_bone, "wither_bone");
        GameRegistry.registerItem(wither_bonemeal, "wither_bonemeal");
        GameRegistry.registerItem(brimstone, "brimstone");
        GameRegistry.registerItem(barley, "barley");
        GameRegistry.registerItem(barley_seeds, "barley_seeds");
        GameRegistry.registerItem(vulpiberry, "vulpiberry");
        GameRegistry.registerItem(ghast_pepper, "ghast_pepper");
        GameRegistry.registerItem(netherroot, "netherroot");
        GameRegistry.registerItem(netherroot_soup, "netherrootsoup");
        GameRegistry.registerItem(phoenix_egg, "phoenix_egg");
    }
}
