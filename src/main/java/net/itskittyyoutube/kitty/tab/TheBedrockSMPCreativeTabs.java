package net.itskittyyoutube.kitty.tab;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.itskittyyoutube.kitty.TheBedrockSMPRemastered;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.item.TheBedrockSMPItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TheBedrockSMPCreativeTabs {
    public static final ItemGroup BEDROCKSMP_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheBedrockSMPRemastered.MOD_ID, "bedrocksmp"),
            FabricItemGroup.builder().icon(() -> new ItemStack(TheBedrockSMPItems.BEDROCKSMP_ICON))
                    .displayName(Text.translatable("creativetab.kitty.bedrocksmp"))
                    .entries((displayContext, entries) -> {
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD);
                        entries.add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG);
                        entries.add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES);
                        entries.add(TheBedrockSMPBlocks.STONE_DOOR);
                        entries.add(TheBedrockSMPBlocks.STONE_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.BEDROCK_DOOR);
                        entries.add(TheBedrockSMPBlocks.BEDROCK_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.OBSIDIAN_DOOR);
                        entries.add(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_STEVE_LAVA_CHICKEN);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_LAVA_TEARSSTEP);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_TERRIFYING_TEARS);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_BETTERSIDE);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_12);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_EXPLORER);
                        entries.add(TheBedrockSMPItems.BIG_STICK);
                        entries.add(TheBedrockSMPItems.CURSED_EMERALD);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING);

                    }).build());

    public static final ItemGroup MUSIC_DISC_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheBedrockSMPRemastered.MOD_ID, "music_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.MUSIC_DISC_13))
                    .displayName(Text.translatable("creativetab.kitty.music_discs"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.MUSIC_DISC_13);
                        entries.add(Items.MUSIC_DISC_CAT);
                        entries.add(Items.MUSIC_DISC_BLOCKS);
                        entries.add(Items.MUSIC_DISC_CHIRP);
                        entries.add(Items.MUSIC_DISC_FAR);
                        entries.add(Items.MUSIC_DISC_MALL);
                        entries.add(Items.MUSIC_DISC_MELLOHI);
                        entries.add(Items.MUSIC_DISC_STAL);
                        entries.add(Items.MUSIC_DISC_STRAD);
                        entries.add(Items.MUSIC_DISC_WARD);
                        entries.add(Items.MUSIC_DISC_11);
                        entries.add(Items.MUSIC_DISC_CREATOR_MUSIC_BOX);
                        entries.add(Items.MUSIC_DISC_WAIT);
                        entries.add(Items.MUSIC_DISC_CREATOR);
                        entries.add(Items.MUSIC_DISC_PRECIPICE);
                        entries.add(Items.MUSIC_DISC_OTHERSIDE);
                        entries.add(Items.MUSIC_DISC_RELIC);
                        entries.add(Items.MUSIC_DISC_5);
                        entries.add(Items.MUSIC_DISC_PIGSTEP);
                        entries.add(Items.MUSIC_DISC_TEARS);
                        entries.add(Items.MUSIC_DISC_LAVA_CHICKEN);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_STEVE_LAVA_CHICKEN);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_LAVA_TEARSSTEP);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_BETTERSIDE);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_12);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
                        entries.add(TheBedrockSMPItems.MUSIC_DISC_EXPLORER);

                    }).build());

    public static final ItemGroup WOOD_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheBedrockSMPRemastered.MOD_ID, "wood"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.OAK_PLANKS))
                    .displayName(Text.translatable("creativetab.kitty.wood"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.OAK_LOG);
                        entries.add(Items.OAK_WOOD);
                        entries.add(Items.STRIPPED_OAK_LOG);
                        entries.add(Items.STRIPPED_OAK_WOOD);
                        entries.add(Items.OAK_PLANKS);
                        entries.add(Items.OAK_STAIRS);
                        entries.add(Items.OAK_SLAB);
                        entries.add(Items.OAK_FENCE);
                        entries.add(Items.OAK_FENCE_GATE);
                        entries.add(Items.OAK_DOOR);
                        entries.add(Items.OAK_TRAPDOOR);
                        entries.add(Items.OAK_PRESSURE_PLATE);
                        entries.add(Items.OAK_BUTTON);
                        entries.add(Items.SPRUCE_LOG);
                        entries.add(Items.SPRUCE_WOOD);
                        entries.add(Items.STRIPPED_SPRUCE_LOG);
                        entries.add(Items.STRIPPED_SPRUCE_WOOD);
                        entries.add(Items.SPRUCE_PLANKS);
                        entries.add(Items.SPRUCE_STAIRS);
                        entries.add(Items.SPRUCE_SLAB);
                        entries.add(Items.SPRUCE_FENCE);
                        entries.add(Items.SPRUCE_FENCE_GATE);
                        entries.add(Items.SPRUCE_DOOR);
                        entries.add(Items.SPRUCE_TRAPDOOR);
                        entries.add(Items.SPRUCE_PRESSURE_PLATE);
                        entries.add(Items.SPRUCE_BUTTON);
                        entries.add(Items.BIRCH_LOG);
                        entries.add(Items.BIRCH_WOOD);
                        entries.add(Items.STRIPPED_BIRCH_LOG);
                        entries.add(Items.STRIPPED_BIRCH_WOOD);
                        entries.add(Items.BIRCH_PLANKS);
                        entries.add(Items.BIRCH_STAIRS);
                        entries.add(Items.BIRCH_SLAB);
                        entries.add(Items.BIRCH_FENCE);
                        entries.add(Items.BIRCH_FENCE_GATE);
                        entries.add(Items.BIRCH_DOOR);
                        entries.add(Items.BIRCH_TRAPDOOR);
                        entries.add(Items.BIRCH_PRESSURE_PLATE);
                        entries.add(Items.BIRCH_BUTTON);
                        entries.add(Items.JUNGLE_LOG);
                        entries.add(Items.JUNGLE_WOOD);
                        entries.add(Items.STRIPPED_JUNGLE_LOG);
                        entries.add(Items.STRIPPED_JUNGLE_WOOD);
                        entries.add(Items.JUNGLE_PLANKS);
                        entries.add(Items.JUNGLE_STAIRS);
                        entries.add(Items.JUNGLE_SLAB);
                        entries.add(Items.JUNGLE_FENCE);
                        entries.add(Items.JUNGLE_FENCE_GATE);
                        entries.add(Items.JUNGLE_DOOR);
                        entries.add(Items.JUNGLE_TRAPDOOR);
                        entries.add(Items.JUNGLE_PRESSURE_PLATE);
                        entries.add(Items.JUNGLE_BUTTON);
                        entries.add(Items.ACACIA_LOG);
                        entries.add(Items.ACACIA_WOOD);
                        entries.add(Items.STRIPPED_ACACIA_LOG);
                        entries.add(Items.STRIPPED_ACACIA_WOOD);
                        entries.add(Items.ACACIA_PLANKS);
                        entries.add(Items.ACACIA_STAIRS);
                        entries.add(Items.ACACIA_SLAB);
                        entries.add(Items.ACACIA_FENCE);
                        entries.add(Items.ACACIA_FENCE_GATE);
                        entries.add(Items.ACACIA_DOOR);
                        entries.add(Items.ACACIA_TRAPDOOR);
                        entries.add(Items.ACACIA_PRESSURE_PLATE);
                        entries.add(Items.ACACIA_BUTTON);
                        entries.add(Items.DARK_OAK_LOG);
                        entries.add(Items.DARK_OAK_WOOD);
                        entries.add(Items.STRIPPED_DARK_OAK_LOG);
                        entries.add(Items.STRIPPED_DARK_OAK_WOOD);
                        entries.add(Items.DARK_OAK_PLANKS);
                        entries.add(Items.DARK_OAK_STAIRS);
                        entries.add(Items.DARK_OAK_SLAB);
                        entries.add(Items.DARK_OAK_FENCE);
                        entries.add(Items.DARK_OAK_FENCE_GATE);
                        entries.add(Items.DARK_OAK_DOOR);
                        entries.add(Items.DARK_OAK_TRAPDOOR);
                        entries.add(Items.DARK_OAK_PRESSURE_PLATE);
                        entries.add(Items.DARK_OAK_BUTTON);
                        entries.add(Items.MANGROVE_LOG);
                        entries.add(Items.MANGROVE_WOOD);
                        entries.add(Items.STRIPPED_MANGROVE_LOG);
                        entries.add(Items.STRIPPED_MANGROVE_WOOD);
                        entries.add(Items.MANGROVE_PLANKS);
                        entries.add(Items.MANGROVE_STAIRS);
                        entries.add(Items.MANGROVE_SLAB);
                        entries.add(Items.MANGROVE_FENCE);
                        entries.add(Items.MANGROVE_FENCE_GATE);
                        entries.add(Items.MANGROVE_DOOR);
                        entries.add(Items.MANGROVE_TRAPDOOR);
                        entries.add(Items.MANGROVE_PRESSURE_PLATE);
                        entries.add(Items.MANGROVE_BUTTON);
                        entries.add(Items.CHERRY_LOG);
                        entries.add(Items.CHERRY_WOOD);
                        entries.add(Items.STRIPPED_CHERRY_LOG);
                        entries.add(Items.STRIPPED_CHERRY_WOOD);
                        entries.add(Items.CHERRY_PLANKS);
                        entries.add(Items.CHERRY_STAIRS);
                        entries.add(Items.CHERRY_SLAB);
                        entries.add(Items.CHERRY_FENCE);
                        entries.add(Items.CHERRY_FENCE_GATE);
                        entries.add(Items.CHERRY_DOOR);
                        entries.add(Items.CHERRY_TRAPDOOR);
                        entries.add(Items.CHERRY_PRESSURE_PLATE);
                        entries.add(Items.CHERRY_BUTTON);
                        entries.add(Items.PALE_OAK_LOG);
                        entries.add(Items.PALE_OAK_WOOD);
                        entries.add(Items.STRIPPED_PALE_OAK_LOG);
                        entries.add(Items.STRIPPED_PALE_OAK_WOOD);
                        entries.add(Items.PALE_OAK_PLANKS);
                        entries.add(Items.PALE_OAK_STAIRS);
                        entries.add(Items.PALE_OAK_SLAB);
                        entries.add(Items.PALE_OAK_FENCE);
                        entries.add(Items.PALE_OAK_FENCE_GATE);
                        entries.add(Items.PALE_OAK_DOOR);
                        entries.add(Items.PALE_OAK_TRAPDOOR);
                        entries.add(Items.PALE_OAK_PRESSURE_PLATE);
                        entries.add(Items.PALE_OAK_BUTTON);
                        entries.add(Items.BAMBOO_BLOCK);
                        entries.add(Items.STRIPPED_BAMBOO_BLOCK);
                        entries.add(Items.BAMBOO_PLANKS);
                        entries.add(Items.BAMBOO_MOSAIC);
                        entries.add(Items.BAMBOO_STAIRS);
                        entries.add(Items.BAMBOO_MOSAIC_STAIRS);
                        entries.add(Items.BAMBOO_SLAB);
                        entries.add(Items.BAMBOO_MOSAIC_SLAB);
                        entries.add(Items.BAMBOO_FENCE);
                        entries.add(Items.BAMBOO_FENCE_GATE);
                        entries.add(Items.BAMBOO_DOOR);
                        entries.add(Items.BAMBOO_TRAPDOOR);
                        entries.add(Items.BAMBOO_PRESSURE_PLATE);
                        entries.add(Items.BAMBOO_BUTTON);
                        entries.add(Items.CRIMSON_STEM);
                        entries.add(Items.CRIMSON_HYPHAE);
                        entries.add(Items.STRIPPED_CRIMSON_STEM);
                        entries.add(Items.STRIPPED_CRIMSON_HYPHAE);
                        entries.add(Items.CRIMSON_PLANKS);
                        entries.add(Items.CRIMSON_STAIRS);
                        entries.add(Items.CRIMSON_SLAB);
                        entries.add(Items.CRIMSON_FENCE);
                        entries.add(Items.CRIMSON_FENCE_GATE);
                        entries.add(Items.CRIMSON_DOOR);
                        entries.add(Items.CRIMSON_TRAPDOOR);
                        entries.add(Items.CRIMSON_PRESSURE_PLATE);
                        entries.add(Items.CRIMSON_BUTTON);
                        entries.add(Items.WARPED_STEM);
                        entries.add(Items.WARPED_HYPHAE);
                        entries.add(Items.STRIPPED_WARPED_STEM);
                        entries.add(Items.STRIPPED_WARPED_HYPHAE);
                        entries.add(Items.WARPED_PLANKS);
                        entries.add(Items.WARPED_STAIRS);
                        entries.add(Items.WARPED_SLAB);
                        entries.add(Items.WARPED_FENCE);
                        entries.add(Items.WARPED_FENCE_GATE);
                        entries.add(Items.WARPED_DOOR);
                        entries.add(Items.WARPED_TRAPDOOR);
                        entries.add(Items.WARPED_PRESSURE_PLATE);
                        entries.add(Items.WARPED_BUTTON);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD);
                        entries.add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG);
                        entries.add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON);

                    }).build());

    public static final ItemGroup DOORS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheBedrockSMPRemastered.MOD_ID, "doors"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.OAK_DOOR))
                    .displayName(Text.translatable("creativetab.kitty.doors"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.OAK_DOOR);
                        entries.add(Items.SPRUCE_DOOR);
                        entries.add(Items.BIRCH_DOOR);
                        entries.add(Items.JUNGLE_DOOR);
                        entries.add(Items.ACACIA_DOOR);
                        entries.add(Items.DARK_OAK_DOOR);
                        entries.add(Items.MANGROVE_DOOR);
                        entries.add(Items.CHERRY_DOOR);
                        entries.add(Items.PALE_OAK_DOOR);
                        entries.add(Items.BAMBOO_DOOR);
                        entries.add(Items.CRIMSON_DOOR);
                        entries.add(Items.WARPED_DOOR);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR);
                        entries.add(Items.IRON_DOOR);
                        entries.add(Items.COPPER_DOOR);
                        entries.add(Items.EXPOSED_COPPER_DOOR);
                        entries.add(Items.WEATHERED_COPPER_DOOR);
                        entries.add(Items.OXIDIZED_COPPER_DOOR);
                        entries.add(Items.WAXED_COPPER_DOOR);
                        entries.add(Items.WAXED_EXPOSED_COPPER_DOOR);
                        entries.add(Items.WAXED_WEATHERED_COPPER_DOOR);
                        entries.add(Items.WAXED_OXIDIZED_COPPER_DOOR);
                        entries.add(TheBedrockSMPBlocks.STONE_DOOR);
                        entries.add(TheBedrockSMPBlocks.BEDROCK_DOOR);
                        entries.add(TheBedrockSMPBlocks.OBSIDIAN_DOOR);

                    }).build());

    public static final ItemGroup TRAPDOORS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheBedrockSMPRemastered.MOD_ID, "trapdoors"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.OAK_TRAPDOOR))
                    .displayName(Text.translatable("creativetab.kitty.trapdoors"))
                    .entries((displayContext, entries) -> {
                        entries.add(Items.OAK_TRAPDOOR);
                        entries.add(Items.SPRUCE_TRAPDOOR);
                        entries.add(Items.BIRCH_TRAPDOOR);
                        entries.add(Items.JUNGLE_TRAPDOOR);
                        entries.add(Items.ACACIA_TRAPDOOR);
                        entries.add(Items.DARK_OAK_TRAPDOOR);
                        entries.add(Items.MANGROVE_TRAPDOOR);
                        entries.add(Items.CHERRY_TRAPDOOR);
                        entries.add(Items.PALE_OAK_TRAPDOOR);
                        entries.add(Items.BAMBOO_TRAPDOOR);
                        entries.add(Items.CRIMSON_TRAPDOOR);
                        entries.add(Items.WARPED_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);
                        entries.add(Items.IRON_TRAPDOOR);
                        entries.add(Items.COPPER_TRAPDOOR);
                        entries.add(Items.EXPOSED_COPPER_TRAPDOOR);
                        entries.add(Items.WEATHERED_COPPER_TRAPDOOR);
                        entries.add(Items.OXIDIZED_COPPER_TRAPDOOR);
                        entries.add(Items.WAXED_COPPER_TRAPDOOR);
                        entries.add(Items.WAXED_EXPOSED_COPPER_TRAPDOOR);
                        entries.add(Items.WAXED_WEATHERED_COPPER_TRAPDOOR);
                        entries.add(Items.WAXED_OXIDIZED_COPPER_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.STONE_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.BEDROCK_TRAPDOOR);
                        entries.add(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);

                    }).build());


    public static void registerTabs() {
        TheBedrockSMPRemastered.LOGGER.info("Registering Creative Tabs for " + TheBedrockSMPRemastered.MOD_ID);
    }
}
