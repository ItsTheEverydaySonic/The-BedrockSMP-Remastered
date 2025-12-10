package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.util.TheBedrockSMPTags;
import net.minecraft.block.Blocks;
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
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE)
                .add(TheBedrockSMPBlocks.WHITE_FENCE)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_FENCE)
                .add(TheBedrockSMPBlocks.GRAY_FENCE)
                .add(TheBedrockSMPBlocks.BLACK_FENCE)
                .add(TheBedrockSMPBlocks.BROWN_FENCE)
                .add(TheBedrockSMPBlocks.RED_FENCE)
                .add(TheBedrockSMPBlocks.ORANGE_FENCE)
                .add(TheBedrockSMPBlocks.YELLOW_FENCE)
                .add(TheBedrockSMPBlocks.LIME_FENCE)
                .add(TheBedrockSMPBlocks.GREEN_FENCE)
                .add(TheBedrockSMPBlocks.CYAN_FENCE)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_FENCE)
                .add(TheBedrockSMPBlocks.BLUE_FENCE)
                .add(TheBedrockSMPBlocks.PURPLE_FENCE)
                .add(TheBedrockSMPBlocks.MAGENTA_FENCE)
                .add(TheBedrockSMPBlocks.PINK_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE)
                .add(TheBedrockSMPBlocks.WHITE_FENCE_GATE)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_FENCE_GATE)
                .add(TheBedrockSMPBlocks.GRAY_FENCE_GATE)
                .add(TheBedrockSMPBlocks.BLACK_FENCE_GATE)
                .add(TheBedrockSMPBlocks.BROWN_FENCE_GATE)
                .add(TheBedrockSMPBlocks.RED_FENCE_GATE)
                .add(TheBedrockSMPBlocks.ORANGE_FENCE_GATE)
                .add(TheBedrockSMPBlocks.YELLOW_FENCE_GATE)
                .add(TheBedrockSMPBlocks.LIME_FENCE_GATE)
                .add(TheBedrockSMPBlocks.GREEN_FENCE_GATE)
                .add(TheBedrockSMPBlocks.CYAN_FENCE_GATE)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_FENCE_GATE)
                .add(TheBedrockSMPBlocks.BLUE_FENCE_GATE)
                .add(TheBedrockSMPBlocks.PURPLE_FENCE_GATE)
                .add(TheBedrockSMPBlocks.MAGENTA_FENCE_GATE)
                .add(TheBedrockSMPBlocks.PINK_FENCE_GATE);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR)
                .add(TheBedrockSMPBlocks.WHITE_DOOR)
                .add(TheBedrockSMPBlocks.DARK_OAK_DOOR_WITH_WINDOWS)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_DOOR)
                .add(TheBedrockSMPBlocks.GRAY_DOOR)
                .add(TheBedrockSMPBlocks.BLACK_DOOR)
                .add(TheBedrockSMPBlocks.BROWN_DOOR)
                .add(TheBedrockSMPBlocks.RED_DOOR)
                .add(TheBedrockSMPBlocks.ORANGE_DOOR)
                .add(TheBedrockSMPBlocks.YELLOW_DOOR)
                .add(TheBedrockSMPBlocks.LIME_DOOR)
                .add(TheBedrockSMPBlocks.GREEN_DOOR)
                .add(TheBedrockSMPBlocks.CYAN_DOOR)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_DOOR)
                .add(TheBedrockSMPBlocks.BLUE_DOOR)
                .add(TheBedrockSMPBlocks.PURPLE_DOOR)
                .add(TheBedrockSMPBlocks.MAGENTA_DOOR)
                .add(TheBedrockSMPBlocks.PINK_DOOR);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR)
                .add(TheBedrockSMPBlocks.WHITE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_TRAPDOOR)
                .add(TheBedrockSMPBlocks.GRAY_TRAPDOOR)
                .add(TheBedrockSMPBlocks.BLACK_TRAPDOOR)
                .add(TheBedrockSMPBlocks.BROWN_TRAPDOOR)
                .add(TheBedrockSMPBlocks.RED_TRAPDOOR)
                .add(TheBedrockSMPBlocks.ORANGE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.YELLOW_TRAPDOOR)
                .add(TheBedrockSMPBlocks.LIME_TRAPDOOR)
                .add(TheBedrockSMPBlocks.GREEN_TRAPDOOR)
                .add(TheBedrockSMPBlocks.CYAN_TRAPDOOR)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.BLUE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.PURPLE_TRAPDOOR)
                .add(TheBedrockSMPBlocks.MAGENTA_TRAPDOOR)
                .add(TheBedrockSMPBlocks.PINK_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON)
                .add(TheBedrockSMPBlocks.WHITE_BUTTON)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_BUTTON)
                .add(TheBedrockSMPBlocks.GRAY_BUTTON)
                .add(TheBedrockSMPBlocks.BLACK_BUTTON)
                .add(TheBedrockSMPBlocks.BROWN_BUTTON)
                .add(TheBedrockSMPBlocks.RED_BUTTON)
                .add(TheBedrockSMPBlocks.ORANGE_BUTTON)
                .add(TheBedrockSMPBlocks.YELLOW_BUTTON)
                .add(TheBedrockSMPBlocks.LIME_BUTTON)
                .add(TheBedrockSMPBlocks.GREEN_BUTTON)
                .add(TheBedrockSMPBlocks.CYAN_BUTTON)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_BUTTON)
                .add(TheBedrockSMPBlocks.BLUE_BUTTON)
                .add(TheBedrockSMPBlocks.PURPLE_BUTTON)
                .add(TheBedrockSMPBlocks.MAGENTA_BUTTON)
                .add(TheBedrockSMPBlocks.PINK_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB)
                .add(TheBedrockSMPBlocks.WHITE_SLAB)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_SLAB)
                .add(TheBedrockSMPBlocks.GRAY_SLAB)
                .add(TheBedrockSMPBlocks.BLACK_SLAB)
                .add(TheBedrockSMPBlocks.BROWN_SLAB)
                .add(TheBedrockSMPBlocks.RED_SLAB)
                .add(TheBedrockSMPBlocks.ORANGE_SLAB)
                .add(TheBedrockSMPBlocks.YELLOW_SLAB)
                .add(TheBedrockSMPBlocks.LIME_SLAB)
                .add(TheBedrockSMPBlocks.GREEN_SLAB)
                .add(TheBedrockSMPBlocks.CYAN_SLAB)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_SLAB)
                .add(TheBedrockSMPBlocks.BLUE_SLAB)
                .add(TheBedrockSMPBlocks.PURPLE_SLAB)
                .add(TheBedrockSMPBlocks.MAGENTA_SLAB)
                .add(TheBedrockSMPBlocks.PINK_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS)
                .add(TheBedrockSMPBlocks.WHITE_STAIRS)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_STAIRS)
                .add(TheBedrockSMPBlocks.GRAY_STAIRS)
                .add(TheBedrockSMPBlocks.BLACK_STAIRS)
                .add(TheBedrockSMPBlocks.BROWN_STAIRS)
                .add(TheBedrockSMPBlocks.RED_STAIRS)
                .add(TheBedrockSMPBlocks.ORANGE_STAIRS)
                .add(TheBedrockSMPBlocks.YELLOW_STAIRS)
                .add(TheBedrockSMPBlocks.LIME_STAIRS)
                .add(TheBedrockSMPBlocks.GREEN_STAIRS)
                .add(TheBedrockSMPBlocks.CYAN_STAIRS)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_STAIRS)
                .add(TheBedrockSMPBlocks.BLUE_STAIRS)
                .add(TheBedrockSMPBlocks.PURPLE_STAIRS)
                .add(TheBedrockSMPBlocks.MAGENTA_STAIRS)
                .add(TheBedrockSMPBlocks.PINK_STAIRS);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.WHITE_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.LIGHT_GRAY_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.GRAY_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.BLACK_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.BROWN_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.RED_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.ORANGE_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.YELLOW_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.LIME_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.GREEN_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.CYAN_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.LIGHT_BLUE_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.BLUE_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.PURPLE_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.MAGENTA_PRESSURE_PLATE)
                .add(TheBedrockSMPBlocks.PINK_PRESSURE_PLATE);

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

        //valueLookupBuilder(BlockTags.WOODEN_SHELVES)
                //.add(TheBedrockSMPBlocks.SHELFSHELF);
    }
}
