package net.itskittyyoutube.kitty;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.itskittyyoutube.kitty.data.*;
import net.itskittyyoutube.kitty.material.TheBedrockSMPTrimMaterials;
import net.itskittyyoutube.kitty.world.TheBedrockSMPConfiguredFeatures;
import net.itskittyyoutube.kitty.world.TheBedrockSMPPlacedFeatures;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class TheBedrockSMPDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        final FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(TheBedrockSMPBlockTagProvider::new);
        pack.addProvider(TheBedrockSMPItemTagProvider::new);
        pack.addProvider(TheBedrockSMPLootTableProvider::new);
        pack.addProvider((FabricDataOutput output) -> new TheBedrockSMPModelProvider(output, false));
        pack.addProvider(TheBedrockSMPRecipeProvider::new);
        pack.addProvider(TheBedrockSMPRegistryDataGenerator::new);

        final FabricDataGenerator.Pack small_axolotl_buckets = generator.createBuiltinResourcePack(Identifier.of(
                TheBedrockSMP.MOD_ID,
                TheBedrockSMPClient.PACK_ID
        ));
        small_axolotl_buckets.addProvider((FabricDataOutput output) -> new TheBedrockSMPModelProvider(output, true));
    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, TheBedrockSMPTrimMaterials::bootstrap);

        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, TheBedrockSMPConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, TheBedrockSMPPlacedFeatures::bootstrap);
    }
}