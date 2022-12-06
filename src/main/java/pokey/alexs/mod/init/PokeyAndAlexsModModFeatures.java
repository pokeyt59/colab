
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package pokey.alexs.mod.init;

import pokey.alexs.mod.world.features.plants.RiceplantFeature;
import pokey.alexs.mod.world.features.ores.TungstenOreFeature;
import pokey.alexs.mod.world.features.ores.ReinforcedtungstenoreFeature;
import pokey.alexs.mod.world.features.ores.LuminisomOreFeature;
import pokey.alexs.mod.world.features.lakes.TestfluidFeature;
import pokey.alexs.mod.PokeyAndAlexsModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class PokeyAndAlexsModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PokeyAndAlexsModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> RICEPLANT = register("riceplant", RiceplantFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, RiceplantFeature.GENERATE_BIOMES, RiceplantFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LUMINISOM_ORE = register("luminisom_ore", LuminisomOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, LuminisomOreFeature.GENERATE_BIOMES, LuminisomOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TESTFLUID = register("testfluid", TestfluidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, TestfluidFeature.GENERATE_BIOMES, TestfluidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> REINFORCEDTUNGSTENORE = register("reinforcedtungstenore", ReinforcedtungstenoreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ReinforcedtungstenoreFeature.GENERATE_BIOMES,
					ReinforcedtungstenoreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TUNGSTEN_ORE = register("tungsten_ore", TungstenOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, TungstenOreFeature.GENERATE_BIOMES, TungstenOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
