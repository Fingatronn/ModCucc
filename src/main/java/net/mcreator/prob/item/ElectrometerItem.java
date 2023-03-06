
package net.mcreator.prob.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.prob.procedures.ElectrometerRightclickedOnBlockProcedure;
import net.mcreator.prob.init.ProbModTabs;

public class ElectrometerItem extends Item {
	public ElectrometerItem() {
		super(new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ElectrometerRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
