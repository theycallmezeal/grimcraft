package us.thinkplank.grimcraft;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class GrimcraftCreativeTab extends CreativeTabs {

	public GrimcraftCreativeTab() {
		super(Grimcraft.MODID);
	}
	
	@Override
	public void displayAllRelevantItems(List<ItemStack> list) {
		super.displayAllRelevantItems(list);
		list.add(2, list.remove(list.size() - 2)); // slab
		list.add(6, list.remove(list.size() - 1)); // door
		/* due to the way registration happens, the slab and door
		 * end up at the end of the creative tab after everything
		 * else. this is my super ugly way of moving it to the
		 * correct slot... if it works, it works, right? */
	}

	@Override
	public Item getTabIconItem() {
		return GrimcraftItems.phoenix_egg;
	}

}
