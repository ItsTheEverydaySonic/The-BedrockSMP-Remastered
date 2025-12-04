package net.itskittyyoutube.kitty.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.itskittyyoutube.kitty.TheBedrockSMPRemastered;
import net.itskittyyoutube.kitty.world.tree.TheBedrockSMPSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class TheBedrockSMPBlocks {
    //Planks
    public static final Block CHERRY_BIRCH_PLANKS = registerBlock("cherry_birch_planks",
            properties -> new Block(properties.instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //Doors
    public static final Block CHERRY_BIRCH_DOOR = registerBlock("cherry_birch_door",
            properties -> new DoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.WOOD)));
    public static final Block STONE_DOOR = registerBlock("stone_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.5F, 6.0F).pistonBehavior(PistonBehavior.DESTROY).sounds(BlockSoundGroup.STONE)));
    public static final Block BEDROCK_DOOR = registerBlock("bedrock_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).pistonBehavior(PistonBehavior.DESTROY)
                    .dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block OBSIDIAN_DOOR = registerBlock("obsidian_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(50.0F, 1200.0F).pistonBehavior(PistonBehavior.DESTROY)
                    .allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));

    //Trapdoors
    public static final Block CHERRY_BIRCH_TRAPDOOR = registerBlock("cherry_birch_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.CHERRY, properties.instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F)
                    .nonOpaque().allowsSpawning(Blocks::never).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block STONE_TRAPDOOR = registerBlock("stone_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(1.5F, 6.0F).allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block BEDROCK_TRAPDOOR = registerBlock("bedrock_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));
    public static final Block OBSIDIAN_TRAPDOOR = registerBlock("obsidian_trapdoor",
            properties -> new TrapdoorBlock(BlockSetType.STONE, properties.mapColor(MapColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool().strength(50.0F, 1200.0F).allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE)));

    //Buttons
    public static final Block CHERRY_BIRCH_BUTTON = registerBlock("cherry_birch_button",
            properties -> new ButtonBlock(BlockSetType.CHERRY, 30, properties.strength(0.6F)
                    .noCollision().sounds(BlockSoundGroup.WOOD)));

    //Pressure Plates
    public static final Block CHERRY_BIRCH_PRESSURE_PLATE = registerBlock("cherry_birch_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.CHERRY, properties.strength(0.5F)
                    .sounds(BlockSoundGroup.WOOD)));

    //Stairs
    public static final Block CHERRY_BIRCH_STAIRS = registerBlock("cherry_birch_stairs",
            properties -> new StairsBlock(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS.getDefaultState(),
                    properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Slabs
    public static final Block CHERRY_BIRCH_SLAB = registerBlock("cherry_birch_slab",
            properties -> new SlabBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Fences
    public static final Block CHERRY_BIRCH_FENCE = registerBlock("cherry_birch_fence",
            properties -> new FenceBlock(properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Fence Gates
    public static final Block CHERRY_BIRCH_FENCE_GATE = registerBlock("cherry_birch_fence_gate",
            properties -> new FenceGateBlock(WoodType.CHERRY, properties.strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)));

    //Leaves
    public static final Block CHERRY_BIRCH_LEAVES = registerBlock("cherry_birch_leaves",
            properties -> new UntintedParticleLeavesBlock(0.1F, ParticleTypes.CHERRY_LEAVES, properties
                    .mapColor(MapColor.PINK)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    //Logs
    public static final Block CHERRY_BIRCH_LOG = registerBlock("cherry_birch_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_CHERRY_BIRCH_LOG = registerBlock("stripped_cherry_birch_log",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //Woods
    public static final Block CHERRY_BIRCH_WOOD = registerBlock("cherry_birch_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));
    public static final Block STRIPPED_CHERRY_BIRCH_WOOD = registerBlock("stripped_cherry_birch_wood",
            properties -> new PillarBlock(properties
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.CHERRY_WOOD)
                    .burnable()));

    //Saplings
    public static final Block CHERRY_BIRCH_SAPLING = registerBlock("cherry_birch_sapling",
            properties -> new SaplingBlock(TheBedrockSMPSaplingGenerators.CHERRY_BIRCH, properties.mapColor(MapColor.PINK)
                    .noCollision().ticksRandomly().breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_SAPLING).pistonBehavior(PistonBehavior.DESTROY)));


    //Extra
    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name), toRegister);
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<AbstractBlock.Settings, Block> function) {
        return Registry.register(Registries.BLOCK, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name),
                function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name)))));
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TheBedrockSMPRemastered.MOD_ID, name)))));
    }

    public static void registerBlocks() {
        TheBedrockSMPRemastered.LOGGER.info("Registering Mod Blocks for " + TheBedrockSMPRemastered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES);
            entries.add(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING);
        });
    }
}
