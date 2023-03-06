package net.mcreator.prob.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;

import net.mcreator.prob.ProbMod;

public class StickyItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("bumm") == 1) {
			ProbMod.queueServerWork(70, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 6, Explosion.BlockInteraction.DESTROY);
			});
		}
	}
}
