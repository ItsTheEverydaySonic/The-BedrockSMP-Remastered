package net.itskittyyoutube.kitty.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.item.TheBedrockSMPItems;
import net.itskittyyoutube.kitty.util.TheBedrockSMPTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class TheBedrockSMPItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public TheBedrockSMPItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG.asItem())
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD.asItem())
                .add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG.asItem())
                .add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD.asItem());

        valueLookupBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(Items.COBBLESTONE)
                .add(Items.BLACKSTONE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.TUFF)
                .add(Items.STONE)
                .add(Items.DEEPSLATE)
                .add(Items.END_STONE)
                .add(Items.NETHERRACK)
                .add(Items.SANDSTONE)
                .add(Items.RED_SANDSTONE)
                .add(Items.PRISMARINE)
                .add(Items.BRICKS)
                .add(Items.MUD_BRICKS)
                .add(Items.CALCITE)
                .add(Items.SMOOTH_BASALT);

        valueLookupBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(Items.COBBLESTONE)
                .add(Items.BLACKSTONE)
                .add(Items.COBBLED_DEEPSLATE)
                .add(Items.ANDESITE)
                .add(Items.BASALT)
                .add(Items.DIORITE)
                .add(Items.GRANITE)
                .add(Items.TUFF)
                .add(Items.STONE)
                .add(Items.DEEPSLATE)
                .add(Items.END_STONE)
                .add(Items.NETHERRACK)
                .add(Items.SANDSTONE)
                .add(Items.RED_SANDSTONE)
                .add(Items.PRISMARINE)
                .add(Items.BRICKS)
                .add(Items.MUD_BRICKS)
                .add(Items.CALCITE)
                .add(Items.SMOOTH_BASALT);

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE.asItem());

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_FENCE_GATE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_BUTTON.asItem());

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_SLAB.asItem());

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_STAIRS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_PRESSURE_PLATE.asItem());

        valueLookupBuilder(ItemTags.DOORS)
                .add(TheBedrockSMPBlocks.STONE_DOOR.asItem())
                .add(TheBedrockSMPBlocks.BEDROCK_DOOR.asItem())
                .add(TheBedrockSMPBlocks.OBSIDIAN_DOOR.asItem());

        valueLookupBuilder(ItemTags.TRAPDOORS)
                .add(TheBedrockSMPBlocks.STONE_TRAPDOOR.asItem())
                .add(TheBedrockSMPBlocks.BEDROCK_TRAPDOOR.asItem())
                .add(TheBedrockSMPBlocks.OBSIDIAN_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS.asItem());

        valueLookupBuilder(TheBedrockSMPTags.Items.CHERRY_BIRCH_LOGS)
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG.asItem())
                .add(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD.asItem())
                .add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG.asItem())
                .add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD.asItem());

        valueLookupBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(TheBedrockSMPItems.MUSIC_DISC_THE_BYE_JUSTIN_HI_JUSTIN_RAP)
                .add(TheBedrockSMPItems.MUSIC_DISC_THE_TALE_OF_TOOTHLESS)
                .add(TheBedrockSMPItems.MUSIC_DISC_STEVE_LAVA_CHICKEN)
                .add(TheBedrockSMPItems.MUSIC_DISC_LAVA_TEARSSTEP)
                .add(TheBedrockSMPItems.MUSIC_DISC_12);
    }
}
