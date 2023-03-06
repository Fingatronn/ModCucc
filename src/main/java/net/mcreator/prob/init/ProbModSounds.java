
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.prob.ProbMod;

public class ProbModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ProbMod.MODID);
	public static final RegistryObject<SoundEvent> RPG = REGISTRY.register("rpg", () -> new SoundEvent(new ResourceLocation("prob", "rpg")));
	public static final RegistryObject<SoundEvent> P90 = REGISTRY.register("p90", () -> new SoundEvent(new ResourceLocation("prob", "p90")));
}
