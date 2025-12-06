package net.itskittyyoutube.kitty.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.TheBedrockSMP;
import net.itskittyyoutube.kitty.sound.TheBedrockSMPSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.function.Function;

public class TheBedrockSMPItems {
    //Music Discs
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerItem("music_disc_bye_justin_hi_justin",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.THE_BYE_JUSTIN_HI_JUSTIN_RAP_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_THE_TALE_OF_TOOTHLESS = registerItem("music_disc_the_tale_of_toothless",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.THE_TALE_OF_TOOTHLESS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_STEVE_LAVA_CHICKEN = registerItem("music_disc_steve_lava_chicken",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.STEVE_LAVA_CHICKEN_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_LAVA_TEARSSTEP = registerItem("music_disc_lava_tearsstep",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.LAVA_TEARSSTEP_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_TERRIFYING_TEARS = registerItem("music_disc_terrifying_tears",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.TERRIFYING_TEARS_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_BETTERSIDE = registerItem("music_disc_betterside",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.BETTERSIDE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_12 = registerItem("music_disc_12",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.DISC_12_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerItem("music_disc_bye_justin_hi_justin_remastered",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_EXPLORER = registerItem("music_disc_explorer",
            setting -> new Item(setting.jukeboxPlayable(TheBedrockSMPSounds.EXPLORER_KEY).maxCount(1)));

    //Items
    public static final Item BEDROCKSMP_ICON = registerItem("bedrocksmp_icon",
            settings -> new Item(settings.rarity(Rarity.EPIC).maxCount(64)));
    public static final Item BIG_STICK = registerItem("big_stick",
            settings -> new Item(settings.maxCount(64)));
    public static final Item CURSED_EMERALD = registerItem("cursed_emerald",
            settings -> new Item(settings.rarity(Rarity.EPIC).maxCount(1)));
    public static final Item YOUTUBE_LOGO = registerItem("youtube_logo",
            settings -> new Item(settings.maxCount(64)));
    public static final Item SILVER_PLAY_BUTTON = registerItem("silver_play_button",
            settings -> new Item(settings.maxCount(64)));
    public static final Item GOLDEN_PLAY_BUTTON = registerItem("golden_play_button",
            settings -> new Item(settings.maxCount(64)));
    public static final Item DIAMOND_PLAY_BUTTON = registerItem("diamond_play_button",
            settings -> new Item(settings.maxCount(64)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item STEEL_ROD = registerItem("steel_rod",
            settings -> new Item(settings.maxCount(64)));
    public static final Item REINFORCED_PAPER = registerItem("reinforced_paper",
            settings -> new Item(settings.maxCount(64).fireproof()));
    public static final Item MONEY = registerItem("money",
            settings -> new Item(settings.maxCount(64)));

    //Extra
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheBedrockSMP.MOD_ID, name), item);
    }

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(TheBedrockSMP.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TheBedrockSMP.MOD_ID, name)))));
    }
    public static void registerItems() {
        TheBedrockSMP.LOGGER.info("Registering Items for " + TheBedrockSMP.MOD_ID);

        //Creative Tabs
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP);
            entries.add(MUSIC_DISC_THE_TALE_OF_TOOTHLESS);
            entries.add(MUSIC_DISC_STEVE_LAVA_CHICKEN);
            entries.add(MUSIC_DISC_LAVA_TEARSSTEP);
            entries.add(MUSIC_DISC_BETTERSIDE);
            entries.add(MUSIC_DISC_12);
            entries.add(MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED);
            entries.add(MUSIC_DISC_EXPLORER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BIG_STICK);
            entries.add(CURSED_EMERALD);
            entries.add(STEEL_INGOT);
            entries.add(STEEL_ROD);
            entries.add(REINFORCED_PAPER);
            entries.add(MONEY);
        });
    }
}
