package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TheBedrockSMPBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TheBedrockSMPBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(TheBedrockSMPBlocks.STONE_DOOR)
                .add(TheBedrockSMPBlocks.STONE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.OBSIDIAN_DOOR)
                .add(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(TheBedrockSMPBlocks.STONE_DOOR)
                .add(TheBedrockSMPBlocks.STONE_TRAPDOOR);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(TheBedrockSMPBlocks.OBSIDIAN_DOOR)
                .add(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.DOORS)
                .add(TheBedrockSMPBlocks.STONE_DOOR)
                .add(TheBedrockSMPBlocks.BEDROCK_DOOR)
                .add(TheBedrockSMPBlocks.OBSIDIAN_DOOR);

        valueLookupBuilder(BlockTags.TRAPDOORS)
                .add(TheBedrockSMPBlocks.STONE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.BEDROCK_TRAPDOOR)
                .add(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD)
                .add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG)
                .add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
    }
}
