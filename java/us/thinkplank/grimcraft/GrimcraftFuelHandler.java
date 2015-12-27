package us.thinkplank.grimcraft;

import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class GrimcraftFuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel) {
        Item fuelType = fuel.getItem();
        if (fuelType == GrimcraftItems.brimstone) {
            return 2400;
        } else if (fuelType == GrimcraftItems.ghast_pepper) {
            return 100;
        } else {
            return 0;
        }
    }
}
