package us.thinkplank.grimcraft.mobs;

import us.thinkplank.grimcraft.item.GrimcraftItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityBoar extends EntityAnimal {
    private static final String __OBFID = "CL_00001640";

    public EntityBoar(World world) {
        super(world);
        this.setSize(0.9F, 1.3F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, GrimcraftItems.barley, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }

    @Override
    public boolean isAIEnabled() {
        return true;
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224D);
    }

    @Override
    protected String getLivingSound() {
        return "mob.cow.say";
    }
    
    @Override
    protected String getHurtSound() {
        return "mob.cow.hurt";
    }

    @Override
    protected String getDeathSound() {
        return "mob.cow.hurt";
    }

    @Override
    protected void func_145780_a(int x, int y, int z, Block block) {
        this.playSound("mob.cow.step", 0.15F, 1.0F);
    }

    @Override
    protected float getSoundVolume() {
        return 0.4F;
    }

    @Override
    protected Item getDropItem() {
        return Items.leather;
    }

    @Override
    protected void dropFewItems(boolean recentlyHit, int looting)  {
        int i = this.rand.nextInt(3) + this.rand.nextInt(1 + looting);
        int j;

        for (j = 0; j < i; j++) {
            this.dropItem(Items.leather, 1);
        }

        i = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + looting);

        for (j = 0; j < i; j++) {
            if (this.isBurning()) {
                this.dropItem(Items.cooked_porkchop, 1);
            } else {
                this.dropItem(Items.porkchop, 1);
            }
        }
    }
    
    @Override
    public boolean isBreedingItem(ItemStack itemstack) {
    	return itemstack.getItem().equals(GrimcraftItems.barley);
    }
    
    @Override
    public boolean interact(EntityPlayer player) {
    	return super.interact(player);
    }

    @Override
    public EntityBoar createChild(EntityAgeable p_90011_1_) {
        return new EntityBoar(this.worldObj);
    }
}
