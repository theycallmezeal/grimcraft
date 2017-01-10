package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemDoor;

public class ItemGrimwoodDoor extends ItemDoor {
	public ItemGrimwoodDoor() {
		super(GrimcraftBlocks.grimwood_door);
		setRegistryName("item_grimwood_door");
	}
}
