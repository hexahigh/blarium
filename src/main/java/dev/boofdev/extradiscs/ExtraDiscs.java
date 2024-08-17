package dev.boofdev.extradiscs;

import dev.boofdev.extradiscs.registries.Items;
import dev.boofdev.extradiscs.registries.Sounds;
import net.fabricmc.api.ModInitializer;

public class ExtraDiscs implements ModInitializer {

    public static final String MOD_ID = "extra_discs";
    public static final String MOD_NAME = "Extra Discs";

    @Override
    public void onInitialize() {
        System.out.println("\uD83D\uDC4B Starting Extra Discs!");

        Items.init();
        Sounds.init();
    }

}
