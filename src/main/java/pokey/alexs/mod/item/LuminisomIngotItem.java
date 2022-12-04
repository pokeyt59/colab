
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAndAlexsModModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LuminisomIngotItem extends Item {
	public LuminisomIngotItem() {
		super(new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_PAMOD).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
