
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.prob.fluid.types.SteamFluidType;
import net.mcreator.prob.fluid.types.OxygenFluidType;
import net.mcreator.prob.fluid.types.OilFluidType;
import net.mcreator.prob.fluid.types.NitrogenFluidType;
import net.mcreator.prob.fluid.types.NitricAcidFluidType;
import net.mcreator.prob.fluid.types.MethanFluidType;
import net.mcreator.prob.fluid.types.KerozineFluidType;
import net.mcreator.prob.fluid.types.HydrogenFluidType;
import net.mcreator.prob.fluid.types.GasolineFluidType;
import net.mcreator.prob.fluid.types.EthanFluidType;
import net.mcreator.prob.fluid.types.ChloreFluidType;
import net.mcreator.prob.fluid.types.AmmoniaFluidType;
import net.mcreator.prob.ProbMod;

public class ProbModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ProbMod.MODID);
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
	public static final RegistryObject<FluidType> STEAM_TYPE = REGISTRY.register("steam", () -> new SteamFluidType());
	public static final RegistryObject<FluidType> METHAN_TYPE = REGISTRY.register("methan", () -> new MethanFluidType());
	public static final RegistryObject<FluidType> ETHAN_TYPE = REGISTRY.register("ethan", () -> new EthanFluidType());
	public static final RegistryObject<FluidType> GASOLINE_TYPE = REGISTRY.register("gasoline", () -> new GasolineFluidType());
	public static final RegistryObject<FluidType> KEROZINE_TYPE = REGISTRY.register("kerozine", () -> new KerozineFluidType());
	public static final RegistryObject<FluidType> OXYGEN_TYPE = REGISTRY.register("oxygen", () -> new OxygenFluidType());
	public static final RegistryObject<FluidType> CHLORE_TYPE = REGISTRY.register("chlore", () -> new ChloreFluidType());
	public static final RegistryObject<FluidType> HYDROGEN_TYPE = REGISTRY.register("hydrogen", () -> new HydrogenFluidType());
	public static final RegistryObject<FluidType> NITROGEN_TYPE = REGISTRY.register("nitrogen", () -> new NitrogenFluidType());
	public static final RegistryObject<FluidType> AMMONIA_TYPE = REGISTRY.register("ammonia", () -> new AmmoniaFluidType());
	public static final RegistryObject<FluidType> NITRIC_ACID_TYPE = REGISTRY.register("nitric_acid", () -> new NitricAcidFluidType());
}
