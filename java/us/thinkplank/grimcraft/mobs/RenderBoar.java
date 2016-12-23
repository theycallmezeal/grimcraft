package us.thinkplank.grimcraft.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBoar extends RenderLiving {
	private static final ResourceLocation boarTextures = new ResourceLocation("grimcraft:textures/entity/boar.png");
	public static final Factory factory = new Factory();
	
	public RenderBoar(RenderManager renderManager) {
		super(renderManager, new ModelPig(), 0.5F); // 0.5F is shadow size
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return boarTextures;
	}
	
    public static class Factory implements IRenderFactory<EntityBoar> {
        @Override
        public Render<? super EntityBoar> createRenderFor(RenderManager manager) {
            return new RenderBoar(manager);
        }

    }
}
