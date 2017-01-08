package us.thinkplank.grimcraft.item;

import net.minecraft.item.ItemSoup;

public class ItemNetherRootSoup extends ItemSoup {
    public ItemNetherRootSoup() {
        super(6); // 6 = hunger points
        setRegistryName("netherroot_soup");
    }
}