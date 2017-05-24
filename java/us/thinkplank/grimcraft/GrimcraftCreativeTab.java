package us.thinkplank.grimcraft;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import scala.actors.threadpool.Arrays;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class GrimcraftCreativeTab extends CreativeTabs {
//  TODO figure out if this is still needed.
//	private List<Item> ordering;
//	private Comparator<ItemStack> comparator;
	
	public GrimcraftCreativeTab() {
		super(Grimcraft.MODID);
//		ordering = new LinkedList<Item>();
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.grimwood_log));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.grimwood_planks));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.grimwood_slab));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.grimwood_stairs));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.grimwood_fence));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.grimwood_fence_gate));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.fossilstone_ore));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.nether_coal_ore));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.nether_gold_ore));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.nether_redstone_ore));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.peat));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.brimstone_ore));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.brimstone_block));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.barley_crop));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.netherroot_crop));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.vulpiberry_bush));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.ghast_pepper_bush));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.nether_lantern));
//		ordering.add(Item.getItemFromBlock(GrimcraftBlocks.glowstone_grower));
//		ordering.add(GrimcraftItems.grimwood_shovel);
//		ordering.add(GrimcraftItems.grimwood_pickaxe);
//		ordering.add(GrimcraftItems.grimwood_axe);
//		ordering.add(GrimcraftItems.grimwood_hoe);
//		ordering.add(GrimcraftItems.grimwood_sword);
//		ordering.add(GrimcraftItems.netherrack_shovel);
//		ordering.add(GrimcraftItems.netherrack_pickaxe);
//		ordering.add(GrimcraftItems.netherrack_axe);
//		ordering.add(GrimcraftItems.netherrack_hoe);
//		ordering.add(GrimcraftItems.netherrack_sword);
//		ordering.add(GrimcraftItems.nether_quartz_shovel);
//		ordering.add(GrimcraftItems.nether_quartz_pickaxe);
//		ordering.add(GrimcraftItems.nether_quartz_axe);
//		ordering.add(GrimcraftItems.nether_quartz_hoe);
//		ordering.add(GrimcraftItems.nether_quartz_sword);
//		ordering.add(GrimcraftItems.nether_gold_shovel);
//		ordering.add(GrimcraftItems.nether_gold_pickaxe);
//		ordering.add(GrimcraftItems.nether_gold_axe);
//		ordering.add(GrimcraftItems.nether_gold_hoe);
//		ordering.add(GrimcraftItems.nether_gold_sword);
//		ordering.add(GrimcraftItems.grimwood_stick);
//		ordering.add(GrimcraftItems.wither_bone);
//		ordering.add(GrimcraftItems.wither_bonemeal);
//		ordering.add(GrimcraftItems.brimstone);
//		ordering.add(GrimcraftItems.barley);
//		ordering.add(GrimcraftItems.barley_seeds);
//		ordering.add(GrimcraftItems.vulpiberry);
//		ordering.add(GrimcraftItems.ghast_pepper);
//		ordering.add(GrimcraftItems.netherroot);
//		ordering.add(GrimcraftItems.netherroot_soup);
//		ordering.add(GrimcraftItems.phoenix_egg);
//		ordering.add(GrimcraftItems.brimstone_essence);
//		comparator = Ordering.explicit(ordering).onResultOf(new Function<ItemStack, Item>() {
//		    public Item apply(ItemStack input) {
//		        return input.getItem();
//		    }
//		});
	}
	
	@Override
	public void displayAllRelevantItems(List<ItemStack> list) {
		super.displayAllRelevantItems(list);
		//Collections.sort(list, comparator);
	}

	@Override
	public Item getTabIconItem() {
		return GrimcraftItems.phoenix_egg;
	}

}
