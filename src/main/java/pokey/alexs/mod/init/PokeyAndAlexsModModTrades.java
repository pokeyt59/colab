
/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package pokey.alexs.mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PokeyAndAlexsModModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.SLIME_BLOCK),

				new ItemStack(Blocks.COMPARATOR, 9), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.SLIME_BALL),

				new ItemStack(Blocks.COMPARATOR), 90, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.SLIME_BALL), new ItemStack(Items.HONEY_BOTTLE),
				new ItemStack(Blocks.COMPARATOR), 6000, 1, 1f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Blocks.CAKE),

				new ItemStack(Blocks.BEE_NEST, 10), 10, 5, 0.05f));
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(Items.SWEET_BERRIES, 2),

				new ItemStack(Blocks.SUNFLOWER, 20), 10, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.REDSTONE_WIRE, 5),

					new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_ARMOR_HELMET.get()), 20, 1, 0.01f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.SUGAR_CANE, 10),

					new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_ARMOR_CHESTPLATE.get()), 10, 10, 0.19f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(PokeyAndAlexsModModItems.IMPROVISEDCAKE.get()),

					new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_ARMOR_LEGGINGS.get()), 10, 100, 1f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_INGOT.get()),

					new ItemStack(PokeyAndAlexsModModItems.LUMINISOM_ARMOR_BOOTS.get()), 10, 2, 0.04f));
			event.getTrades().get(3).add(
					new BasicItemListing(new ItemStack(Items.EMERALD, 22), new ItemStack(Items.BEEF, 3), new ItemStack(Blocks.BEACON, 2), 20, 5, 1f));
		}
	}
}
