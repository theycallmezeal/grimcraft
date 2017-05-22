package us.thinkplank.grimcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class ItemGhastPepper extends ItemFood {
    public ItemGhastPepper() {
        super(2, 1.0F, false);
        setRegistryName("ghast_pepper");
    }
    
    @Override
    public void onFoodEaten(ItemStack itemStack, World worldIn, EntityPlayer player) {
    	EnumDifficulty difficulty = worldIn.getDifficulty();
		double chance = 0;
		if (difficulty == EnumDifficulty.NORMAL) {
			chance = 0.05;
		} else if (difficulty == EnumDifficulty.HARD) {
			chance = 0.1;
		}
		
		if (Math.random() < chance) {
			player.setFire(10);
		}
    }
}
