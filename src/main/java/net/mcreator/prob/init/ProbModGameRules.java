
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProbModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> RADIATION = GameRules.register("radiation", GameRules.Category.PLAYER,
			GameRules.IntegerValue.create(0));
}
