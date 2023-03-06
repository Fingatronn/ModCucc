package net.mcreator.prob.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.network.ProbModVariables;

public class C4OnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (ProbModVariables.MapVariables.get(world).detonator == 1) {
			for (int index0 = 0; index0 < (int) (Mth.nextDouble(RandomSource.create(), 5, 20)); index0++) {
				world.setBlock(new BlockPos(x + Mth.nextDouble(RandomSource.create(), 1, 15), y + Mth.nextDouble(RandomSource.create(), 1, 15),
						z + Mth.nextDouble(RandomSource.create(), 1, 15)), Blocks.FIRE.defaultBlockState(), 3);
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.DESTROY);
		}
	}
}
