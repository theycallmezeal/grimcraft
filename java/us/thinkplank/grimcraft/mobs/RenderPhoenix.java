package us.thinkplank.grimcraft.mobs;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import us.thinkplank.grimcraft.Grimcraft;

public class RenderPhoenix extends RenderLiving {
	private static final ResourceLocation phoenixTextures = new ResourceLocation(Grimcraft.MODID + ":textures/entity/phoenix.png");
	public static final Factory factory = new Factory();
	public float wingRotation;
	
	public RenderPhoenix(RenderManager renderManager) {
		super(renderManager, new ModelPhoenix(), 0.5F); // 0.5F is shadow size
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return phoenixTextures;
	}
	
	public static class Factory implements IRenderFactory<EntityPhoenix> {
        @Override
        public Render<? super EntityPhoenix> createRenderFor(RenderManager manager) {
            return new RenderPhoenix(manager);
        }
    }
}
