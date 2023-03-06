
package net.mcreator.prob.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.prob.init.ProbModTabs;

public class BitumenItem extends Item {
	public BitumenItem() {
		super(new Item.Properties().tab(ProbModTabs.TAB_PROBAMOD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
