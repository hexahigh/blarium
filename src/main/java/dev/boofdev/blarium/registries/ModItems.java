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

    public static final Item DISC_DROOPY_LIKES_RICOCHET = registerDisc("disc_droopy_likes_ricochet", ModSounds.DISC_DROOPY_LIKES_RICOCHET, 203);
    public static final Item DISC_DROOPY_LIKES_YOUR_FACE = registerDisc("disc_droopy_likes_your_face", ModSounds.DISC_DROOPY_LIKES_YOUR_FACE, 203);

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
