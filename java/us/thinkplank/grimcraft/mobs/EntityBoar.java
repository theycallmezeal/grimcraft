package us.thinkplank.grimcraft.mobs;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;
import us.thinkplank.grimcraft.item.GrimcraftItems;

public class EntityBoar extends EntityAnimal {
	private World mobWorld;
	
	public EntityBoar(World worldIn) {
		super(worldIn);
		setSize(0.9F, 0.9F);
		isImmuneToFire = true;
	}
	
	public static void func_189790_b(DataFixer datafixer) {
        EntityLiving.func_189752_a(datafixer, "Boar");
    }

    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(1, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(2, new EntityAITempt(this, 1.25D, GrimcraftItems.barley, false));
        this.tasks.addTask(3, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_COW_AMBIENT;
    }

    protected SoundEvent getHurtSound() {
        return SoundEvents.ENTITY_COW_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_COW_DEATH;
    }

    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
    }
    
    protected float getSoundVolume() {
        return 0.4F;
    }

    @Nullable
    protected ResourceLocation getLootTable() {
        return LootTableList.ENTITIES_PIG;
    }

    public EntityBoar createChild(EntityAgeable ageable) {
        return new EntityBoar(this.worldObj);
    }
}
