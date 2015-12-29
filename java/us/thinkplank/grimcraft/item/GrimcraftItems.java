package us.thinkplank.grimcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class GrimcraftItems {
	/* TODO currently equivalent to vanilla materials; will tweak later*/
	// name, harvest level, maxUses, efficiency, damage, enchantability
    static ToolMaterial grimwood_material = EnumHelper.addToolMaterial("GRIMWOOD", 0, 59, 2.0F, 1.0F, 15);
    static ToolMaterial netherrack_material = EnumHelper.addToolMaterial("NETHERRACK", 1, 131, 5.0F, 1.0F, 5);
    static ToolMaterial nether_quartz_material = EnumHelper.addToolMaterial("NETHER_QUARTZ", 0, 32, 13.0F, 0.0F, 22);
    static ToolMaterial nether_gold_material = EnumHelper.addToolMaterial("NETHER_GOLD", 3, 250, 7.0F, 2.0F, 14);
    
    public final static Item grimwood_shovel = new ItemGrimwoodShovel(grimwood_material);
    public final static Item grimwood_pickaxe = new ItemGrimwoodPickaxe(grimwood_material);
    public final static Item grimwood_axe = new ItemGrimwoodAxe(grimwood_material);
    public final static Item grimwood_hoe = new ItemGrimwoodHoe(grimwood_material);
    public final static Item grimwood_sword = new ItemGrimwoodSword(grimwood_material);
    
    public final static Item netherrack_shovel = new ItemNetherrackShovel(netherrack_material);
    public final static Item netherrack_pickaxe = new ItemNetherrackPickaxe(netherrack_material);
    public final static Item netherrack_axe = new ItemNetherrackAxe(netherrack_material);
    public final static Item netherrack_hoe = new ItemNetherrackHoe(netherrack_material);
    public final static Item netherrack_sword = new ItemNetherrackSword(netherrack_material);
    
    public final static Item nether_quartz_shovel = new ItemNetherQuartzShovel(nether_quartz_material);
    public final static Item nether_quartz_pickaxe = new ItemNetherQuartzPickaxe(nether_quartz_material);
    public final static Item nether_quartz_axe = new ItemNetherQuartzAxe(nether_quartz_material);
    public final static Item nether_quartz_hoe = new ItemNetherQuartzHoe(nether_quartz_material);
    public final static Item nether_quartz_sword = new ItemNetherQuartzSword(nether_quartz_material);
    
    public final static Item nether_gold_shovel = new ItemNetherGoldShovel(nether_gold_material);
    public final static Item nether_gold_pickaxe = new ItemNetherGoldPickaxe(nether_gold_material);
    public final static Item nether_gold_axe = new ItemNetherGoldAxe(nether_gold_material);
    public final static Item nether_gold_hoe = new ItemNetherGoldHoe(nether_gold_material);
    public final static Item nether_gold_sword = new ItemNetherGoldSword(nether_gold_material);
    
    public final static Item grimwood_stick = new ItemGrimwoodStick();
    public final static Item wither_bone = new ItemWitherBone();
    public final static Item wither_bonemeal = new ItemWitherBonemeal();
    public final static Item brimstone = new ItemBrimstone();
    public final static Item barley = new ItemBarley();
    public final static Item barley_seeds = new ItemBarleySeeds();
    public final static Item vulpiberry = new ItemVulpiberry();
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
