
package net.mcreator.prob.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.prob.entity.ReplicatorEntity;

public class ReplicatorRenderer extends MobRenderer<ReplicatorEntity, SpiderModel<ReplicatorEntity>> {
	public ReplicatorRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ReplicatorEntity entity) {
		return new ResourceLocation("prob:textures/entities/rep.png");
	}
}
