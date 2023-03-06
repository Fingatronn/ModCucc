package net.mcreator.prob.procedures;

import net.minecraft.world.entity.Entity;

public class StickyEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("bumm", 1);
	}
}
