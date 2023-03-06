package net.mcreator.prob.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModFluids;
import net.mcreator.prob.init.ProbModBlocks;

public class PumpUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double x1 = 0;
		double y1 = 0;
		double z1 = 0;
		if (world.getBlockState(new BlockPos(x + x1, y - 1, z)).canOcclude() == false
				&& (world.getBlockState(new BlockPos(x + x1, y - 1, z))).getBlock() == ProbModBlocks.OIL.get()) {
			world.setBlock(new BlockPos(x + x1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 1000;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(
							capability -> capability.fill(new FluidStack(ProbModFluids.OIL.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			x1 = x1 + 1;
		} else {
			x1 = 0;
		}
		if (world.getBlockState(new BlockPos(x, y - 1, z + z1)).canOcclude() == false
				&& (world.getBlockState(new BlockPos(x, y - 1, z + x1))).getBlock() == ProbModBlocks.OIL.get()) {
			world.setBlock(new BlockPos(x, y - 1, z + x1), Blocks.AIR.defaultBlockState(), 3);
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 1000;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.FLUID_HANDLER, null).ifPresent(
							capability -> capability.fill(new FluidStack(ProbModFluids.OIL.get(), _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			z1 = z1 + 1;
		} else {
			z1 = 0;
		}
	}
}
