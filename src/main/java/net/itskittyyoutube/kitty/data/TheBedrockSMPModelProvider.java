package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.itskittyyoutube.kitty.TheBedrockSMPRemastered;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.item.TheBedrockSMPItems;
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
        blockStateModelGenerator.registerTrapdoor(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(TheBedrockSMPBlocks.STONE_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(TheBedrockSMPBlocks.BEDROCK_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR);

        blockStateModelGenerator.createLogTexturePool(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG).log(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG)
                .wood(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD);
        blockStateModelGenerator.createLogTexturePool(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG).log(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG)
                .wood(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);

        blockStateModelGenerator.registerSingleton(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
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

        Item item = Items.AXOLOTL_BUCKET;
        Identifier modelId = ModelIds.getItemModelId(item);
        ItemModel.Unbaked unbaked = ItemModels.basic(modelId);

        Model model = Models.GENERATED;
        if (this.small) {
            model = new Model(
                    Optional.of(Identifier.of(TheBedrockSMPRemastered.MOD_ID, "item/smaller_util")),
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
