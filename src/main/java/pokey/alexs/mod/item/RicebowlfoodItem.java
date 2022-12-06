
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAndAlexsModModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class RicebowlfoodItem extends Item {
	public RicebowlfoodItem() {
		super(new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_PAMOD).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(4.1f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 45;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("it would be better steamed"));
	}
}
