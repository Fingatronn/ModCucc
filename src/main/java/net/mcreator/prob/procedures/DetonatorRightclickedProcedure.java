package net.mcreator.prob.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.prob.network.ProbModVariables;
import net.mcreator.prob.ProbMod;

public class DetonatorRightclickedProcedure {
	public static void execute(LevelAccessor world) {
		ProbMod.queueServerWork(10, () -> {
			ProbModVariables.MapVariables.get(world).detonator = 1;
			ProbModVariables.MapVariables.get(world).syncData(world);
		});
		ProbMod.queueServerWork(30, () -> {
			ProbModVariables.MapVariables.get(world).detonator = 0;
			ProbModVariables.MapVariables.get(world).syncData(world);
		});
	}
}
