package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.item.TheBedrockSMPItems;
import net.itskittyyoutube.kitty.util.TheBedrockSMPTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TheBedrockSMPRecipeProvider extends FabricRecipeProvider {
    public TheBedrockSMPRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR, 3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR, 2)
                        .pattern("###")
                        .pattern("###")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE, 3)
                        .pattern("#X#")
                        .pattern("#X#")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .input('X', Items.STICK)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE, 1)
                        .pattern("X#X")
                        .pattern("X#X")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .input('X', Items.STICK)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS, 6)
                        .pattern("#  ")
                        .pattern("## ")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB, 6)
                        .pattern("###")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE, 1)
                        .pattern("##")
                        .input('#', TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP, 1)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .input('#', Items.DIAMOND)
                        .input('X', Items.GOLD_INGOT)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS, 1)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .input('#', Items.DIAMOND)
                        .input('X', Items.EMERALD)
                        .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.STONE_DOOR, 3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.STONE_TRAPDOOR, 2)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.STONE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.BEDROCK_DOOR, 3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.BEDROCK)
                        .criterion(hasItem(Blocks.BEDROCK), conditionsFromItem(Blocks.BEDROCK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.BEDROCK_TRAPDOOR, 2)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.BEDROCK)
                        .criterion(hasItem(Blocks.BEDROCK), conditionsFromItem(Blocks.BEDROCK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.OBSIDIAN_DOOR, 3)
                        .pattern("##")
                        .pattern("##")
                        .pattern("##")
                        .input('#', Blocks.OBSIDIAN)
                        .criterion(hasItem(Blocks.OBSIDIAN), conditionsFromItem(Blocks.OBSIDIAN))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR, 2)
                        .pattern("###")
                        .pattern("###")
                        .input('#', Blocks.OBSIDIAN)
                        .criterion(hasItem(Blocks.OBSIDIAN), conditionsFromItem(Blocks.OBSIDIAN))
                        .offerTo(exporter);
                createShaped(RecipeCategory.DECORATIONS, Items.SEAGRASS, 2)
                        .pattern("#")
                        .input('#', Items.SEAGRASS)
                        .criterion(hasItem(Items.SEAGRASS), conditionsFromItem(Items.SEAGRASS))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS, 4)
                        .input(TheBedrockSMPTags.Items.CHERRY_BIRCH_LOGS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG), conditionsFromTag(TheBedrockSMPTags.Items.CHERRY_BIRCH_LOGS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON, 1)
                        .input(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS)
                        .criterion(hasItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS), conditionsFromItem(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_STEVE_LAVA_CHICKEN, 1)
                        .input(Items.PLAYER_HEAD)
                        .criterion(hasItem(Items.PLAYER_HEAD), conditionsFromItem(Items.PLAYER_HEAD))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_LAVA_TEARSSTEP, 1)
                        .input(Items.MUSIC_DISC_PIGSTEP)
                        .input(Items.MUSIC_DISC_TEARS)
                        .input(Items.MUSIC_DISC_LAVA_CHICKEN)
                        .criterion(hasItem(Items.MUSIC_DISC_PIGSTEP), conditionsFromItem(Items.MUSIC_DISC_PIGSTEP))
                        .criterion(hasItem(Items.MUSIC_DISC_TEARS), conditionsFromItem(Items.MUSIC_DISC_TEARS))
                        .criterion(hasItem(Items.MUSIC_DISC_LAVA_CHICKEN), conditionsFromItem(Items.MUSIC_DISC_LAVA_CHICKEN))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_TERRIFYING_TEARS, 1)
                        .input(Items.MUSIC_DISC_11)
                        .input(Items.MUSIC_DISC_TEARS)
                        .criterion(hasItem(Items.MUSIC_DISC_11), conditionsFromItem(Items.MUSIC_DISC_11))
                        .criterion(hasItem(Items.MUSIC_DISC_TEARS), conditionsFromItem(Items.MUSIC_DISC_TEARS))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, Items.MUSIC_DISC_LAVA_CHICKEN, 1)
                        .input(Items.LAVA_BUCKET)
                        .input(Items.CHICKEN)
                        .criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET))
                        .criterion(hasItem(Items.CHICKEN), conditionsFromItem(Items.CHICKEN))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, Items.MUSIC_DISC_TEARS, 1)
                        .input(TheBedrockSMPItems.MUSIC_DISC_TERRIFYING_TEARS)
                        .input(Items.DISC_FRAGMENT_5)
                        .criterion(hasItem(TheBedrockSMPItems.MUSIC_DISC_TERRIFYING_TEARS), conditionsFromItem(TheBedrockSMPItems.MUSIC_DISC_TERRIFYING_TEARS))
                        .criterion(hasItem(Items.DISC_FRAGMENT_5), conditionsFromItem(Items.DISC_FRAGMENT_5))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_BETTERSIDE, 1)
                        .input(Items.MUSIC_DISC_OTHERSIDE)
                        .criterion(hasItem(Items.MUSIC_DISC_OTHERSIDE), conditionsFromItem(Items.MUSIC_DISC_OTHERSIDE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, TheBedrockSMPItems.MUSIC_DISC_12, 1)
                        .input(Items.MUSIC_DISC_11)
                        .input(Items.MUSIC_DISC_13)
                        .input(Items.MUSIC_DISC_5)
                        .criterion(hasItem(Items.MUSIC_DISC_11), conditionsFromItem(Items.MUSIC_DISC_11))
                        .criterion(hasItem(Items.MUSIC_DISC_13), conditionsFromItem(Items.MUSIC_DISC_13))
                        .criterion(hasItem(Items.MUSIC_DISC_5), conditionsFromItem(Items.MUSIC_DISC_5))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.BUILDING_BLOCKS, TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING, 4)
                        .input(Items.BIRCH_SAPLING)
                        .input(Items.CHERRY_SAPLING)
                        .criterion(hasItem(Items.BIRCH_SAPLING), conditionsFromItem(Items.BIRCH_SAPLING))
                        .criterion(hasItem(Items.CHERRY_SAPLING), conditionsFromItem(Items.CHERRY_SAPLING))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}
