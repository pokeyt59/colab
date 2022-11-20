
package net.mcreator.test.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

public class LuminisonmnuggetrawItem extends Item {
	public LuminisonmnuggetrawItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(10).saturationMod(1.1f)

						.build()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("not ment for childeren 3 and below"));
	}
}
