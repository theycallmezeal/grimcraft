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
		super(Grimcraft.MODID);
	}
	
	@Override
	public void displayAllRelevantItems(List<ItemStack> list) {
		super.displayAllRelevantItems(list);
		list.add(2, list.remove(list.size() - 1));
		/* due to the way registration happens, the slab ends up
		 * at the end of the creative tab after everything else.
		 * this is my super ugly way of moving it to the correct
		 * slot... if it works, it works, right? */
	}

	@Override
	public Item getTabIconItem() {
		return GrimcraftItems.phoenix_egg;
	}

}
