
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(TestModItems.WOOD_LOG_ARMOR_ARMOR_HELMET.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(TestModItems.WOOD_LOG_ARMOR_ARMOR_CHESTPLATE.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(TestModItems.WOOD_LOG_ARMOR_ARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(TestModItems.WOOD_LOG_ARMOR_ARMOR_BOOTS.get(), 1f);
	}
}
