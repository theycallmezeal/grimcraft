package us.thinkplank.grimcraft.item;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

public class GrimcraftTools {
	//TODO apparently, I need to be extending ItemTool, not the individual tool classes.
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
	
	static class Axe extends ItemTool {
	    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder, Blocks.wooden_button, Blocks.wooden_pressure_plate});

	    protected Axe(Item.ToolMaterial material, String name) {
	        super(material, EFFECTIVE_ON);
	        this.damageVsEntity = 8.0F;
	        this.attackSpeed = -3.2F;
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.tabTools);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }

	    public float getStrVsBlock(ItemStack stack, IBlockState state) {
	        Material material = state.getMaterial();
	        return material != Material.wood && material != Material.plants && material != Material.vine ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
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
