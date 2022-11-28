
package pokey.alexs.mod.item;

import pokey.alexs.mod.init.PokeyAndAlexsMcModModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

public class TestfluidItem extends BucketItem {
	public TestfluidItem() {
		super(PokeyAndAlexsMcModModFluids.TESTFLUID,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
