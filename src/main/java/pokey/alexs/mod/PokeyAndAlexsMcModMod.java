/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package pokey.alexs.mod;

import software.bernie.geckolib3.GeckoLib;

import pokey.alexs.mod.init.PokeyAndAlexsMcModModPotions;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModParticleTypes;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModItems;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModFeatures;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModBlocks;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModBlockEntities;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("pokey_and_alexs__mc_mod")
public class PokeyAndAlexsMcModMod {
	public static final Logger LOGGER = LogManager.getLogger(PokeyAndAlexsMcModMod.class);
	public static final String MODID = "pokey_and_alexs__mc_mod";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public PokeyAndAlexsMcModMod() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		PokeyAndAlexsMcModModBlocks.REGISTRY.register(bus);
		PokeyAndAlexsMcModModItems.REGISTRY.register(bus);

		PokeyAndAlexsMcModModBlockEntities.REGISTRY.register(bus);
		PokeyAndAlexsMcModModFeatures.REGISTRY.register(bus);

		PokeyAndAlexsMcModModPotions.REGISTRY.register(bus);

		PokeyAndAlexsMcModModParticleTypes.REGISTRY.register(bus);
		GeckoLib.initialize();
	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
