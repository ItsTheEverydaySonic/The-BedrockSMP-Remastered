package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TheBedrockSMPLootTableProvider extends FabricBlockLootTableProvider {
    public TheBedrockSMPLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS);
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB, slabDrops(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB));

        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON);
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE);

        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE);
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE);

        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR, doorDrops(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR));
        addDrop(TheBedrockSMPBlocks.STONE_DOOR, doorDrops(TheBedrockSMPBlocks.STONE_DOOR));
        addDrop(TheBedrockSMPBlocks.OBSIDIAN_DOOR, doorDrops(TheBedrockSMPBlocks.OBSIDIAN_DOOR));
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.STONE_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);

        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG);
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD);
        addDrop(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG);
        addDrop(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS);
        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING);

        addDrop(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES, leavesDrops(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES,
                TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F));
    }
}
