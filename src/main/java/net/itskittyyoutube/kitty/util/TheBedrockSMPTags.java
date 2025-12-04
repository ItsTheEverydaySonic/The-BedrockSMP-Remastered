package net.itskittyyoutube.kitty.util;

import net.itskittyyoutube.kitty.TheBedrockSMPRemastered;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TheBedrockSMPTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> CHERRY_BIRCH_LOGS = createTag("cherry_birch_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name));
        }
    }
}
