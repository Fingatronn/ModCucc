
package net.mcreator.prob.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.procedures.FlintPickaxeBlockDestroyedWithToolProcedure;
import net.mcreator.prob.init.ProbModTabs;

public class FlintPickaxeItem extends PickaxeItem {
	public FlintPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 60;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.FLINT));
			}
		}, 1, -3f, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		FlintPickaxeBlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
