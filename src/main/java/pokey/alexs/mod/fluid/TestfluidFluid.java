
package pokey.alexs.mod.fluid;

import pokey.alexs.mod.init.PokeyAndAlexsMcModModParticleTypes;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModItems;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModFluids;
import pokey.alexs.mod.init.PokeyAndAlexsMcModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

public abstract class TestfluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PokeyAndAlexsMcModModFluids.TESTFLUID,
			PokeyAndAlexsMcModModFluids.FLOWING_TESTFLUID,
			FluidAttributes
					.builder(new ResourceLocation("pokey_and_alexs__mc_mod:blocks/water_flow_read"),
							new ResourceLocation("pokey_and_alexs__mc_mod:blocks/water_still_read"))
					.luminosity(100).density(200).viscosity(300).temperature(0)

					.rarity(Rarity.UNCOMMON).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(200f).canMultiply()

			.bucket(PokeyAndAlexsMcModModItems.TESTFLUID_BUCKET).block(() -> (LiquidBlock) PokeyAndAlexsMcModModBlocks.TESTFLUID.get());

	private TestfluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (PokeyAndAlexsMcModModParticleTypes.LIGHTLIQUIDPARTICAL.get());
	}

	public static class Source extends TestfluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends TestfluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
