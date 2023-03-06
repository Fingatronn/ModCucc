
package net.mcreator.prob.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.prob.procedures.RefinedNaquadahDioxidLivingEntityIsHitWithItemProcedure;
import net.mcreator.prob.init.ProbModTabs;

import java.util.List;

public class RefinedNaquadahDioxidItem extends Item {
	public RefinedNaquadahDioxidItem() {
		super(new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Nq4"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RefinedNaquadahDioxidLivingEntityIsHitWithItemProcedure.execute(context.getLevel(), context.getClickedPos().getX(),
				context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		RefinedNaquadahDioxidLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return retval;
	}
}
