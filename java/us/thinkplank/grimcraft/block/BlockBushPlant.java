/* this is intended to be a sorta extender class
 * for blocks that have the behavior of the two bushes we have planned.
 * dunno if this is a good idea...
 * how best to make this as easy-to-use for other people as possible?
 */

package us.thinkplank.grimcraft.block;

import java.util.Random;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import us.thinkplank.grimcraft.Grimcraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class BlockBushPlant extends BlockBush {
	private IIcon[] texture;
	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Nether;
	}
	
	@Override
	protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == Grimcraft.peat;
    }
	
	@Override
	public void updateTick(World world, int x, int y, int z, Random random)
    {
        int l = world.getBlockMetadata(x, y, z);

        if (l < 2 && random.nextInt(10) == 0)
        {
            ++l;
            world.setBlockMetadataWithNotify(x, y, z, l, 2);
        }

        super.updateTick(world, x, y, z, random);
    }
}
