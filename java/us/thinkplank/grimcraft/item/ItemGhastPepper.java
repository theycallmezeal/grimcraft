package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class ItemGhastPepper extends ItemFood {
    public ItemGhastPepper() {
        super(2, 0.8F, false);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("ghast_pepper");
        setTextureName("grimcraft:ghast_pepper");
    }
    
    @Override
    public void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player) {
    	EnumDifficulty difficulty = world.difficultySetting;
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
