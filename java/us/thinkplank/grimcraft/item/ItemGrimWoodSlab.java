package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class ItemGrimWoodSlab extends ItemSlab {
	public ItemGrimWoodSlab(Block block) {
		super(block, (BlockSlab)Grimcraft.grimWoodSlab_single, (BlockSlab)Grimcraft.grimWoodSlab_double, false);
		this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}
}
