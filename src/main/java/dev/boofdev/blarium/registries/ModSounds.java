package dev.boofdev.blarium.registries;

import dev.boofdev.blarium.Blarium;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent DISC_APRIL_SHOWERS = registerSoundEvent("disc_april_showers");
    public static final SoundEvent DISC_ARCTIC_PULSE = registerSoundEvent("disc_arctic_pulse");
    public static final SoundEvent DISC_BEAUTIFUL_HORIZONS = registerSoundEvent("disc_beautiful_horizons");
    public static final SoundEvent DISC_CATGROOVE = registerSoundEvent("disc_catgroove");
    public static final SoundEvent DISC_DROOPY_LIKES_RICOCHET = registerSoundEvent("disc_droopy_likes_ricochet");
    public static final SoundEvent DISC_DROOPY_LIKES_YOUR_FACE = registerSoundEvent("disc_droopy_likes_your_face");
    public static final SoundEvent DISC_ECHOES_OF_THE_PAST = registerSoundEvent("disc_echoes_of_the_past");
    public static final SoundEvent DISC_FAIDHERBE_SQUARE = registerSoundEvent("disc_faidherbe_square");
    public static final SoundEvent DISC_FLEUR_DE_LILLE = registerSoundEvent("disc_fleur_de_lille");
    public static final SoundEvent DISC_HOTEL_AXOS = registerSoundEvent("disc_hotel_axos");
    public static final SoundEvent DISC_LIBELLA_SWING = registerSoundEvent("disc_libella_swing");
    public static final SoundEvent DISC_MATILDA = registerSoundEvent("disc_matilda");
    public static final SoundEvent DISC_ME_AND_THE_MOUNTAINS = registerSoundEvent("disc_me_and_the_mountains");
    public static final SoundEvent DISC_ME_AND_THE_MOUNTAINS_2 = registerSoundEvent("disc_me_and_the_mountains_2");
    public static final SoundEvent DISC_ME_AND_THE_WILDERNESS = registerSoundEvent("disc_me_and_the_wilderness");
    public static final SoundEvent DISC_MUSIC_FOR_THE_LONELY_MAN = registerSoundEvent("disc_music_for_the_lonely_man");
    public static final SoundEvent DISC_MUSIC_FOR_THE_LONELY_MAN_2 =
            registerSoundEvent("disc_music_for_the_lonely_man_2");
    public static final SoundEvent DISC_RUNNING_LIKE_THE_WIND = registerSoundEvent("disc_running_like_the_wind");
    public static final SoundEvent DISC_SIGMA_BOY = registerSoundEvent("disc_sigma_boy");
    public static final SoundEvent DISC_SOLITAIRE = registerSoundEvent("disc_solitaire");
    public static final SoundEvent DISC_SON_OF_FREEDOM = registerSoundEvent("disc_son_of_freedom");
    public static final SoundEvent DISC_SON_OF_THE_WILDERNESS = registerSoundEvent("disc_son_of_the_wilderness");
    public static final SoundEvent DISC_THE_DOG = registerSoundEvent("disc_the_dog");
    public static final SoundEvent DISC_THE_FLAME = registerSoundEvent("disc_the_flame");
    public static final SoundEvent DISC_THE_NATIONAL_PARK = registerSoundEvent("disc_the_national_park");
    public static final SoundEvent DISC_THROW_IT_BACK = registerSoundEvent("disc_throw_it_back");
    public static final SoundEvent DISC_TRUMPET_TUNE_1 = registerSoundEvent("disc_trumpet_tune_1");
    public static final SoundEvent DISC_TRUMPET_TUNE_2 = registerSoundEvent("disc_trumpet_tune_2");
    public static final SoundEvent DISC_WALKING_SLOW_1 = registerSoundEvent("disc_walking_slow_1");
    public static final SoundEvent DISC_WALKING_SLOW_2 = registerSoundEvent("disc_walking_slow_2");
    public static final SoundEvent DISC_WALKING_SLOW_3 = registerSoundEvent("disc_walking_slow_3");
    public static final SoundEvent DISC_WHISTLING_IN_THE_WIND = registerSoundEvent("disc_whistling_in_the_wind");

    // Add RegistryKeys for JukeboxSongs. (Holy fuck this is painful)
    public static final RegistryKey<JukeboxSong> DISC_APRIL_SHOWERS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_april_showers"));
    public static final RegistryKey<JukeboxSong> DISC_ARCTIC_PULSE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_arctic_pulse"));
    public static final RegistryKey<JukeboxSong> DISC_BEAUTIFUL_HORIZONS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_beautiful_horizons"));
    public static final RegistryKey<JukeboxSong> DISC_CATGROOVE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_catgroove"));
    public static final RegistryKey<JukeboxSong> DISC_DROOPY_LIKES_RICOCHET_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_droopy_likes_ricochet"));
    public static final RegistryKey<JukeboxSong> DISC_DROOPY_LIKES_YOUR_FACE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_droopy_likes_your_face"));
    public static final RegistryKey<JukeboxSong> DISC_ECHOES_OF_THE_PAST_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_echoes_of_the_past"));
    public static final RegistryKey<JukeboxSong> DISC_FAIDHERBE_SQUARE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_faidherbe_square"));
    public static final RegistryKey<JukeboxSong> DISC_FLEUR_DE_LILLE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_fleur_de_lille"));
    public static final RegistryKey<JukeboxSong> DISC_HOTEL_AXOS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_hotel_axos"));
    public static final RegistryKey<JukeboxSong> DISC_LIBELLA_SWING_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_libella_swing"));
    public static final RegistryKey<JukeboxSong> DISC_MATILDA_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_matilda"));
    public static final RegistryKey<JukeboxSong> DISC_ME_AND_THE_MOUNTAINS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_me_and_the_mountains"));
    public static final RegistryKey<JukeboxSong> DISC_ME_AND_THE_MOUNTAINS_2_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_me_and_the_mountains_2"));
    public static final RegistryKey<JukeboxSong> DISC_ME_AND_THE_WILDERNESS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_me_and_the_wilderness"));
    public static final RegistryKey<JukeboxSong> DISC_MUSIC_FOR_THE_LONELY_MAN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_music_for_the_lonely_man"));
    public static final RegistryKey<JukeboxSong> DISC_MUSIC_FOR_THE_LONELY_MAN_2_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_music_for_the_lonely_man_2"));
    public static final RegistryKey<JukeboxSong> DISC_RUNNING_LIKE_THE_WIND_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_running_like_the_wind"));
    public static final RegistryKey<JukeboxSong> DISC_SIGMA_BOY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_sigma_boy"));
    public static final RegistryKey<JukeboxSong> DISC_SOLITAIRE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_solitaire"));
    public static final RegistryKey<JukeboxSong> DISC_SON_OF_FREEDOM_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_son_of_freedom"));
    public static final RegistryKey<JukeboxSong> DISC_SON_OF_THE_WILDERNESS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_son_of_the_wilderness"));
    public static final RegistryKey<JukeboxSong> DISC_THE_DOG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_the_dog"));
    public static final RegistryKey<JukeboxSong> DISC_THE_FLAME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_the_flame"));
    public static final RegistryKey<JukeboxSong> DISC_THE_NATIONAL_PARK_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_the_national_park"));
    public static final RegistryKey<JukeboxSong> DISC_THROW_IT_BACK_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_throw_it_back"));
    public static final RegistryKey<JukeboxSong> DISC_TRUMPET_TUNE_1_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_trumpet_tune_1"));
    public static final RegistryKey<JukeboxSong> DISC_TRUMPET_TUNE_2_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_trumpet_tune_2"));
    public static final RegistryKey<JukeboxSong> DISC_WALKING_SLOW_1_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_walking_slow_1"));
    public static final RegistryKey<JukeboxSong> DISC_WALKING_SLOW_2_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_walking_slow_2"));
    public static final RegistryKey<JukeboxSong> DISC_WALKING_SLOW_3_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_walking_slow_3"));
    public static final RegistryKey<JukeboxSong> DISC_WHISTLING_IN_THE_WIND_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blarium.MOD_ID, "disc_whistling_in_the_wind"));

    public static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Blarium.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void init() {}
}
