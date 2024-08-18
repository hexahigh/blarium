package dev.boofdev.blarium.registries;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import dev.boofdev.blarium.Blarium;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModSounds {

    public static final SoundEvent THE_FLAME = register("disc_the_flame");
    public static final SoundEvent MATILDA = register("disc_matilda");
    public static final SoundEvent LIBELLA_SWING = register("disc_libella_swing");
    public static final SoundEvent HOTEL_AXOS = register("disc_hotel_axos");
    public static final SoundEvent FLEUR_DE_LILLE = register("disc_fleur_de_lille");
    public static final SoundEvent CATGROOVE = register("disc_catgroove");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(Blarium.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void init() { }

}
