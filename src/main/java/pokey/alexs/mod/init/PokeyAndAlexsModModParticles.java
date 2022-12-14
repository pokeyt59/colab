
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.client.particle.TestnotpermParticle;
import pokey.alexs.mod.client.particle.LightliquidparticalParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PokeyAndAlexsModModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) PokeyAndAlexsModModParticleTypes.TESTNOTPERM.get(),
				TestnotpermParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) PokeyAndAlexsModModParticleTypes.LIGHTLIQUIDPARTICAL.get(),
				LightliquidparticalParticle::provider);
	}
}
