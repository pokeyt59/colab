
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAndAlexsModModTabs;
import pokey.alexs.mod.init.PokeyAndAlexsModModSounds;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TestItem extends RecordItem {
	public TestItem() {
		super(15, PokeyAndAlexsModModSounds.REGISTRY.get(new ResourceLocation("pokey_and_alexs_mod:clasic_legacy_sounds_music")),
				new Item.Properties().tab(PokeyAndAlexsModModTabs.TAB_PAMOD).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
