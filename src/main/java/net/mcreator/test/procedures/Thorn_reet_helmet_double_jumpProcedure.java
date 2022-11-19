package net.mcreator.test.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Thorn_reet_helmet_double_jumpProcedure {
	public static void execute(LevelAccessor world) {
		TestModVariables.MapVariables.get(world).double_jump = 0;
		TestModVariables.MapVariables.get(world).syncData(world);
		TestModVariables.MapVariables.get(world).double_jump = Math.random();
		TestModVariables.MapVariables.get(world).syncData(world);
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(("" + TestModVariables.MapVariables.get(world).double_jump)),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
	}
}
