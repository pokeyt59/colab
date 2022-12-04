
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PokeyAndAlexsModModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(PokeyAndAlexsModModItems.WOOD_LOG_ARMOR_ARMOR_HELMET.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAndAlexsModModItems.WOOD_LOG_ARMOR_ARMOR_CHESTPLATE.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAndAlexsModModItems.WOOD_LOG_ARMOR_ARMOR_LEGGINGS.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(PokeyAndAlexsModModItems.WOOD_LOG_ARMOR_ARMOR_BOOTS.get(), 1f);
	}
}
