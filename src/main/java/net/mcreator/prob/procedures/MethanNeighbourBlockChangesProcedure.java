package net.mcreator.prob.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;

public class MethanNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.FIRE) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.FIRE) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.FIRE) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.FIRE) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.FIRE) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.TORCH
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.FIRE) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
		}
	}
}
