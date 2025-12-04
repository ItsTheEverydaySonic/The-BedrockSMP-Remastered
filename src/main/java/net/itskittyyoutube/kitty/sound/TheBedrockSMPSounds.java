package net.itskittyyoutube.kitty.sound;

import net.itskittyyoutube.kitty.TheBedrockSMPRemastered;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class TheBedrockSMPSounds {
    public static final SoundEvent THE_BYE_JUSTIN_HI_JUSTIN_RAP = registerSoundEvent("bye_justin_hi_justin");
    public static final SoundEvent THE_TALE_OF_TOOTHLESS = registerSoundEvent("the_tale_of_toothless");
    public static final SoundEvent STEVE_LAVA_CHICKEN = registerSoundEvent("steve_lava_chicken");
    public static final SoundEvent LAVA_TEARSSTEP = registerSoundEvent("lava_tearsstep");
    public static final SoundEvent TERRIFYING_TEARS = registerSoundEvent("terrifying_tears");
    public static final SoundEvent BETTERSIDE = registerSoundEvent("betterside");
    public static final SoundEvent DISC_12 = registerSoundEvent("12");
    public static final SoundEvent THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED = registerSoundEvent("bye_justin_hi_justin_remastered");
    public static final SoundEvent EXPLORER = registerSoundEvent("explorer");

    public static final RegistryKey<JukeboxSong> THE_BYE_JUSTIN_HI_JUSTIN_RAP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "bye_justin_hi_justin"));
    public static final RegistryKey<JukeboxSong> THE_TALE_OF_TOOTHLESS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "the_tale_of_toothless"));
    public static final RegistryKey<JukeboxSong> STEVE_LAVA_CHICKEN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "steve_lava_chicken"));
    public static final RegistryKey<JukeboxSong> LAVA_TEARSSTEP_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "lava_tearsstep"));
    public static final RegistryKey<JukeboxSong> TERRIFYING_TEARS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "terrifying_tears"));
    public static final RegistryKey<JukeboxSong> BETTERSIDE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "betterside"));
    public static final RegistryKey<JukeboxSong> DISC_12_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "12"));
    public static final RegistryKey<JukeboxSong> THE_BYE_JUSTIN_HI_JUSTIN_RAP_REMASTERED_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "bye_justin_hi_justin_remastered"));
    public static final RegistryKey<JukeboxSong> EXPLORER_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TheBedrockSMPRemastered.MOD_ID, "explorer"));


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TheBedrockSMPRemastered.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        TheBedrockSMPRemastered.LOGGER.info("Registering Sounds for " + TheBedrockSMPRemastered.MOD_ID);
    }
}
