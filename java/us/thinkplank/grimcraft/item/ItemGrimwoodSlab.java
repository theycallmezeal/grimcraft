package us.thinkplank.grimcraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
import us.thinkplank.grimcraft.block.GrimcraftBlocks;

public class ItemGrimwoodSlab extends ItemSlab {
	public ItemGrimwoodSlab(Block block) {
		super(block, (BlockSlab)GrimcraftBlocks.half_grimwood_slab, (BlockSlab)GrimcraftBlocks.double_grimwood_slab, false);
		this.setMaxDamage(0);
        this.setHasSubtypes(true);
	}
}
