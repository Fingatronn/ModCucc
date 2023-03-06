package net.mcreator.prob.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.prob.network.ProbModVariables;
import net.mcreator.prob.ProbMod;

public class DetonatorItemInHandTickProcedure {
	public static void execute(LevelAccessor world) {
		ProbMod.LOGGER.info(ProbModVariables.MapVariables.get(world).detonator);
	}
}
