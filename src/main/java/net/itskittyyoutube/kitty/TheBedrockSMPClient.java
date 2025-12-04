package net.itskittyyoutube.kitty;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.itskittyyoutube.kitty.block.TheBedrockSMPBlocks;
import net.itskittyyoutube.kitty.util.TheBedrockSMPBabyProperty;
import net.itskittyyoutube.kitty.util.TheBedrockSMPBuiltinResourcePack;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.text.Text;

public final class TheBedrockSMPClient implements ClientModInitializer {
    public static final String PACK_ID = "small_axolotl_buckets";
    public static final String PACK_ID1 = "spooky_season";
    public static final String PACK_ID2 = "old_redwood";
    public static final String PACK_ID3 = "halloween_icons";
    public static final String PACK_ID4 = "spoopy_season";
    public static final String PACK_ID5 = "monster_girls";
    public static final String PACK_ID6 = "halloween_foliage";
    public static final String PACK_ID7 = "named_music_discs";
    public static final String PACK_ID8 = "villagers";
    public static final String PACK_ID9 = "old_dye";
    public static final String PACK_ID10 = "bedrocksmp_look";

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(TheBedrockSMPBlocks.CHERRY_BIRCH_SAPLING, BlockRenderLayer.CUTOUT);

        TheBedrockSMPBabyProperty.register();

        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID,
                Text.translatable("pack.kitty.small_axolotl_buckets")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID1,
                Text.translatable("pack.kitty.spooky_season")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID2,
                Text.translatable("pack.kitty.old_redwood")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID3,
                Text.translatable("pack.kitty.halloween_icons")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID4,
                Text.translatable("pack.kitty.spoopy_season")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID5,
                Text.translatable("pack.kitty.monster_girls")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID6,
                Text.translatable("pack.kitty.halloween_foliage")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID7,
                Text.translatable("pack.kitty.named_music_discs")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID8,
                Text.translatable("pack.kitty.villagers")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID9,
                Text.translatable("pack.kitty.old_dye")
        );
        TheBedrockSMPBuiltinResourcePack.register(
                TheBedrockSMPRemastered.MOD_ID,
                PACK_ID10,
                Text.translatable("pack.kitty.bedrocksmp_look")
        );
    }
}
