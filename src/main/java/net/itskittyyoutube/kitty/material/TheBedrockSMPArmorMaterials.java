package net.itskittyyoutube.kitty.material;

import net.itskittyyoutube.kitty.TheBedrockSMP;
import net.itskittyyoutube.kitty.util.TheBedrockSMPTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class TheBedrockSMPArmorMaterials {
    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> DIAMARITE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(TheBedrockSMP.MOD_ID, "diamarite"));
    public static final RegistryKey<EquipmentAsset> CORRUPTIONITE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(TheBedrockSMP.MOD_ID, "corruptionite"));

    public static final ArmorMaterial DIAMARITE = new ArmorMaterial(500, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0F,0.1F, TheBedrockSMPTags.Items.NETHERITE_EQUIPMENT_REPAIR, DIAMARITE_KEY);

    public static final ArmorMaterial CORRUPTIONITE = new ArmorMaterial(500, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,3.0F,0.1F, TheBedrockSMPTags.Items.NETHERITE_EQUIPMENT_REPAIR, CORRUPTIONITE_KEY);
}
