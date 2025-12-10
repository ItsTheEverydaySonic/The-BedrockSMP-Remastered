package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TheBedrockSMP;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TheBedrockSMPTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_STEEL_EQUIPMENT = createTag("needs_steel_equipment");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_EQUIPMENT = createTag("incorrect_for_steel_equipment");
        public static final TagKey<Block> NEEDS_NETHERITE_EQUIPMENT = createTag("needs_netherite_equipment");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_EQUIPMENT = createTag("incorrect_for_netherite_equipment");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TheBedrockSMP.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CHERRY_BIRCH_LOGS = createTag("cherry_birch_logs");
        public static final TagKey<Item> HEADS = createTag("heads");
        public static final TagKey<Item> STEEL_EQUIPMENT_REPAIR = createTag("steel_equipment_repair");
        public static final TagKey<Item> NETHERITE_EQUIPMENT_REPAIR = createTag("netherite_equipment_repair");
        public static final TagKey<Item> INGOTS = createTag("ingots");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TheBedrockSMP.MOD_ID, name));
        }
    }
}
