
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.prob.fluid.SteamFluid;
import net.mcreator.prob.fluid.OxygenFluid;
import net.mcreator.prob.fluid.OilFluid;
import net.mcreator.prob.fluid.NitrogenFluid;
import net.mcreator.prob.fluid.NitricAcidFluid;
import net.mcreator.prob.fluid.MethanFluid;
import net.mcreator.prob.fluid.KerozineFluid;
import net.mcreator.prob.fluid.HydrogenFluid;
import net.mcreator.prob.fluid.GasolineFluid;
import net.mcreator.prob.fluid.EthanFluid;
import net.mcreator.prob.fluid.ChloreFluid;
import net.mcreator.prob.fluid.AmmoniaFluid;
import net.mcreator.prob.ProbMod;

public class ProbModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ProbMod.MODID);
	public static final RegistryObject<FlowingFluid> OIL = REGISTRY.register("oil", () -> new OilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_OIL = REGISTRY.register("flowing_oil", () -> new OilFluid.Flowing());
	public static final RegistryObject<FlowingFluid> STEAM = REGISTRY.register("steam", () -> new SteamFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_STEAM = REGISTRY.register("flowing_steam", () -> new SteamFluid.Flowing());
	public static final RegistryObject<FlowingFluid> METHAN = REGISTRY.register("methan", () -> new MethanFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_METHAN = REGISTRY.register("flowing_methan", () -> new MethanFluid.Flowing());
	public static final RegistryObject<FlowingFluid> ETHAN = REGISTRY.register("ethan", () -> new EthanFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ETHAN = REGISTRY.register("flowing_ethan", () -> new EthanFluid.Flowing());
	public static final RegistryObject<FlowingFluid> GASOLINE = REGISTRY.register("gasoline", () -> new GasolineFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_GASOLINE = REGISTRY.register("flowing_gasoline", () -> new GasolineFluid.Flowing());
	public static final RegistryObject<FlowingFluid> KEROZINE = REGISTRY.register("kerozine", () -> new KerozineFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_KEROZINE = REGISTRY.register("flowing_kerozine", () -> new KerozineFluid.Flowing());
	public static final RegistryObject<FlowingFluid> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_OXYGEN = REGISTRY.register("flowing_oxygen", () -> new OxygenFluid.Flowing());
	public static final RegistryObject<FlowingFluid> CHLORE = REGISTRY.register("chlore", () -> new ChloreFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CHLORE = REGISTRY.register("flowing_chlore", () -> new ChloreFluid.Flowing());
	public static final RegistryObject<FlowingFluid> HYDROGEN = REGISTRY.register("hydrogen", () -> new HydrogenFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HYDROGEN = REGISTRY.register("flowing_hydrogen", () -> new HydrogenFluid.Flowing());
	public static final RegistryObject<FlowingFluid> NITROGEN = REGISTRY.register("nitrogen", () -> new NitrogenFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_NITROGEN = REGISTRY.register("flowing_nitrogen", () -> new NitrogenFluid.Flowing());
	public static final RegistryObject<FlowingFluid> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_AMMONIA = REGISTRY.register("flowing_ammonia", () -> new AmmoniaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> NITRIC_ACID = REGISTRY.register("nitric_acid", () -> new NitricAcidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_NITRIC_ACID = REGISTRY.register("flowing_nitric_acid",
			() -> new NitricAcidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(STEAM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_STEAM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(METHAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_METHAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ETHAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ETHAN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(GASOLINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GASOLINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(KEROZINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_KEROZINE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(OXYGEN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OXYGEN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CHLORE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CHLORE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(HYDROGEN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYDROGEN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NITROGEN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NITROGEN.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(AMMONIA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_AMMONIA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NITRIC_ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NITRIC_ACID.get(), RenderType.translucent());
		}
	}
}
