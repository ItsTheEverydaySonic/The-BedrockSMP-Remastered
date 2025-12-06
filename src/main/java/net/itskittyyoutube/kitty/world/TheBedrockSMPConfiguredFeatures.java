package net.itskittyyoutube.kitty.world;

import net.itskittyyoutube.kitty.TheBedrockSMP;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class TheBedrockSMPConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHERRY_BIRCH_KEY = registerKey("cherry_birch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, CHERRY_BIRCH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG),
                new StraightTrunkPlacer(4, 2, 0),

                BlockStateProvider.of(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(1, 0, 1)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TheBedrockSMP.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
