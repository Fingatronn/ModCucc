package net.mcreator.prob.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SaltBlockAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() == false
				&& world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude() == true) {
			return true;
		}
		return false;
	}
}
