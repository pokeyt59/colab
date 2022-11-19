
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.test.network.JumpbindforthornreethelmetMessage;
import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TestModKeyMappings {
	public static final KeyMapping JUMPBINDFORTHORNREETHELMET = new KeyMapping("key.test.jumpbindforthornreethelmet", GLFW.GLFW_KEY_SPACE,
			"key.categories.movement");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(JUMPBINDFORTHORNREETHELMET);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == JUMPBINDFORTHORNREETHELMET.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						TestMod.PACKET_HANDLER.sendToServer(new JumpbindforthornreethelmetMessage(0, 0));
						JumpbindforthornreethelmetMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
