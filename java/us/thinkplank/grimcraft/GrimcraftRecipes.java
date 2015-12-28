package us.thinkplank.grimcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class GrimcraftRecipes {
	public static void register() {
		GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_planks, 4), "x", 'x', new ItemStack(GrimcraftBlocks.grimwood_log));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.grimwood_stick), "x", "x", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.single_grimwood_slab, 6), "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_stairs, 4), "x  ", "xx ", "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.wooden_door), "xx", "xx", "xx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks)); //grimwood door?
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_fence), "xxx", "xxx", 'x', new ItemStack(GrimcraftItems.grimwood_stick));
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.grimwood_fence_gate), "xyx", "xyx", 'x', new ItemStack(GrimcraftItems.grimwood_stick), 'y', new ItemStack(GrimcraftBlocks.grimwood_planks));
        GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), "xxx", "xxx", 'x', new ItemStack(GrimcraftBlocks.grimwood_planks)); //grimwood trapdoor?
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.nether_lantern), "xxx", "xyx", "xxx", 'x', new ItemStack(Blocks.stained_glass, 12), 'y', new ItemStack(GrimcraftItems.brimstone));
        
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.wither_bone), new ItemStack(Items.bone), new ItemStack(Items.coal), new ItemStack(GrimcraftItems.brimstone));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.wither_bonemeal, 3), "x", 'x', new ItemStack(GrimcraftItems.wither_bone));
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftBlocks.brimstone_block), "xxx", "xxx", "xxx", 'x', new ItemStack(GrimcraftItems.brimstone));
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.brimstone, 9), "x", 'x', new ItemStack(GrimcraftBlocks.brimstone_block));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.fire_charge), new ItemStack(Items.gunpowder), new ItemStack(GrimcraftItems.brimstone), new ItemStack(Items.coal));
        GameRegistry.addRecipe(new ItemStack(Blocks.tnt), "xyx", "yxy", "xyx", 'x', new ItemStack(GrimcraftItems.brimstone), 'y', new ItemStack(Blocks.sand));
        
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
        
        GameRegistry.addRecipe(new ItemStack(GrimcraftItems.barley_seeds, 8), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.wheat_seeds), 'y', new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addRecipe(new ItemStack(Items.bread), "xxx", 'x', new ItemStack(GrimcraftItems.barley));
        
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.potato), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.carrot), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.poisonous_potato), new ItemStack(GrimcraftItems.wither_bonemeal));
        GameRegistry.addShapelessRecipe(new ItemStack(GrimcraftItems.netherroot_soup), new ItemStack(GrimcraftItems.netherroot), new ItemStack(Items.bowl));

        GameRegistry.addSmelting(GrimcraftBlocks.nether_coal_ore, new ItemStack(Items.coal), 0.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.nether_gold_ore, new ItemStack(Items.gold_ingot), 1.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.nether_redstone_ore, new ItemStack(Items.redstone), 0.9f);
        GameRegistry.addSmelting(GrimcraftBlocks.brimstone_ore, new ItemStack(GrimcraftItems.brimstone), 0.2f);
        GameRegistry.addSmelting(GrimcraftBlocks.fossilstone_ore, new ItemStack(Items.dye, 1, 15), 0.2f);
        GameRegistry.addSmelting(Blocks.soul_sand, new ItemStack(Blocks.stained_glass, 15), 0.1f);
	}
}
