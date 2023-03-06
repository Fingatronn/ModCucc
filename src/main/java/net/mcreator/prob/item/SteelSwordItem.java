
package net.mcreator.prob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.prob.init.ProbModTabs;
import net.mcreator.prob.init.ProbModItems;

public class SteelSwordItem extends SwordItem {
	public SteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ProbModItems.STEEL_INGOT.get()));
			}
		}, 3, -2.7999999999999998f, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
	}
}
