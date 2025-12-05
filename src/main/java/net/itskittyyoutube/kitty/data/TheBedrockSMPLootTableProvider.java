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

        addDrop(TheBedrockSMPBlocks.PLANKS_TEMPLATE);
        addDrop(TheBedrockSMPBlocks.WHITE_PLANKS);
        addDrop(TheBedrockSMPBlocks.WHITE_STAIRS);
        addDrop(TheBedrockSMPBlocks.WHITE_SLAB, slabDrops(TheBedrockSMPBlocks.WHITE_SLAB));
        addDrop(TheBedrockSMPBlocks.WHITE_FENCE);
        addDrop(TheBedrockSMPBlocks.WHITE_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.WHITE_DOOR, doorDrops(TheBedrockSMPBlocks.WHITE_DOOR));
        addDrop(TheBedrockSMPBlocks.WHITE_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.WHITE_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.WHITE_BUTTON);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_PLANKS);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_STAIRS);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_SLAB, slabDrops(TheBedrockSMPBlocks.LIGHT_GRAY_SLAB));
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_FENCE);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_DOOR, doorDrops(TheBedrockSMPBlocks.LIGHT_GRAY_DOOR));
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.LIGHT_GRAY_BUTTON);
        addDrop(TheBedrockSMPBlocks.GRAY_PLANKS);
        addDrop(TheBedrockSMPBlocks.GRAY_STAIRS);
        addDrop(TheBedrockSMPBlocks.GRAY_SLAB, slabDrops(TheBedrockSMPBlocks.GRAY_SLAB));
        addDrop(TheBedrockSMPBlocks.GRAY_FENCE);
        addDrop(TheBedrockSMPBlocks.GRAY_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.GRAY_DOOR, doorDrops(TheBedrockSMPBlocks.GRAY_DOOR));
        addDrop(TheBedrockSMPBlocks.GRAY_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.GRAY_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.GRAY_BUTTON);
        addDrop(TheBedrockSMPBlocks.BLACK_PLANKS);
        addDrop(TheBedrockSMPBlocks.BLACK_STAIRS);
        addDrop(TheBedrockSMPBlocks.BLACK_SLAB, slabDrops(TheBedrockSMPBlocks.BLACK_SLAB));
        addDrop(TheBedrockSMPBlocks.BLACK_FENCE);
        addDrop(TheBedrockSMPBlocks.BLACK_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.BLACK_DOOR, doorDrops(TheBedrockSMPBlocks.BLACK_DOOR));
        addDrop(TheBedrockSMPBlocks.BLACK_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.BLACK_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.BLACK_BUTTON);
        addDrop(TheBedrockSMPBlocks.BROWN_PLANKS);
        addDrop(TheBedrockSMPBlocks.BROWN_STAIRS);
        addDrop(TheBedrockSMPBlocks.BROWN_SLAB, slabDrops(TheBedrockSMPBlocks.BROWN_SLAB));
        addDrop(TheBedrockSMPBlocks.BROWN_FENCE);
        addDrop(TheBedrockSMPBlocks.BROWN_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.BROWN_DOOR, doorDrops(TheBedrockSMPBlocks.BROWN_DOOR));
        addDrop(TheBedrockSMPBlocks.BROWN_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.BROWN_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.BROWN_BUTTON);
        addDrop(TheBedrockSMPBlocks.RED_PLANKS);
        addDrop(TheBedrockSMPBlocks.RED_STAIRS);
        addDrop(TheBedrockSMPBlocks.RED_SLAB, slabDrops(TheBedrockSMPBlocks.RED_SLAB));
        addDrop(TheBedrockSMPBlocks.RED_FENCE);
        addDrop(TheBedrockSMPBlocks.RED_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.RED_DOOR, doorDrops(TheBedrockSMPBlocks.RED_DOOR));
        addDrop(TheBedrockSMPBlocks.RED_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.RED_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.RED_BUTTON);
        addDrop(TheBedrockSMPBlocks.ORANGE_PLANKS);
        addDrop(TheBedrockSMPBlocks.ORANGE_STAIRS);
        addDrop(TheBedrockSMPBlocks.ORANGE_SLAB, slabDrops(TheBedrockSMPBlocks.ORANGE_SLAB));
        addDrop(TheBedrockSMPBlocks.ORANGE_FENCE);
        addDrop(TheBedrockSMPBlocks.ORANGE_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.ORANGE_DOOR, doorDrops(TheBedrockSMPBlocks.ORANGE_DOOR));
        addDrop(TheBedrockSMPBlocks.ORANGE_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.ORANGE_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.ORANGE_BUTTON);
        addDrop(TheBedrockSMPBlocks.YELLOW_PLANKS);
        addDrop(TheBedrockSMPBlocks.YELLOW_STAIRS);
        addDrop(TheBedrockSMPBlocks.YELLOW_SLAB, slabDrops(TheBedrockSMPBlocks.YELLOW_SLAB));
        addDrop(TheBedrockSMPBlocks.YELLOW_FENCE);
        addDrop(TheBedrockSMPBlocks.YELLOW_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.YELLOW_DOOR, doorDrops(TheBedrockSMPBlocks.YELLOW_DOOR));
        addDrop(TheBedrockSMPBlocks.YELLOW_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.YELLOW_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.YELLOW_BUTTON);
        addDrop(TheBedrockSMPBlocks.LIME_PLANKS);
        addDrop(TheBedrockSMPBlocks.LIME_STAIRS);
        addDrop(TheBedrockSMPBlocks.LIME_SLAB, slabDrops(TheBedrockSMPBlocks.LIME_SLAB));
        addDrop(TheBedrockSMPBlocks.LIME_FENCE);
        addDrop(TheBedrockSMPBlocks.LIME_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.LIME_DOOR, doorDrops(TheBedrockSMPBlocks.LIME_DOOR));
        addDrop(TheBedrockSMPBlocks.LIME_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.LIME_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.LIME_BUTTON);
        addDrop(TheBedrockSMPBlocks.GREEN_PLANKS);
        addDrop(TheBedrockSMPBlocks.GREEN_STAIRS);
        addDrop(TheBedrockSMPBlocks.GREEN_SLAB, slabDrops(TheBedrockSMPBlocks.GREEN_SLAB));
        addDrop(TheBedrockSMPBlocks.GREEN_FENCE);
        addDrop(TheBedrockSMPBlocks.GREEN_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.GREEN_DOOR, doorDrops(TheBedrockSMPBlocks.GREEN_DOOR));
        addDrop(TheBedrockSMPBlocks.GREEN_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.GREEN_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.GREEN_BUTTON);
        addDrop(TheBedrockSMPBlocks.CYAN_PLANKS);
        addDrop(TheBedrockSMPBlocks.CYAN_STAIRS);
        addDrop(TheBedrockSMPBlocks.CYAN_SLAB, slabDrops(TheBedrockSMPBlocks.CYAN_SLAB));
        addDrop(TheBedrockSMPBlocks.CYAN_FENCE);
        addDrop(TheBedrockSMPBlocks.CYAN_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.CYAN_DOOR, doorDrops(TheBedrockSMPBlocks.CYAN_DOOR));
        addDrop(TheBedrockSMPBlocks.CYAN_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.CYAN_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.CYAN_BUTTON);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_PLANKS);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_STAIRS);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_SLAB, slabDrops(TheBedrockSMPBlocks.LIGHT_BLUE_SLAB));
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_FENCE);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_DOOR, doorDrops(TheBedrockSMPBlocks.LIGHT_BLUE_DOOR));
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.LIGHT_BLUE_BUTTON);
        addDrop(TheBedrockSMPBlocks.BLUE_PLANKS);
        addDrop(TheBedrockSMPBlocks.BLUE_STAIRS);
        addDrop(TheBedrockSMPBlocks.BLUE_SLAB, slabDrops(TheBedrockSMPBlocks.BLUE_SLAB));
        addDrop(TheBedrockSMPBlocks.BLUE_FENCE);
        addDrop(TheBedrockSMPBlocks.BLUE_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.BLUE_DOOR, doorDrops(TheBedrockSMPBlocks.BLUE_DOOR));
        addDrop(TheBedrockSMPBlocks.BLUE_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.BLUE_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.BLUE_BUTTON);
        addDrop(TheBedrockSMPBlocks.PURPLE_PLANKS);
        addDrop(TheBedrockSMPBlocks.PURPLE_STAIRS);
        addDrop(TheBedrockSMPBlocks.PURPLE_SLAB, slabDrops(TheBedrockSMPBlocks.PURPLE_SLAB));
        addDrop(TheBedrockSMPBlocks.PURPLE_FENCE);
        addDrop(TheBedrockSMPBlocks.PURPLE_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.PURPLE_DOOR, doorDrops(TheBedrockSMPBlocks.PURPLE_DOOR));
        addDrop(TheBedrockSMPBlocks.PURPLE_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.PURPLE_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.PURPLE_BUTTON);
        addDrop(TheBedrockSMPBlocks.MAGENTA_PLANKS);
        addDrop(TheBedrockSMPBlocks.MAGENTA_STAIRS);
        addDrop(TheBedrockSMPBlocks.MAGENTA_SLAB, slabDrops(TheBedrockSMPBlocks.MAGENTA_SLAB));
        addDrop(TheBedrockSMPBlocks.MAGENTA_FENCE);
        addDrop(TheBedrockSMPBlocks.MAGENTA_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.MAGENTA_DOOR, doorDrops(TheBedrockSMPBlocks.MAGENTA_DOOR));
        addDrop(TheBedrockSMPBlocks.MAGENTA_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.MAGENTA_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.MAGENTA_BUTTON);
        addDrop(TheBedrockSMPBlocks.PINK_PLANKS);
        addDrop(TheBedrockSMPBlocks.PINK_STAIRS);
        addDrop(TheBedrockSMPBlocks.PINK_SLAB, slabDrops(TheBedrockSMPBlocks.PINK_SLAB));
        addDrop(TheBedrockSMPBlocks.PINK_FENCE);
        addDrop(TheBedrockSMPBlocks.PINK_FENCE_GATE);
        addDrop(TheBedrockSMPBlocks.PINK_DOOR, doorDrops(TheBedrockSMPBlocks.PINK_DOOR));
        addDrop(TheBedrockSMPBlocks.PINK_TRAPDOOR);
        addDrop(TheBedrockSMPBlocks.PINK_PRESSURE_PLATE);
        addDrop(TheBedrockSMPBlocks.PINK_BUTTON);

        addDrop(TheBedrockSMPBlocks.DARK_OAK_DOOR_WITH_WINDOWS, doorDrops(TheBedrockSMPBlocks.DARK_OAK_DOOR_WITH_WINDOWS));
        addDrop(TheBedrockSMPBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);
        
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
