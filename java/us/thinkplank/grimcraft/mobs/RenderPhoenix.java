//package us.thinkplank.grimcraft.mobs;
//
//import net.minecraft.client.model.ModelBase;
//import net.minecraft.client.renderer.entity.RenderChicken;
//import net.minecraft.client.renderer.entity.RenderLiving;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.passive.EntityChicken;
//import net.minecraft.util.ResourceLocation;
//
//public class RenderPhoenix extends RenderLiving {
//    private static final ResourceLocation phoenixTextures = new ResourceLocation(Grimcraft.MODID + ":textures/entity/phoenix.png");
//    private static final String __OBFID = "CL_00000984";
//
//    public RenderPhoenix(ModelBase model, float size) {
//        super(model, size);
//    }
//
//    protected ResourceLocation getEntityTexture(EntityBoar boar) {
//        return phoenixTextures;
//    }
//
//    /**
//     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
//     */
//    protected ResourceLocation getEntityTexture(Entity entity) {
//        return phoenixTextures;
//    }
//}
