package us.thinkplank.grimcraft.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;

public class RenderPhoenix extends RenderChicken {
	public RenderPhoenix(ModelBase model, float size) {
		super(model, size);
	}

	private static final ResourceLocation chickenTextures = new ResourceLocation("grimcraft:textures/entity/phoenix.png");
	
	@Override
	protected ResourceLocation getEntityTexture(EntityChicken p_110775_1_) {
        return chickenTextures;
    }
}
