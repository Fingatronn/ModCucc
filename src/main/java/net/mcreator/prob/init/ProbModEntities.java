
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.prob.entity.ReplicatorEntity;
import net.mcreator.prob.entity.RPGEntity;
import net.mcreator.prob.entity.P90Entity;
import net.mcreator.prob.ProbMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProbModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ProbMod.MODID);
	public static final RegistryObject<EntityType<P90Entity>> P_90 = register("projectile_p_90",
			EntityType.Builder.<P90Entity>of(P90Entity::new, MobCategory.MISC).setCustomClientFactory(P90Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RPGEntity>> RPG = register("projectile_rpg",
			EntityType.Builder.<RPGEntity>of(RPGEntity::new, MobCategory.MISC).setCustomClientFactory(RPGEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ReplicatorEntity>> REPLICATOR = register("replicator",
			EntityType.Builder.<ReplicatorEntity>of(ReplicatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReplicatorEntity::new).fireImmune().sized(1.4f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ReplicatorEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(REPLICATOR.get(), ReplicatorEntity.createAttributes().build());
	}
}
