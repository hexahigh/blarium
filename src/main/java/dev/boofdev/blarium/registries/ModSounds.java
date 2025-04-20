package dev.boofdev.blarium.registries;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import dev.boofdev.blarium.Blarium;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModSounds {

    public static final SoundEvent DISC_APRIL_SHOWERS = register("disc_april_showers");
    public static final SoundEvent DISC_ARCTIC_PULSE = register("disc_arctic_pulse");
    public static final SoundEvent DISC_BEAUTIFUL_HORIZONS = register("disc_beautiful_horizons");
    public static final SoundEvent DISC_CATGROOVE = register("disc_catgroove");
    public static final SoundEvent DISC_DROOPY_LIKES_RICOCHET = register("disc_droopy_likes_ricochet");
    public static final SoundEvent DISC_DROOPY_LIKES_YOUR_FACE = register("disc_droopy_likes_your_face");
    public static final SoundEvent DISC_ECHOES_OF_THE_PAST = register("disc_echoes_of_the_past");
    public static final SoundEvent DISC_FAIDHERBE_SQUARE = register("disc_faidherbe_square");
    public static final SoundEvent DISC_FLEUR_DE_LILLE = register("disc_fleur_de_lille");
    public static final SoundEvent DISC_HOTEL_AXOS = register("disc_hotel_axos");
    public static final SoundEvent DISC_LIBELLA_SWING = register("disc_libella_swing");
    public static final SoundEvent DISC_MATILDA = register("disc_matilda");
    public static final SoundEvent DISC_ME_AND_THE_MOUNTAINS = register("disc_me_and_the_mountains");
    public static final SoundEvent DISC_ME_AND_THE_MOUNTAINS_2 = register("disc_me_and_the_mountains_2");
    public static final SoundEvent DISC_ME_AND_THE_WILDERNESS = register("disc_me_and_the_wilderness");
    public static final SoundEvent DISC_MUSIC_FOR_THE_LONELY_MAN = register("disc_music_for_the_lonely_man");
    public static final SoundEvent DISC_MUSIC_FOR_THE_LONELY_MAN_2 = register("disc_music_for_the_lonely_man_2");
    public static final SoundEvent DISC_RUNNING_LIKE_THE_WIND = register("disc_running_like_the_wind");
    public static final SoundEvent DISC_SIGMA_BOY = register("disc_sigma_boy");
    public static final SoundEvent DISC_SOLITAIRE = register("disc_solitaire");
    public static final SoundEvent DISC_SON_OF_FREEDOM = register("disc_son_of_freedom");
    public static final SoundEvent DISC_SON_OF_THE_WILDERNESS = register("disc_son_of_the_wilderness");
    public static final SoundEvent DISC_THE_DOG = register("disc_the_dog");
    public static final SoundEvent DISC_THE_FLAME = register("disc_the_flame");
    public static final SoundEvent DISC_THE_NATIONAL_PARK = register("disc_the_national_park");
    public static final SoundEvent DISC_THROW_IT_BACK = register("disc_throw_it_back");
    public static final SoundEvent DISC_TRUMPET_TUNE_1 = register("disc_trumpet_tune_1");
    public static final SoundEvent DISC_TRUMPET_TUNE_2 = register("disc_trumpet_tune_2");
    public static final SoundEvent DISC_WALKING_SLOW_1 = register("disc_walking_slow_1");
    public static final SoundEvent DISC_WALKING_SLOW_2 = register("disc_walking_slow_2");
    public static final SoundEvent DISC_WALKING_SLOW_3 = register("disc_walking_slow_3");
    public static final SoundEvent DISC_WHISTLING_IN_THE_WIND = register("disc_whistling_in_the_wind");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(Blarium.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void init() { }

}
