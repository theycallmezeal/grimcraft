package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBarleySeeds extends Item {
    public ItemBarleySeeds() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("barleySeeds");
        setTextureName("grimcraft:barleySeeds");
    }
}
