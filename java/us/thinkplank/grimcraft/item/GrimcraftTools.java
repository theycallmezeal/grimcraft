package us.thinkplank.grimcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class GrimcraftTools {
	static class Shovel extends ItemSpade {
	    public Shovel(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.tabTools);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
	
	static class Pickaxe extends ItemPickaxe {
		protected Pickaxe(ToolMaterial material, String name) {
			super(material);
			setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.tabTools);
	        setRegistryName(name);
	        setUnlocalizedName(name);
		}
	}
	
	static class Axe extends ItemAxe {
	    public Axe(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.tabTools);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
	
	static class Hoe extends ItemHoe {
	    public Hoe(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.tabTools);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
	
	static class Sword extends ItemSword {
	    public Sword(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.tabTools);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
}
