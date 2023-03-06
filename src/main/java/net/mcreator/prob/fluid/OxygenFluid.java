
package net.mcreator.prob.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.prob.init.ProbModItems;
import net.mcreator.prob.init.ProbModFluids;
import net.mcreator.prob.init.ProbModFluidTypes;
import net.mcreator.prob.init.ProbModBlocks;

public abstract class OxygenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ProbModFluidTypes.OXYGEN_TYPE.get(),
			() -> ProbModFluids.OXYGEN.get(), () -> ProbModFluids.FLOWING_OXYGEN.get()).explosionResistance(100f)
			.bucket(() -> ProbModItems.OXYGEN_BUCKET.get()).block(() -> (LiquidBlock) ProbModBlocks.OXYGEN.get());

	private OxygenFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OxygenFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OxygenFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
