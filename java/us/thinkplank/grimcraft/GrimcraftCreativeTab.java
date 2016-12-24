package us.thinkplank.grimcraft;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

public class GrimcraftCreativeTab extends CreativeTabs {

	public GrimcraftCreativeTab() {
		super("grimcraft");
	}
	
	List<ItemStack> itemOrder = Arrays.asList(
		new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.grimwood_log)),
		new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.grimwood_planks)),
		new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.grimwood_slab)),
		new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.grimwood_stairs)),
		new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.grimwood_fence)),
		new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.grimwood_fence_gate)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.fossilstone_ore)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.nether_coal_ore)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.nether_gold_ore)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.nether_redstone_ore)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.peat)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.brimstone_ore)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.brimstone_block)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.vulpiberry_bush)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.ghast_pepper_bush)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.nether_lantern)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.lava_lamp)),
        new ItemStack(Item.getItemFromBlock(GrimcraftBlocks.glowstone_grower)),
    	new ItemStack(GrimcraftItems.grimwood_shovel),
        new ItemStack(GrimcraftItems.grimwood_pickaxe),
        new ItemStack(GrimcraftItems.grimwood_axe),
        new ItemStack(GrimcraftItems.grimwood_hoe),
        new ItemStack(GrimcraftItems.grimwood_sword),
        new ItemStack(GrimcraftItems.netherrack_shovel),
        new ItemStack(GrimcraftItems.netherrack_pickaxe),
        new ItemStack(GrimcraftItems.netherrack_axe),
        new ItemStack(GrimcraftItems.netherrack_hoe),
        new ItemStack(GrimcraftItems.netherrack_sword),
        new ItemStack(GrimcraftItems.nether_quartz_shovel),
        new ItemStack(GrimcraftItems.nether_quartz_pickaxe),
        new ItemStack(GrimcraftItems.nether_quartz_axe),
        new ItemStack(GrimcraftItems.nether_quartz_hoe),
        new ItemStack(GrimcraftItems.nether_quartz_sword),
        new ItemStack(GrimcraftItems.nether_gold_shovel),
        new ItemStack(GrimcraftItems.nether_gold_pickaxe),
        new ItemStack(GrimcraftItems.nether_gold_axe),
        new ItemStack(GrimcraftItems.nether_gold_hoe),
        new ItemStack(GrimcraftItems.nether_gold_sword),
        new ItemStack(GrimcraftItems.grimwood_stick),
        new ItemStack(GrimcraftItems.wither_bone),
        new ItemStack(GrimcraftItems.wither_bonemeal),
        new ItemStack(GrimcraftItems.brimstone),
        new ItemStack(GrimcraftItems.barley),
        new ItemStack(GrimcraftItems.barley_seeds),
        new ItemStack(GrimcraftItems.vulpiberry),
        new ItemStack(GrimcraftItems.ghast_pepper),
        new ItemStack(GrimcraftItems.netherroot),
        new ItemStack(GrimcraftItems.netherroot_soup),
        new ItemStack(GrimcraftItems.phoenix_egg)
	);
	
	@Override
	public void displayAllRelevantItems(List<ItemStack> list) {
		super.displayAllRelevantItems(list);
		list.add(2, list.remove(list.size() - 1));
		/* if it works, it works! */
	}

	@Override
	public Item getTabIconItem() {
		return GrimcraftItems.phoenix_egg;
	}

}
