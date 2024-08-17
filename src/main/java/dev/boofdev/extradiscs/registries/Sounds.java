package dev.boofdev.extradiscs.registries;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import dev.boofdev.extradiscs.ExtraDiscs;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Sounds {

    public static final SoundEvent SOUND_the_flame = register("music_disc_the_flame");

    public static SoundEvent register(String name) {
        Identifier id = new Identifier(ExtraDiscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void init() { }

}
