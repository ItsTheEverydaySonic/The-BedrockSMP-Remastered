package net.itskittyyoutube.kitty.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.TheBedrockSMP;
import net.itskittyyoutube.kitty.material.TheBedrockSMPArmorMaterials;
import net.itskittyyoutube.kitty.material.TheBedrockSMPToolMaterials;
import net.itskittyyoutube.kitty.sound.TheBedrockSMPSounds;
import net.minecraft.item.*;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentType;
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
    public static final Item NETHERITE_ROD = registerItem("netherite_rod",
            settings -> new Item(settings.maxCount(64)));
    public static final Item STEEL_UPGRADE_SMITHING_TEMPLATE = registerItem("steel_upgrade_smithing_template",
            SmithingTemplateItem::of);
    public static final Item DIAMARITE_INGOT = registerItem("diamarite_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item CORRUPTIONITE_INGOT = registerItem("corruptionite_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item DIAMOND_INGOT = registerItem("diamond_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item CHARD_INGOT = registerItem("chard_ingot",
            settings -> new Item(settings.maxCount(64)));
    public static final Item DIAMARITE = registerItem("diamarite",
            settings -> new Item(settings.maxCount(64)));
    public static final Item BURNT_INGOT = registerItem("burnt_ingot",
            settings -> new Item(settings.maxCount(64)));

    //Tools
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            setting -> new Item(setting.sword(TheBedrockSMPToolMaterials.STEEL_EQUIPMENT, 3.0F, -2.4F)));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            setting -> new ShovelItem(TheBedrockSMPToolMaterials.STEEL_EQUIPMENT, 1.5F, -3.0F, setting));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            setting -> new Item(setting.pickaxe(TheBedrockSMPToolMaterials.STEEL_EQUIPMENT, 1.0F, -2.8F)));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            setting -> new AxeItem(TheBedrockSMPToolMaterials.STEEL_EQUIPMENT, 6.0F, -3.1F, setting));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            setting -> new HoeItem(TheBedrockSMPToolMaterials.STEEL_EQUIPMENT, -2.0F, -1.0F, setting));
    public static final Item KATARA_KNIFE = registerItem("katara_knife",
            setting -> new Item(setting.sword(TheBedrockSMPToolMaterials.STEEL_EQUIPMENT, 2.0F, -2.4F)));
    public static final Item DIAMARITE_SWORD = registerItem("diamarite_sword",
            setting -> new Item(setting.sword(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 3.0F, -2.4F).fireproof()));
    public static final Item DIAMARITE_SHOVEL = registerItem("diamarite_shovel",
            setting -> new ShovelItem(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 1.5F, -3.0F, setting.fireproof()));
    public static final Item DIAMARITE_PICKAXE = registerItem("diamarite_pickaxe",
            setting -> new Item(setting.pickaxe(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 1.0F, -2.8F).fireproof()));
    public static final Item DIAMARITE_AXE = registerItem("diamarite_axe",
            setting -> new AxeItem(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 5.0F, -3.0F, setting.fireproof()));
    public static final Item DIAMARITE_HOE = registerItem("diamarite_hoe",
            setting -> new HoeItem(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, -4.0F, 0.0F, setting.fireproof()));
    public static final Item CORRUPTIONITE_SWORD = registerItem("corruptionite_sword",
            setting -> new Item(setting.sword(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 3.0F, -2.4F).fireproof()));
    public static final Item CORRUPTIONITE_SHOVEL = registerItem("corruptionite_shovel",
            setting -> new ShovelItem(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 1.5F, -3.0F, setting.fireproof()));
    public static final Item CORRUPTIONITE_PICKAXE = registerItem("corruptionite_pickaxe",
            setting -> new Item(setting.pickaxe(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 1.0F, -2.8F).fireproof()));
    public static final Item CORRUPTIONITE_AXE = registerItem("corruptionite_axe",
            setting -> new AxeItem(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, 5.0F, -3.0F, setting.fireproof()));
    public static final Item CORRUPTIONITE_HOE = registerItem("corruptionite_hoe",
            setting -> new HoeItem(TheBedrockSMPToolMaterials.NETHERITE_EQUIPMENT, -4.0F, 0.0F, setting.fireproof()));
    public static final Item DIAMARITE_HELMET = registerItem("diamarite_helmet",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.DIAMARITE, EquipmentType.HELMET).fireproof()));
    public static final Item DIAMARITE_CHESTPLATE = registerItem("diamarite_chestplate",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.DIAMARITE, EquipmentType.CHESTPLATE).fireproof()));
    public static final Item DIAMARITE_LEGGINGS = registerItem("diamarite_leggings",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.DIAMARITE, EquipmentType.LEGGINGS).fireproof()));
    public static final Item DIAMARITE_BOOTS = registerItem("diamarite_boots",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.DIAMARITE, EquipmentType.BOOTS).fireproof()));
    public static final Item CORRUPTIONITE_HELMET = registerItem("corruptionite_helmet",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.CORRUPTIONITE, EquipmentType.HELMET).fireproof()));
    public static final Item CORRUPTIONITE_CHESTPLATE = registerItem("corruptionite_chestplate",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.CORRUPTIONITE, EquipmentType.CHESTPLATE).fireproof()));
    public static final Item CORRUPTIONITE_LEGGINGS = registerItem("corruptionite_leggings",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.CORRUPTIONITE, EquipmentType.LEGGINGS).fireproof()));
    public static final Item CORRUPTIONITE_BOOTS = registerItem("corruptionite_boots",
            setting -> new Item(setting.armor(TheBedrockSMPArmorMaterials.CORRUPTIONITE, EquipmentType.BOOTS).fireproof()));

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
            entries.add(STEEL_SHOVEL);
            entries.add(STEEL_PICKAXE);
            entries.add(STEEL_AXE);
            entries.add(STEEL_HOE);
            entries.add(DIAMARITE_SHOVEL);
            entries.add(DIAMARITE_PICKAXE);
            entries.add(DIAMARITE_AXE);
            entries.add(DIAMARITE_HOE);
            entries.add(CORRUPTIONITE_SHOVEL);
            entries.add(CORRUPTIONITE_PICKAXE);
            entries.add(CORRUPTIONITE_AXE);
            entries.add(CORRUPTIONITE_HOE);
            entries.add(MONEY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BIG_STICK);
            entries.add(CURSED_EMERALD);
            entries.add(STEEL_INGOT);
            entries.add(DIAMARITE_INGOT);
            entries.add(DIAMARITE);
            entries.add(CORRUPTIONITE_INGOT);
            entries.add(DIAMOND_INGOT);
            entries.add(AMETHYST_INGOT);
            entries.add(NETHERITE_ROD);
            entries.add(REINFORCED_PAPER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STEEL_SWORD);
            fabricItemGroupEntries.add(STEEL_AXE);
            fabricItemGroupEntries.add(KATARA_KNIFE);
            fabricItemGroupEntries.add(DIAMARITE_SWORD);
            fabricItemGroupEntries.add(DIAMARITE_AXE);
            fabricItemGroupEntries.add(CORRUPTIONITE_SWORD);
            fabricItemGroupEntries.add(CORRUPTIONITE_AXE);
            fabricItemGroupEntries.add(DIAMARITE_HELMET);
            fabricItemGroupEntries.add(DIAMARITE_CHESTPLATE);
            fabricItemGroupEntries.add(DIAMARITE_LEGGINGS);
            fabricItemGroupEntries.add(DIAMARITE_BOOTS);
            fabricItemGroupEntries.add(CORRUPTIONITE_HELMET);
            fabricItemGroupEntries.add(CORRUPTIONITE_CHESTPLATE);
            fabricItemGroupEntries.add(CORRUPTIONITE_LEGGINGS);
            fabricItemGroupEntries.add(CORRUPTIONITE_BOOTS);
        });
    }
}
