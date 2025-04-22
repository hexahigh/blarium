package dev.boofdev.blarium.registries;

import dev.boofdev.blarium.Blarium;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item DISC_THE_FLAME = registerDisc("disc_the_flame", ModSounds.DISC_THE_FLAME_KEY);
    public static final Item DISC_MATILDA = registerDisc("disc_matilda", ModSounds.DISC_MATILDA_KEY);
    public static final Item DISC_LIBELLA_SWING = registerDisc("disc_libella_swing", ModSounds.DISC_LIBELLA_SWING_KEY);
    public static final Item DISC_HOTEL_AXOS = registerDisc("disc_hotel_axos", ModSounds.DISC_HOTEL_AXOS_KEY);
    public static final Item DISC_FLEUR_DE_LILLE =
            registerDisc("disc_fleur_de_lille", ModSounds.DISC_FLEUR_DE_LILLE_KEY);
    public static final Item DISC_CATGROOVE = registerDisc("disc_catgroove", ModSounds.DISC_CATGROOVE_KEY);

    public static final Item DISC_THROW_IT_BACK = registerDisc("disc_throw_it_back", ModSounds.DISC_THROW_IT_BACK_KEY);
    public static final Item DISC_APRIL_SHOWERS = registerDisc("disc_april_showers", ModSounds.DISC_APRIL_SHOWERS_KEY);
    public static final Item DISC_FAIDHERBE_SQUARE =
            registerDisc("disc_faidherbe_square", ModSounds.DISC_FAIDHERBE_SQUARE_KEY);

    public static final Item DISC_DROOPY_LIKES_RICOCHET =
            registerDisc("disc_droopy_likes_ricochet", ModSounds.DISC_DROOPY_LIKES_RICOCHET_KEY);
    public static final Item DISC_DROOPY_LIKES_YOUR_FACE =
            registerDisc("disc_droopy_likes_your_face", ModSounds.DISC_DROOPY_LIKES_YOUR_FACE_KEY);

    public static final Item DISC_SIGMA_BOY = registerDisc("disc_sigma_boy", ModSounds.DISC_SIGMA_BOY_KEY);

    public static final Item DISC_ARCTIC_PULSE = registerDisc("disc_arctic_pulse", ModSounds.DISC_ARCTIC_PULSE_KEY);
    public static final Item DISC_BEAUTIFUL_HORIZONS =
            registerDisc("disc_beautiful_horizons", ModSounds.DISC_BEAUTIFUL_HORIZONS_KEY);
    public static final Item DISC_ECHOES_OF_THE_PAST =
            registerDisc("disc_echoes_of_the_past", ModSounds.DISC_ECHOES_OF_THE_PAST_KEY);
    public static final Item DISC_ME_AND_THE_MOUNTAINS =
            registerDisc("disc_me_and_the_mountains", ModSounds.DISC_ME_AND_THE_MOUNTAINS_KEY);
    public static final Item DISC_ME_AND_THE_MOUNTAINS_2 =
            registerDisc("disc_me_and_the_mountains_2", ModSounds.DISC_ME_AND_THE_MOUNTAINS_2_KEY);
    public static final Item DISC_ME_AND_THE_WILDERNESS =
            registerDisc("disc_me_and_the_wilderness", ModSounds.DISC_ME_AND_THE_WILDERNESS_KEY);
    public static final Item DISC_MUSIC_FOR_THE_LONELY_MAN =
            registerDisc("disc_music_for_the_lonely_man", ModSounds.DISC_MUSIC_FOR_THE_LONELY_MAN_KEY);
    public static final Item DISC_MUSIC_FOR_THE_LONELY_MAN_2 =
            registerDisc("disc_music_for_the_lonely_man_2", ModSounds.DISC_MUSIC_FOR_THE_LONELY_MAN_2_KEY);
    public static final Item DISC_RUNNING_LIKE_THE_WIND =
            registerDisc("disc_running_like_the_wind", ModSounds.DISC_RUNNING_LIKE_THE_WIND_KEY);
    public static final Item DISC_SOLITAIRE = registerDisc("disc_solitaire", ModSounds.DISC_SOLITAIRE_KEY);
    public static final Item DISC_SON_OF_FREEDOM =
            registerDisc("disc_son_of_freedom", ModSounds.DISC_SON_OF_FREEDOM_KEY);
    public static final Item DISC_SON_OF_THE_WILDERNESS =
            registerDisc("disc_son_of_the_wilderness", ModSounds.DISC_SON_OF_THE_WILDERNESS_KEY);
    public static final Item DISC_THE_DOG = registerDisc("disc_the_dog", ModSounds.DISC_THE_DOG_KEY);
    public static final Item DISC_THE_NATIONAL_PARK =
            registerDisc("disc_the_national_park", ModSounds.DISC_THE_NATIONAL_PARK_KEY);
    public static final Item DISC_TRUMPET_TUNE_1 =
            registerDisc("disc_trumpet_tune_1", ModSounds.DISC_TRUMPET_TUNE_1_KEY);
    public static final Item DISC_TRUMPET_TUNE_2 =
            registerDisc("disc_trumpet_tune_2", ModSounds.DISC_TRUMPET_TUNE_2_KEY);
    public static final Item DISC_WALKING_SLOW_1 =
            registerDisc("disc_walking_slow_1", ModSounds.DISC_WALKING_SLOW_1_KEY);
    public static final Item DISC_WALKING_SLOW_2 =
            registerDisc("disc_walking_slow_2", ModSounds.DISC_WALKING_SLOW_2_KEY);
    public static final Item DISC_WALKING_SLOW_3 =
            registerDisc("disc_walking_slow_3", ModSounds.DISC_WALKING_SLOW_3_KEY);
    public static final Item DISC_WHISTLING_IN_THE_WIND =
            registerDisc("disc_whistling_in_the_wind", ModSounds.DISC_WHISTLING_IN_THE_WIND_KEY);

    public static final Item DISC_WORLD_IS_MINE = registerDisc("disc_world_is_mine", ModSounds.DISC_WORLD_IS_MINE_KEY);
    public static final Item DISC_TELEPATHY = registerDisc("disc_telepathy", ModSounds.DISC_TELEPATHY_KEY);
    public static final Item DISC_RESTLESSNESS = registerDisc("disc_restlessness", ModSounds.DISC_RESTLESSNESS_KEY);
        public static final Item DISC_TOE_WIZARD =
            registerDisc("disc_toe_wizard", ModSounds.DISC_TOE_WIZARD_KEY);

    public static final Item TOKEN = registerItem("token", new Item(new Item.Settings()));

    public static Item registerDisc(String name, RegistryKey<JukeboxSong> soundKey) {
        Settings settings = new Item.Settings();
        settings.maxCount(1);
        settings.rarity(Rarity.RARE);
        settings.jukeboxPlayable(soundKey);
        return registerItem(name, new Item(settings));
    }

    private static Item registerItem(String id, Item item) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(Blarium.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

    private static void registerModItems() {}

    public static void init() {
        registerModItems();
    }
}
