package dev.boofdev.blarium.registries;

import dev.boofdev.blarium.Blarium;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class ModItems {

    public static final Item DISC_THE_FLAME = registerDisc("disc_the_flame", ModSounds.DISC_THE_FLAME, 333);
    public static final Item DISC_MATILDA = registerDisc("disc_matilda", ModSounds.DISC_MATILDA, 203);
    public static final Item DISC_LIBELLA_SWING = registerDisc("disc_libella_swing", ModSounds.DISC_LIBELLA_SWING, 365);
    public static final Item DISC_HOTEL_AXOS = registerDisc("disc_hotel_axos", ModSounds.DISC_HOTEL_AXOS, 335);
    public static final Item DISC_FLEUR_DE_LILLE = registerDisc("disc_fleur_de_lille", ModSounds.DISC_FLEUR_DE_LILLE, 317);
    public static final Item DISC_CATGROOVE = registerDisc("disc_catgroove", ModSounds.DISC_CATGROOVE, 238);

    public static final Item DISC_THROW_IT_BACK = registerDisc("disc_throw_it_back", ModSounds.DISC_THROW_IT_BACK, 181);
    public static final Item DISC_APRIL_SHOWERS = registerDisc("disc_april_showers", ModSounds.DISC_APRIL_SHOWERS, 275);
    public static final Item DISC_FAIDHERBE_SQUARE = registerDisc("disc_faidherbe_square", ModSounds.DISC_FAIDHERBE_SQUARE, 207);

    public static final Item DISC_DROOPY_LIKES_RICOCHET = registerDisc("disc_droopy_likes_ricochet", ModSounds.DISC_DROOPY_LIKES_RICOCHET, 203);
    public static final Item DISC_DROOPY_LIKES_YOUR_FACE = registerDisc("disc_droopy_likes_your_face", ModSounds.DISC_DROOPY_LIKES_YOUR_FACE, 203);

    public static final Item DISC_SIGMA_BOY = registerDisc("disc_sigma_boy", ModSounds.DISC_SIGMA_BOY, 143);

    public static final Item DISC_ARCTIC_PULSE = registerDisc("disc_arctic_pulse", ModSounds.DISC_ARCTIC_PULSE, 167);
    public static final Item DISC_BEAUTIFUL_HORIZONS = registerDisc("disc_beautiful_horizons", ModSounds.DISC_BEAUTIFUL_HORIZONS, 358);
    public static final Item DISC_ECHOES_OF_THE_PAST = registerDisc("disc_echoes_of_the_past", ModSounds.DISC_ECHOES_OF_THE_PAST, 185);
    public static final Item DISC_ME_AND_THE_MOUNTAINS = registerDisc("disc_me_and_the_mountains", ModSounds.DISC_ME_AND_THE_MOUNTAINS, 185);
    public static final Item DISC_ME_AND_THE_MOUNTAINS_2 = registerDisc("disc_me_and_the_mountains_2", ModSounds.DISC_ME_AND_THE_MOUNTAINS_2, 131);
    public static final Item DISC_ME_AND_THE_WILDERNESS = registerDisc("disc_me_and_the_wilderness", ModSounds.DISC_ME_AND_THE_WILDERNESS, 137);
    public static final Item DISC_MUSIC_FOR_THE_LONELY_MAN = registerDisc("disc_music_for_the_lonely_man", ModSounds.DISC_MUSIC_FOR_THE_LONELY_MAN, 168);
    public static final Item DISC_MUSIC_FOR_THE_LONELY_MAN_2 = registerDisc("disc_music_for_the_lonely_man_2", ModSounds.DISC_MUSIC_FOR_THE_LONELY_MAN_2, 183);
    public static final Item DISC_RUNNING_LIKE_THE_WIND = registerDisc("disc_running_like_the_wind", ModSounds.DISC_RUNNING_LIKE_THE_WIND, 79);
    public static final Item DISC_SOLITAIRE = registerDisc("disc_solitaire", ModSounds.DISC_SOLITAIRE, 94);
    public static final Item DISC_SON_OF_FREEDOM = registerDisc("disc_son_of_freedom", ModSounds.DISC_SON_OF_FREEDOM, 305);
    public static final Item DISC_SON_OF_THE_WILDERNESS = registerDisc("disc_son_of_the_wilderness", ModSounds.DISC_SON_OF_THE_WILDERNESS, 109);
    public static final Item DISC_THE_DOG = registerDisc("disc_the_dog", ModSounds.DISC_THE_DOG, 148);
    public static final Item DISC_THE_NATIONAL_PARK = registerDisc("disc_the_national_park", ModSounds.DISC_THE_NATIONAL_PARK, 198);
    public static final Item DISC_TRUMPET_TUNE_1 = registerDisc("disc_trumpet_tune_1", ModSounds.DISC_TRUMPET_TUNE_1, 174);
    public static final Item DISC_TRUMPET_TUNE_2 = registerDisc("disc_trumpet_tune_2", ModSounds.DISC_TRUMPET_TUNE_2, 74);
    public static final Item DISC_WALKING_SLOW_1 = registerDisc("disc_walking_slow_1", ModSounds.DISC_WALKING_SLOW_1, 115);
    public static final Item DISC_WALKING_SLOW_2 = registerDisc("disc_walking_slow_2", ModSounds.DISC_WALKING_SLOW_2, 305);
    public static final Item DISC_WALKING_SLOW_3 = registerDisc("disc_walking_slow_3", ModSounds.DISC_WALKING_SLOW_3, 173);
    public static final Item DISC_WHISTLING_IN_THE_WIND = registerDisc("disc_whistling_in_the_wind", ModSounds.DISC_WHISTLING_IN_THE_WIND, 142);

    public static final Item TOKEN = registerItem("token", new Item(new Item.Settings()));
    

    public static Item registerDisc(String name, SoundEvent sound, int length) {
        Settings settings = new FabricItemSettings();
        settings.maxCount(1);
        settings.rarity(Rarity.RARE);
        return registerItem(name, new MusicDiscItem(7, sound, settings, length));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Blarium.MOD_ID, name), item);
    }

    private static void registerModItems() {

    }

    public static void init() { 
        registerModItems();
    }

}
