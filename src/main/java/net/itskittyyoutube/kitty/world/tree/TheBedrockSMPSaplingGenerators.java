package net.itskittyyoutube.kitty.world.tree;

import net.itskittyyoutube.kitty.TheBedrockSMPRemastered;
import net.itskittyyoutube.kitty.world.TheBedrockSMPConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class TheBedrockSMPSaplingGenerators {
    public static final SaplingGenerator CHERRY_BIRCH = new SaplingGenerator(TheBedrockSMPRemastered.MOD_ID + ":cherry_birch",
            Optional.empty(), Optional.of(TheBedrockSMPConfiguredFeatures.CHERRY_BIRCH_KEY), Optional.empty());
}
