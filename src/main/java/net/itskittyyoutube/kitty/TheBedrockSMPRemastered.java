package net.itskittyyoutube.kitty;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.item.TheBedrockSMPItems;
import net.itskittyyoutube.kitty.sound.TheBedrockSMPSounds;
import net.itskittyyoutube.kitty.tab.TheBedrockSMPCreativeTabs;
import net.itskittyyoutube.kitty.world.gen.TheBedrockSMPWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheBedrockSMPRemastered implements ModInitializer {
	public static final String MOD_ID = "kitty";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        TheBedrockSMPItems.registerItems();
        TheBedrockSMPSounds.registerSounds();
        TheBedrockSMPCreativeTabs.registerTabs();
        TheBedrockSMPBlocks.registerBlocks();
        TheBedrockSMPWorldGeneration.WorldGen();

        StrippableBlockRegistry.register(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG, TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG);
        StrippableBlockRegistry.register(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD, TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.CHERRY_BIRCH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.CHERRY_BIRCH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.STRIPPED_CHERRY_BIRCH_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.CHERRY_BIRCH_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(TheBedrockSMPBlocks.CHERRY_BIRCH_LEAVES, 30, 60);
    }
}
