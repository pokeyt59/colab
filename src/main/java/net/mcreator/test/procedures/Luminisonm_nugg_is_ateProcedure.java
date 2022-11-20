package net.mcreator.test.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.Screen;

import java.util.List;

public class Luminisonm_nugg_is_ateProcedure {
	public static void execute(List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (Screen.hasShiftDown()) {
			tooltip.add(new TextComponent("you aren't a 2 or 1 year old are you? (alt for more)"));
			if (Screen.hasAltDown()) {
				tooltip.add(new TextComponent("never gonna give you up never gonna let you down"));
			}
		}
	}
}
