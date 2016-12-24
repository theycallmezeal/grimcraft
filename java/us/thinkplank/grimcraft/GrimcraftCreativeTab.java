package us.thinkplank.grimcraft;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GrimcraftCreativeTab extends CreativeTabs {

	public GrimcraftCreativeTab() {
		super("grimcraft");
	}
	
	List<Item> itemOrder = Arrays.asList(
		Item.getItemFromBlock(GrimcraftBlocks.grimwood_log),
		Item.getItemFromBlock(GrimcraftBlocks.grimwood_planks),
		Item.getItemFromBlock(GrimcraftBlocks.grimwood_slab),
		Item.getItemFromBlock(GrimcraftBlocks.grimwood_stairs),
		Item.getItemFromBlock(GrimcraftBlocks.grimwood_fence),
		Item.getItemFromBlock(GrimcraftBlocks.grimwood_fence_gate),
        Item.getItemFromBlock(GrimcraftBlocks.fossilstone_ore),
        Item.getItemFromBlock(GrimcraftBlocks.nether_coal_ore),
        Item.getItemFromBlock(GrimcraftBlocks.nether_gold_ore),
        Item.getItemFromBlock(GrimcraftBlocks.nether_redstone_ore),
        Item.getItemFromBlock(GrimcraftBlocks.peat),
        Item.getItemFromBlock(GrimcraftBlocks.brimstone_ore),
        Item.getItemFromBlock(GrimcraftBlocks.brimstone_block),
        Item.getItemFromBlock(GrimcraftBlocks.vulpiberry_bush),
        Item.getItemFromBlock(GrimcraftBlocks.ghast_pepper_bush),
        Item.getItemFromBlock(GrimcraftBlocks.nether_lantern),
        Item.getItemFromBlock(GrimcraftBlocks.lava_lamp),
        Item.getItemFromBlock(GrimcraftBlocks.glowstone_grower),
    	GrimcraftItems.grimwood_shovel,
        GrimcraftItems.grimwood_pickaxe,
        GrimcraftItems.grimwood_axe,
        GrimcraftItems.grimwood_hoe,
        GrimcraftItems.grimwood_sword,
        GrimcraftItems.netherrack_shovel,
        GrimcraftItems.netherrack_pickaxe,
        GrimcraftItems.netherrack_axe,
        GrimcraftItems.netherrack_hoe,
        GrimcraftItems.netherrack_sword,
        GrimcraftItems.nether_quartz_shovel,
        GrimcraftItems.nether_quartz_pickaxe,
        GrimcraftItems.nether_quartz_axe,
        GrimcraftItems.nether_quartz_hoe,
        GrimcraftItems.nether_quartz_sword,
        GrimcraftItems.nether_gold_shovel,
        GrimcraftItems.nether_gold_pickaxe,
        GrimcraftItems.nether_gold_axe,
        GrimcraftItems.nether_gold_hoe,
        GrimcraftItems.nether_gold_sword,
        GrimcraftItems.grimwood_stick,
        GrimcraftItems.wither_bone,
        GrimcraftItems.wither_bonemeal,
        GrimcraftItems.brimstone,
        GrimcraftItems.barley,
        GrimcraftItems.barley_seeds,
        GrimcraftItems.vulpiberry,
        GrimcraftItems.ghast_pepper,
        GrimcraftItems.netherroot,
        GrimcraftItems.netherroot_soup,
        GrimcraftItems.phoenix_egg
	);
	
	Comparator<ItemStack> comparator = Ordering.explicit(itemOrder).onResultOf(new Function<ItemStack, Item>() {
	    @Override
	    public Item apply(ItemStack input) {
	        return input.getItem();
	    }
	});
	
	@Override
	public void displayAllRelevantItems(List<ItemStack> list) {
		super.displayAllRelevantItems(list); /* fill the list. */
		Collections.sort(list, comparator);
	}

	@Override
	public Item getTabIconItem() {
		return GrimcraftItems.phoenix_egg;
	}

}
