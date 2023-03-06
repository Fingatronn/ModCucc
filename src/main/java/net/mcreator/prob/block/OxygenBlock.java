
package net.mcreator.prob.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.prob.init.ProbModFluids;

public class OxygenBlock extends LiquidBlock {
	public OxygenBlock() {
		super(() -> ProbModFluids.OXYGEN.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
