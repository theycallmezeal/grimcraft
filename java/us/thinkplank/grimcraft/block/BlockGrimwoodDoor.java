package us.thinkplank.grimcraft.block;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGrimwoodDoor extends BlockDoor {
	protected BlockGrimwoodDoor() {
		super(Material.WOOD);
        setHardness(2F);
        setSoundType(SoundType.WOOD);
        setRegistryName("grimwood_door");
        setHarvestLevel("axe", 0);
	}
}
