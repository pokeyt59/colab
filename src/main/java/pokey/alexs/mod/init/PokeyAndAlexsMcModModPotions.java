
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.PokeyAndAlexsMcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;

public class PokeyAndAlexsMcModModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, PokeyAndAlexsMcModMod.MODID);
	public static final RegistryObject<Potion> TESTPOTIONITEM = REGISTRY.register("testpotionitem", () -> new Potion());
}
