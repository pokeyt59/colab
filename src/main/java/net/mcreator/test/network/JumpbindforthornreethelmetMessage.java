
package net.mcreator.test.network;

import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JumpbindforthornreethelmetMessage {

	int type, pressedms;

	public JumpbindforthornreethelmetMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public JumpbindforthornreethelmetMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(JumpbindforthornreethelmetMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(JumpbindforthornreethelmetMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			Thorn_reet_helmet_double_jumpProcedure.execute(world);
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		TestMod.addNetworkMessage(JumpbindforthornreethelmetMessage.class, JumpbindforthornreethelmetMessage::buffer,
				JumpbindforthornreethelmetMessage::new, JumpbindforthornreethelmetMessage::handler);
	}

}
