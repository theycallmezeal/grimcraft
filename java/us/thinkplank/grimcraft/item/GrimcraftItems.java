package us.thinkplank.grimcraft.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GrimcraftItems {
	/* currently equivalent to vanilla materials; will tweak later*/
    static ToolMaterial grimwood_material = EnumHelper.addToolMaterial("GRIMWOOD", 0, 59, 2.0F, 0.0F, 15); // wood
    static ToolMaterial netherrack_material = EnumHelper.addToolMaterial("NETHERRACK", 1, 131, 4.0F, 1.0F, 5); // stone
    static ToolMaterial nether_quartz_material = EnumHelper.addToolMaterial("NETHER_QUARTZ", 0, 32, 12.0F, 0.0F, 22); // gold
    static ToolMaterial nether_gold_material = EnumHelper.addToolMaterial("NETHER_GOLD", 2, 250, 6.0F, 2.0F, 14); //iron, oddly enough
    
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
    	registerItem(grimwood_shovel, "grimwood_shovel");
        registerItem(grimwood_pickaxe, "grimwood_pickaxe");
        registerItem(grimwood_axe, "grimwood_axe");
        registerItem(grimwood_hoe, "grimwood_hoe");
        registerItem(grimwood_sword, "grimwood_sword");
        
        registerItem(netherrack_shovel, "netherrack_shovel");
       	registerItem(netherrack_pickaxe, "netherrack_pickaxe");
        registerItem(netherrack_axe, "netherrack_axe");
        registerItem(netherrack_hoe, "netherrack_hoe");
        registerItem(netherrack_sword, "netherrack_sword");
        
        registerItem(nether_quartz_shovel, "nether_quartz_shovel");
        registerItem(nether_quartz_pickaxe, "nether_quartz_pickaxe");
        registerItem(nether_quartz_axe, "nether_quartz_axe");
        registerItem(nether_quartz_hoe, "nether_quartz_hoe");
        registerItem(nether_quartz_sword, "nether_quartz_sword");
        
        registerItem(nether_gold_shovel, "nether_gold_shovel");
        registerItem(nether_gold_pickaxe, "nether_gold_pickaxe");
        registerItem(nether_gold_axe, "nether_gold_axe");
        registerItem(nether_gold_hoe, "nether_gold_hoe");
        registerItem(nether_gold_sword, "nether_gold_sword");
        
        registerItem(grimwood_stick, "grimwood_stick");
        registerItem(wither_bone, "wither_bone");
        registerItem(wither_bonemeal, "wither_bonemeal");
        registerItem(brimstone, "brimstone");
        registerItem(barley, "barley");
        registerItem(barley_seeds, "barley_seeds");
        registerItem(vulpiberry, "vulpiberry");
        registerItem(ghast_pepper, "ghast_pepper");
        registerItem(netherroot, "netherroot");
        registerItem(netherroot_soup, "netherrootsoup");
        registerItem(phoenix_egg, "phoenix_egg");
    }
    
    private static void registerItem(Item item, String name) {
    	ItemModelMesher renderItem = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    	
    	GameRegistry.registerItem(item, name);
    	renderItem.register(item, 0, new ModelResourceLocation("grimcraft:" + name, "inventory"));
    }
}
