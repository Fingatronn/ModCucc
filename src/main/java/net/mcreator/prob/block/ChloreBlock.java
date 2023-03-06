
package net.mcreator.prob.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.procedures.ChloreMobplayerCollidesBlockProcedure;
import net.mcreator.prob.init.ProbModFluids;

public class ChloreBlock extends LiquidBlock {
	public ChloreBlock() {
		super(() -> ProbModFluids.CHLORE.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		ChloreMobplayerCollidesBlockProcedure.execute(entity);
	}
}
