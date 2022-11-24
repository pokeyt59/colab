
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class TestModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TestModItems.WOOD_LOG_ARMOR_ARMOR_HELMET.get())
			event.setBurnTime(1600);
		else if (itemstack.getItem() == TestModItems.WOOD_LOG_ARMOR_ARMOR_CHESTPLATE.get())
			event.setBurnTime(6000);
		else if (itemstack.getItem() == TestModItems.WOOD_LOG_ARMOR_ARMOR_LEGGINGS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == TestModItems.WOOD_LOG_ARMOR_ARMOR_BOOTS.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == TestModItems.LEAFY_ARMOR_ARMOR_HELMET.get())
			event.setBurnTime(1650);
		else if (itemstack.getItem() == TestModItems.LEAFY_ARMOR_ARMOR_CHESTPLATE.get())
			event.setBurnTime(5000);
		else if (itemstack.getItem() == TestModItems.LEAFY_ARMOR_ARMOR_LEGGINGS.get())
			event.setBurnTime(4940);
		else if (itemstack.getItem() == TestModItems.LEAFY_ARMOR_ARMOR_BOOTS.get())
			event.setBurnTime(2000);
		else if (itemstack.getItem() == TestModItems.LUMINISONMNUGGETRAW.get())
			event.setBurnTime(10000);
	}
}
