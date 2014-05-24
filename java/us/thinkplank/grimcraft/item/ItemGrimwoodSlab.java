package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class ItemGrimwoodSlab extends ItemSlab {
	public ItemGrimwoodSlab(Block block) {
		super(block, (BlockSlab)Grimcraft.single_grimwood_slab, (BlockSlab)Grimcraft.double_grimwood_slab, false);
		this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}
}
