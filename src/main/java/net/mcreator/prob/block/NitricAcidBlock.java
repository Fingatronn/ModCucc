
package net.mcreator.prob.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.prob.init.ProbModFluids;

public class NitricAcidBlock extends LiquidBlock {
	public NitricAcidBlock() {
		super(() -> ProbModFluids.NITRIC_ACID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
