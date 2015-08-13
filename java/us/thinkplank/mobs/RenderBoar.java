package us.thinkplank.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

public class RenderBoar extends RenderLiving {
    private static final ResourceLocation boarTextures = new ResourceLocation("grimcraft:textures/entity/boar.png");
    private static final String __OBFID = "CL_00000984";

    public RenderBoar(ModelBase model, float size) {
        super(model, size);
    }

    protected ResourceLocation getEntityTexture(EntityBoar boar) {
        return boarTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity) {
        return this.getEntityTexture((EntityBoar) entity);
    }
}
