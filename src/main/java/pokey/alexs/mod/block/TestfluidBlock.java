
package pokey.alexs.mod.block;

import pokey.alexs.mod.init.PokeyAndAlexsMcModModFluids;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class TestfluidBlock extends LiquidBlock {
	public TestfluidBlock() {
		super(() -> (FlowingFluid) PokeyAndAlexsMcModModFluids.TESTFLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(200f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 15));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
