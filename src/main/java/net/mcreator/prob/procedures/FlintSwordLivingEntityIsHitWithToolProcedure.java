package net.mcreator.prob.procedures;

import net.minecraft.world.entity.Entity;

public class FlintSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(8);
	}
}
