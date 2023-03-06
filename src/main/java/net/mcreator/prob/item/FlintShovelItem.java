
package net.mcreator.prob.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.prob.init.ProbModTabs;

public class FlintShovelItem extends ShovelItem {
	public FlintShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 60;
			}

			public float getSpeed() {
				return 5f;
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
}
