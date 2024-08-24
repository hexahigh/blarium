package dev.boofdev.blarium.registries;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import dev.boofdev.blarium.Blarium;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModSounds {

    public static final SoundEvent DISC_THE_FLAME = register("disc_the_flame");
    public static final SoundEvent DISC_MATILDA = register("disc_matilda");
    public static final SoundEvent DISC_LIBELLA_SWING = register("disc_libella_swing");
    public static final SoundEvent DISC_HOTEL_AXOS = register("disc_hotel_axos");
    public static final SoundEvent DISC_FLEUR_DE_LILLE = register("disc_fleur_de_lille");
    public static final SoundEvent DISC_CATGROOVE = register("disc_catgroove");
    public static final SoundEvent DISC_DROOPY_LIKES_RICOCHET = register("disc_droopy_likes_ricochet");
    public static final SoundEvent DISC_DROOPY_LIKES_YOUR_FACE = register("disc_droopy_likes_your_face");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(Blarium.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void init() { }

}
