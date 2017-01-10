package us.thinkplank.grimcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class GrimcraftRecipes {
	public static void register() {
		GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_planks, 4), "x", 'x', new ItemStack(GrimcraftBlocks.grimwood_log));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_stick), "x", "x", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_slab, 6), "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_stairs, 4), "x  ", "xx ", "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.item_grimwood_door), "xx", "xx", "xx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks)); //grimwood door?
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_fence), "xxx", "xxx", 'x', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_fence_gate), "xyx", "xyx", 'x', new ItemStack(GrimcraftItems.grimwood_stick), 'y', new ItemStack(GrimcraftBlocks.grimwood_planks));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.nether_lantern), "xxx", "xyx", "xxx", 'x', new ItemStack(Blocks.STAINED_GLASS, 1, 12), 'y', new ItemStack(GrimcraftItems.brimstone));
        
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.wither_bone), new ItemStack(Items.BONE), new ItemStack(Items.COAL), new ItemStack(GrimcraftItems.brimstone));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.wither_bonemeal, 3), "x", 'x', new ItemStack(GrimcraftItems.wither_bone));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.brimstone_block), "xxx", "xxx", "xxx", 'x', new ItemStack(GrimcraftItems.brimstone));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.brimstone, 9), "x", 'x', new ItemStack(GrimcraftBlocks.brimstone_block));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.FIRE_CHARGE), new ItemStack(Items.GUNPOWDER), new ItemStack(GrimcraftItems.brimstone), new ItemStack(Items.COAL));
        GameRegistry.addRecipe(new ItemStack(Blocks.TNT), "xyx", "yxy", "xyx", 'x', new ItemStack(GrimcraftItems.brimstone), 'y', new ItemStack(Blocks.SAND));
        GameRegistry.addRecipe(new ItemStack(Blocks.TORCH, 12), "x", "y", 'x', new ItemStack(GrimcraftItems.brimstone), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_shovel), "x", "y", "y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_shovel), "x", "y", "y", 'x', new ItemStack(Blocks.NETHERRACK), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_shovel), "x", "y", "y", 'x', new ItemStack(Items.QUARTZ), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_shovel), "x", "y", "y", 'x', new ItemStack(Items.GOLD_INGOT), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Blocks.NETHERRACK), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Items.QUARTZ), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_pickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Items.GOLD_INGOT), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_axe), "xx", "xy", " y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_axe), "xx", "xy", " y", 'x', new ItemStack(Blocks.NETHERRACK), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_axe), "xx", "xy", " y", 'x', new ItemStack(Items.QUARTZ), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_axe), "xx", "xy", " y", 'x', new ItemStack(Items.GOLD_INGOT), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_hoe), "xx", " y", " y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_hoe), "xx", " y", " y", 'x', new ItemStack(Blocks.NETHERRACK), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_hoe), "xx", " y", " y", 'x', new ItemStack(Items.QUARTZ), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_hoe), "xx", " y", " y", 'x', new ItemStack(Items.GOLD_INGOT), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_sword), "x", "x", "y", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.netherrack_sword), "x", "x", "y", 'x', new ItemStack(Blocks.NETHERRACK), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_quartz_sword), "x", "x", "y", 'x', new ItemStack(Items.QUARTZ), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.nether_gold_sword), "x", "x", "y", 'x', new ItemStack(Items.GOLD_INGOT), 'y', new ItemStack(GrimcraftItems.grimwood_stick));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.barley_seeds, 8), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.WHEAT_SEEDS), 'y', new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addRecipe(new ItemStack(Items.BREAD), "xxx", 'x', new ItemStack(GrimcraftItems.barley));
        
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.POTATO), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.CARROT), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.POISONOUS_POTATO), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.BEETROOT), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot_soup), new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.BOWL));

        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.glowstone_grower), "plp", "pbp", "ggg",
        		'p', new ItemStack(GrimcraftBlocks.grimwood_planks),
        		'l', new ItemStack(Items.LAVA_BUCKET),
        		'b', new ItemStack(GrimcraftBlocks.brimstone_block),
        		'g', new ItemStack(Blocks.GLOWSTONE)
        );
        
        GameRegistry.addSmelting(GrimcraftBlocks.nether_coal_ore, new ItemStack(Items.COAL), 0.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.nether_gold_ore, new ItemStack(Items.GOLD_INGOT), 1.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.nether_redstone_ore, new ItemStack(Items.REDSTONE), 0.9f);
        GameRegistry.addSmelting(GrimcraftBlocks.brimstone_ore, new ItemStack(GrimcraftItems.brimstone), 0.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.fossilstone_ore, new ItemStack(Items.DYE, 1, 15), 0.2f);
        GameRegistry.addSmelting(Blocks.SOUL_SAND, new ItemStack(Blocks.STAINED_GLASS, 1, 12), 0.1f); //12 is brown
	}
}
