package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class ItemBarleySeeds extends ItemSeeds {
    public ItemBarleySeeds() {
        super(Grimcraft.peat, Block.getBlockFromName("minecraft:farmland"));
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("barley_seeds");
        setTextureName("grimcraft:barley_seeds");
    }
}
