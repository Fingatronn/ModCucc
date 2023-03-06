
package net.mcreator.prob.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.prob.init.ProbModFluids;

public class NitrogenBlock extends LiquidBlock {
	public NitrogenBlock() {
		super(() -> ProbModFluids.NITROGEN.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
