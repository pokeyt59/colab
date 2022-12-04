
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class PokeyAndAlexsModModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			PokeyAndAlexsModMod.MODID);
	public static final RegistryObject<ParticleType<?>> TESTNOTPERM = REGISTRY.register("testnotperm", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> LIGHTLIQUIDPARTICAL = REGISTRY.register("lightliquidpartical",
			() -> new SimpleParticleType(false));
}
