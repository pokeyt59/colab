
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAndAlexsModModTabs;
import pokey.alexs.mod.init.PokeyAndAlexsModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class LuminisomPickaxeItem extends PickaxeItem {
	public LuminisomPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 902;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 35;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_PAMOD));
	}
}
