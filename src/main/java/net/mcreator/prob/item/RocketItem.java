
package net.mcreator.prob.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.prob.init.ProbModTabs;

public class RocketItem extends Item {
	public RocketItem() {
		super(new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
