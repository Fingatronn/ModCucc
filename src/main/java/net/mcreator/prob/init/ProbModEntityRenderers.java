
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.prob.client.renderer.ReplicatorRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProbModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ProbModEntities.P_90.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ProbModEntities.RPG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ProbModEntities.REPLICATOR.get(), ReplicatorRenderer::new);
	}
}
