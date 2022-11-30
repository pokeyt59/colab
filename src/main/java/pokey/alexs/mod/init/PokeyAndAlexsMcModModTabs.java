
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PokeyAndAlexsMcModModTabs {
	public static CreativeModeTab TAB_P_AMOD;

	public static void load() {
		TAB_P_AMOD = new CreativeModeTab("tabp_amod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PokeyAndAlexsMcModModItems.LUMINISONMNUGGETRAW.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
