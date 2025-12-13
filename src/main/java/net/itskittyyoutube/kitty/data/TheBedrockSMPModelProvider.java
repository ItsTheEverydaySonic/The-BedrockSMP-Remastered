package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.itskittyyoutube.kitty.TheBedrockSMP;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.item.TheBedrockSMPItems;
import net.itskittyyoutube.kitty.material.TheBedrockSMPArmorMaterials;
import net.itskittyyoutube.kitty.util.TheBedrockSMPBabyProperty;
import net.minecraft.client.data.*;
import net.minecraft.client.render.item.model.ItemModel;
import net.minecraft.client.render.item.model.SelectItemModel;
import net.minecraft.client.render.item.property.select.ComponentSelectProperty;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.data.DataWriter;
import net.minecraft.entity.passive.AxolotlEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class TheBedrockSMPModelProvider extends FabricModelProvider {
    private final boolean small;

    public TheBedrockSMPModelProvider(FabricDataOutput output, boolean small) {
        super(output);
        this.small = small;
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        return super.run(writer);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool CherryBirchPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS);
        CherryBirchPool.stairs(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS);
        CherryBirchPool.slab(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB);
        CherryBirchPool.button(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON);
        CherryBirchPool.pressurePlate(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE);
        CherryBirchPool.fence(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE);
        CherryBirchPool.fenceGate(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.STONE_DOOR);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.BEDROCK_DOOR);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.OBSIDIAN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.STONE_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.BEDROCK_TRAPDOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);
        blockStateModelGenerator.registerSimpleCubeAll(TheBedrockSMPBlocks.PLANKS_TEMPLATE);
        BlockStateModelGenerator.BlockTexturePool whitePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.WHITE_PLANKS);
        whitePlanksPool.stairs(TheBedrockSMPBlocks.WHITE_STAIRS);
        whitePlanksPool.slab(TheBedrockSMPBlocks.WHITE_SLAB);
        whitePlanksPool.button(TheBedrockSMPBlocks.WHITE_BUTTON);
        whitePlanksPool.pressurePlate(TheBedrockSMPBlocks.WHITE_PRESSURE_PLATE);
        whitePlanksPool.fence(TheBedrockSMPBlocks.WHITE_FENCE);
        whitePlanksPool.fenceGate(TheBedrockSMPBlocks.WHITE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.WHITE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.WHITE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool lightGrayPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.LIGHT_GRAY_PLANKS);
        lightGrayPlanksPool.stairs(TheBedrockSMPBlocks.LIGHT_GRAY_STAIRS);
        lightGrayPlanksPool.slab(TheBedrockSMPBlocks.LIGHT_GRAY_SLAB);
        lightGrayPlanksPool.button(TheBedrockSMPBlocks.LIGHT_GRAY_BUTTON);
        lightGrayPlanksPool.pressurePlate(TheBedrockSMPBlocks.LIGHT_GRAY_PRESSURE_PLATE);
        lightGrayPlanksPool.fence(TheBedrockSMPBlocks.LIGHT_GRAY_FENCE);
        lightGrayPlanksPool.fenceGate(TheBedrockSMPBlocks.LIGHT_GRAY_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.LIGHT_GRAY_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.LIGHT_GRAY_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool grayPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.GRAY_PLANKS);
        grayPlanksPool.stairs(TheBedrockSMPBlocks.GRAY_STAIRS);
        grayPlanksPool.slab(TheBedrockSMPBlocks.GRAY_SLAB);
        grayPlanksPool.button(TheBedrockSMPBlocks.GRAY_BUTTON);
        grayPlanksPool.pressurePlate(TheBedrockSMPBlocks.GRAY_PRESSURE_PLATE);
        grayPlanksPool.fence(TheBedrockSMPBlocks.GRAY_FENCE);
        grayPlanksPool.fenceGate(TheBedrockSMPBlocks.GRAY_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.GRAY_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.GRAY_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool blackPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.BLACK_PLANKS);
        blackPlanksPool.stairs(TheBedrockSMPBlocks.BLACK_STAIRS);
        blackPlanksPool.slab(TheBedrockSMPBlocks.BLACK_SLAB);
        blackPlanksPool.button(TheBedrockSMPBlocks.BLACK_BUTTON);
        blackPlanksPool.pressurePlate(TheBedrockSMPBlocks.BLACK_PRESSURE_PLATE);
        blackPlanksPool.fence(TheBedrockSMPBlocks.BLACK_FENCE);
        blackPlanksPool.fenceGate(TheBedrockSMPBlocks.BLACK_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.BLACK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.BLACK_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool brownPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.BROWN_PLANKS);
        brownPlanksPool.stairs(TheBedrockSMPBlocks.BROWN_STAIRS);
        brownPlanksPool.slab(TheBedrockSMPBlocks.BROWN_SLAB);
        brownPlanksPool.button(TheBedrockSMPBlocks.BROWN_BUTTON);
        brownPlanksPool.pressurePlate(TheBedrockSMPBlocks.BROWN_PRESSURE_PLATE);
        brownPlanksPool.fence(TheBedrockSMPBlocks.BROWN_FENCE);
        brownPlanksPool.fenceGate(TheBedrockSMPBlocks.BROWN_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.BROWN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.BROWN_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool redPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.RED_PLANKS);
        redPlanksPool.stairs(TheBedrockSMPBlocks.RED_STAIRS);
        redPlanksPool.slab(TheBedrockSMPBlocks.RED_SLAB);
        redPlanksPool.button(TheBedrockSMPBlocks.RED_BUTTON);
        redPlanksPool.pressurePlate(TheBedrockSMPBlocks.RED_PRESSURE_PLATE);
        redPlanksPool.fence(TheBedrockSMPBlocks.RED_FENCE);
        redPlanksPool.fenceGate(TheBedrockSMPBlocks.RED_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.RED_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.RED_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool orangePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.ORANGE_PLANKS);
        orangePlanksPool.stairs(TheBedrockSMPBlocks.ORANGE_STAIRS);
        orangePlanksPool.slab(TheBedrockSMPBlocks.ORANGE_SLAB);
        orangePlanksPool.button(TheBedrockSMPBlocks.ORANGE_BUTTON);
        orangePlanksPool.pressurePlate(TheBedrockSMPBlocks.ORANGE_PRESSURE_PLATE);
        orangePlanksPool.fence(TheBedrockSMPBlocks.ORANGE_FENCE);
        orangePlanksPool.fenceGate(TheBedrockSMPBlocks.ORANGE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.ORANGE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.ORANGE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool yellowPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.YELLOW_PLANKS);
        yellowPlanksPool.stairs(TheBedrockSMPBlocks.YELLOW_STAIRS);
        yellowPlanksPool.slab(TheBedrockSMPBlocks.YELLOW_SLAB);
        yellowPlanksPool.button(TheBedrockSMPBlocks.YELLOW_BUTTON);
        yellowPlanksPool.pressurePlate(TheBedrockSMPBlocks.YELLOW_PRESSURE_PLATE);
        yellowPlanksPool.fence(TheBedrockSMPBlocks.YELLOW_FENCE);
        yellowPlanksPool.fenceGate(TheBedrockSMPBlocks.YELLOW_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.YELLOW_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.YELLOW_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool limePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.LIME_PLANKS);
        limePlanksPool.stairs(TheBedrockSMPBlocks.LIME_STAIRS);
        limePlanksPool.slab(TheBedrockSMPBlocks.LIME_SLAB);
        limePlanksPool.button(TheBedrockSMPBlocks.LIME_BUTTON);
        limePlanksPool.pressurePlate(TheBedrockSMPBlocks.LIME_PRESSURE_PLATE);
        limePlanksPool.fence(TheBedrockSMPBlocks.LIME_FENCE);
        limePlanksPool.fenceGate(TheBedrockSMPBlocks.LIME_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.LIME_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.LIME_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool greenPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.GREEN_PLANKS);
        greenPlanksPool.stairs(TheBedrockSMPBlocks.GREEN_STAIRS);
        greenPlanksPool.slab(TheBedrockSMPBlocks.GREEN_SLAB);
        greenPlanksPool.button(TheBedrockSMPBlocks.GREEN_BUTTON);
        greenPlanksPool.pressurePlate(TheBedrockSMPBlocks.GREEN_PRESSURE_PLATE);
        greenPlanksPool.fence(TheBedrockSMPBlocks.GREEN_FENCE);
        greenPlanksPool.fenceGate(TheBedrockSMPBlocks.GREEN_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.GREEN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.GREEN_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool cyanPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.CYAN_PLANKS);
        cyanPlanksPool.stairs(TheBedrockSMPBlocks.CYAN_STAIRS);
        cyanPlanksPool.slab(TheBedrockSMPBlocks.CYAN_SLAB);
        cyanPlanksPool.button(TheBedrockSMPBlocks.CYAN_BUTTON);
        cyanPlanksPool.pressurePlate(TheBedrockSMPBlocks.CYAN_PRESSURE_PLATE);
        cyanPlanksPool.fence(TheBedrockSMPBlocks.CYAN_FENCE);
        cyanPlanksPool.fenceGate(TheBedrockSMPBlocks.CYAN_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.CYAN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.CYAN_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool lightBluePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.LIGHT_BLUE_PLANKS);
        lightBluePlanksPool.stairs(TheBedrockSMPBlocks.LIGHT_BLUE_STAIRS);
        lightBluePlanksPool.slab(TheBedrockSMPBlocks.LIGHT_BLUE_SLAB);
        lightBluePlanksPool.button(TheBedrockSMPBlocks.LIGHT_BLUE_BUTTON);
        lightBluePlanksPool.pressurePlate(TheBedrockSMPBlocks.LIGHT_BLUE_PRESSURE_PLATE);
        lightBluePlanksPool.fence(TheBedrockSMPBlocks.LIGHT_BLUE_FENCE);
        lightBluePlanksPool.fenceGate(TheBedrockSMPBlocks.LIGHT_BLUE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.LIGHT_BLUE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.LIGHT_BLUE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool bluePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.BLUE_PLANKS);
        bluePlanksPool.stairs(TheBedrockSMPBlocks.BLUE_STAIRS);
        bluePlanksPool.slab(TheBedrockSMPBlocks.BLUE_SLAB);
        bluePlanksPool.button(TheBedrockSMPBlocks.BLUE_BUTTON);
        bluePlanksPool.pressurePlate(TheBedrockSMPBlocks.BLUE_PRESSURE_PLATE);
        bluePlanksPool.fence(TheBedrockSMPBlocks.BLUE_FENCE);
        bluePlanksPool.fenceGate(TheBedrockSMPBlocks.BLUE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.BLUE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.BLUE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool purplePlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.PURPLE_PLANKS);
        purplePlanksPool.stairs(TheBedrockSMPBlocks.PURPLE_STAIRS);
        purplePlanksPool.slab(TheBedrockSMPBlocks.PURPLE_SLAB);
        purplePlanksPool.button(TheBedrockSMPBlocks.PURPLE_BUTTON);
        purplePlanksPool.pressurePlate(TheBedrockSMPBlocks.PURPLE_PRESSURE_PLATE);
        purplePlanksPool.fence(TheBedrockSMPBlocks.PURPLE_FENCE);
        purplePlanksPool.fenceGate(TheBedrockSMPBlocks.PURPLE_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.PURPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.PURPLE_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool magentaPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.MAGENTA_PLANKS);
        magentaPlanksPool.stairs(TheBedrockSMPBlocks.MAGENTA_STAIRS);
        magentaPlanksPool.slab(TheBedrockSMPBlocks.MAGENTA_SLAB);
        magentaPlanksPool.button(TheBedrockSMPBlocks.MAGENTA_BUTTON);
        magentaPlanksPool.pressurePlate(TheBedrockSMPBlocks.MAGENTA_PRESSURE_PLATE);
        magentaPlanksPool.fence(TheBedrockSMPBlocks.MAGENTA_FENCE);
        magentaPlanksPool.fenceGate(TheBedrockSMPBlocks.MAGENTA_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.MAGENTA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.MAGENTA_TRAPDOOR);
        BlockStateModelGenerator.BlockTexturePool pinkPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(TheBedrockSMPBlocks.PINK_PLANKS);
        pinkPlanksPool.stairs(TheBedrockSMPBlocks.PINK_STAIRS);
        pinkPlanksPool.slab(TheBedrockSMPBlocks.PINK_SLAB);
        pinkPlanksPool.button(TheBedrockSMPBlocks.PINK_BUTTON);
        pinkPlanksPool.pressurePlate(TheBedrockSMPBlocks.PINK_PRESSURE_PLATE);
        pinkPlanksPool.fence(TheBedrockSMPBlocks.PINK_FENCE);
        pinkPlanksPool.fenceGate(TheBedrockSMPBlocks.PINK_FENCE_GATE);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.PINK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.PINK_TRAPDOOR);
        blockStateModelGenerator.registerDoor(TheBedrockSMPBlocks.DARK_OAK_DOOR_WITH_WINDOWS);
        blockStateModelGenerator.registerOrientableTrapdoor(TheBedrockSMPBlocks.DARK_OAK_TRAPDOOR_WITH_WINDOWS);

        blockStateModelGenerator.createLogTexturePool(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG).log(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG)
                .wood(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD);
        blockStateModelGenerator.createLogTexturePool(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG).log(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG)
                .wood(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);

        blockStateModelGenerator.registerSingleton(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        //blockStateModelGenerator.registerShelf(TheBedrockSMPBlocks.SHELFSHELF, TheBedrockSMPBlocks.BLUE_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_LAVA_TEARSSTEP, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_TERRIFYING_TEARS, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_BETTERSIDE, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_12, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MUSIC_DISC_EXPLORER, Models.GENERATED);

        itemModelGenerator.register(TheBedrockSMPItems.BEDROCKSMP_ICON, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.BIG_STICK, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.CURSED_EMERALD, Models.GENERATED);

        itemModelGenerator.register(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(TheBedrockSMPItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.STEEL_ROD, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.REINFORCED_PAPER, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.MONEY, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.YOUTUBE_LOGO, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.SILVER_PLAY_BUTTON, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.GOLDEN_PLAY_BUTTON, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMOND_PLAY_BUTTON, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.NETHERITE_ROD, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.STEEL_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.CORRUPTIONITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMOND_INGOT, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.AMETHYST_INGOT, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.CHARD_INGOT, Models.GENERATED);
        itemModelGenerator.register(TheBedrockSMPItems.BURNT_INGOT, Models.GENERATED);

        itemModelGenerator.register(TheBedrockSMPItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.KATARA_KNIFE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.DIAMARITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.CORRUPTIONITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.CORRUPTIONITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.CORRUPTIONITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.CORRUPTIONITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(TheBedrockSMPItems.CORRUPTIONITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(TheBedrockSMPItems.DIAMARITE_HELMET, TheBedrockSMPArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.DIAMARITE_CHESTPLATE, TheBedrockSMPArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.DIAMARITE_LEGGINGS, TheBedrockSMPArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.DIAMARITE_BOOTS, TheBedrockSMPArmorMaterials.DIAMARITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.CORRUPTIONITE_HELMET, TheBedrockSMPArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.HELMET_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.CORRUPTIONITE_CHESTPLATE, TheBedrockSMPArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.CORRUPTIONITE_LEGGINGS, TheBedrockSMPArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX, false);
        itemModelGenerator.registerArmor(TheBedrockSMPItems.CORRUPTIONITE_BOOTS, TheBedrockSMPArmorMaterials.CORRUPTIONITE_KEY, ItemModelGenerator.BOOTS_TRIM_ID_PREFIX, false);

        Item item = Items.AXOLOTL_BUCKET;
        Identifier modelId = ModelIds.getItemModelId(item);
        ItemModel.Unbaked unbaked = ItemModels.basic(modelId);

        Model model = Models.GENERATED;
        if (this.small) {
            model = new Model(
                    Optional.of(Identifier.of(TheBedrockSMP.MOD_ID, "item/smaller_util")),
                    Optional.empty(),
                    TextureKey.LAYER0
            );
        }

        ArrayList<SelectItemModel.SwitchCase<AxolotlEntity.Variant>> adultSwitchCases = new ArrayList<>();
        ArrayList<SelectItemModel.SwitchCase<AxolotlEntity.Variant>> babySwitchCases = new ArrayList<>();

        for (AxolotlEntity.Variant variant : AxolotlEntity.Variant.values()) {
            String modelSuffix = "_" + variant.getId();
            String textureSuffix = variant.equals(AxolotlEntity.Variant.LUCY) ? "" : modelSuffix;

            Identifier adultModel = model.upload(
                    ModelIds.getItemSubModelId(item, modelSuffix),
                    TextureMap.layer0(TextureMap.getSubId(item, textureSuffix)),
                    itemModelGenerator.modelCollector
            );
            adultSwitchCases.add(ItemModels.switchCase(variant, ItemModels.basic(adultModel)));

            Identifier babyModel = model.upload(
                    ModelIds.getItemSubModelId(item, modelSuffix + "_baby"),
                    TextureMap.layer0(TextureMap.getSubId(item, textureSuffix + "_baby")),
                    itemModelGenerator.modelCollector
            );
            babySwitchCases.add(ItemModels.switchCase(variant, ItemModels.basic(babyModel)));
        }

        if (!this.small) {
            itemModelGenerator.output.accept(
                    item, ItemModels.condition(
                            new TheBedrockSMPBabyProperty(),
                            ItemModels.select(
                                    new ComponentSelectProperty<>(DataComponentTypes.AXOLOTL_VARIANT),
                                    unbaked,
                                    babySwitchCases
                            ),
                            ItemModels.select(
                                    new ComponentSelectProperty<>(DataComponentTypes.AXOLOTL_VARIANT),
                                    unbaked,
                                    adultSwitchCases
                            )
                    )
            );
        }
    }
}
