
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.LuminisomOreBlock;
import net.mcreator.test.block.LuminisomBlockBlock;
import net.mcreator.test.block.BatterytestBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> BATTERYTEST = REGISTRY.register("batterytest", () -> new BatterytestBlock());
	public static final RegistryObject<Block> LUMINISOM_BLOCK = REGISTRY.register("luminisom_block", () -> new LuminisomBlockBlock());
	public static final RegistryObject<Block> LUMINISOM_ORE = REGISTRY.register("luminisom_ore", () -> new LuminisomOreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BatterytestBlock.registerRenderLayer();
		}
	}
}
