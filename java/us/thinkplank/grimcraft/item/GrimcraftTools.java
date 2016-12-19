package us.thinkplank.grimcraft.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

import com.google.common.collect.Sets;

public class GrimcraftTools {
	//TODO apparently, I need to be extending ItemTool, not the individual tool classes.
	static class Shovel extends ItemSpade {
	    public Shovel(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.TOOLS);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
	
	static class Pickaxe extends ItemPickaxe {
		protected Pickaxe(ToolMaterial material, String name) {
			super(material);
			setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.TOOLS);
	        setRegistryName(name);
	        setUnlocalizedName(name);
		}
	}
	
	static class Axe extends ItemTool {
	    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

	    protected Axe(Item.ToolMaterial material, String name) {
	        super(material, EFFECTIVE_ON);
	        this.damageVsEntity = 8.0F;
	        this.attackSpeed = -3.2F;
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.TOOLS);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }

	    @Override
		public float getStrVsBlock(ItemStack stack, IBlockState state) {
	        Material material = state.getMaterial();
	        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
	    }
	}
	
	static class Hoe extends ItemHoe {
	    public Hoe(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.TOOLS);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
	
	static class Sword extends ItemSword {
	    public Sword(ToolMaterial material, String name) {
	        super(material);
	        setMaxStackSize(1);
	        setCreativeTab(CreativeTabs.TOOLS);
	        setRegistryName(name);
	        setUnlocalizedName(name);
	    }
	}
}
