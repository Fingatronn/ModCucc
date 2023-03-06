
package net.mcreator.prob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.prob.init.ProbModTabs;
import net.mcreator.prob.init.ProbModItems;

public class SteelHoeItem extends HoeItem {
	public SteelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ProbModItems.STEEL_INGOT.get()));
			}
		}, 0, -3.2000000000000001f, new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD));
	}
}
