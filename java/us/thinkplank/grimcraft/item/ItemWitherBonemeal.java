package us.thinkplank.grimcraft.item;

import us.thinkplank.grimcraft.block.GrimcraftBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWitherBonemeal extends Item {
    public ItemWitherBonemeal() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName("wither_bonemeal");
    }

    //TODO find out what the rest of these args do
    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, BlockPos pos, int par7, float par8, float par9, float par10) {
        if (itemStack == null) {
            return false;
        } else if (player.canPlayerEdit(pos, par7, itemStack)) {
            if (world.getBlock(pos) == GrimcraftBlocks.barley_crop) {
                int currentMeta = world.getBlockMetadata(pos);
                world.setBlockMetadataWithNotify(pos, currentMeta + 1, 2);
                itemStack.stackSize--;
            }
        }
        return false;
    }
}
