
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

public abstract class NitrogenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ProbModFluidTypes.NITROGEN_TYPE.get(),
			() -> ProbModFluids.NITROGEN.get(), () -> ProbModFluids.FLOWING_NITROGEN.get()).explosionResistance(100f)
			.bucket(() -> ProbModItems.NITROGEN_BUCKET.get()).block(() -> (LiquidBlock) ProbModBlocks.NITROGEN.get());

	private NitrogenFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NitrogenFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NitrogenFluid {
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
