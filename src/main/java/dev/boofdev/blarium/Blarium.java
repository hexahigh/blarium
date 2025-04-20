package dev.boofdev.blarium;

import dev.boofdev.blarium.commands.ModCommands;
import dev.boofdev.blarium.registries.ModItemGroups;
import dev.boofdev.blarium.registries.ModItems;
import dev.boofdev.blarium.registries.ModSounds;
import net.fabricmc.api.ModInitializer;

public class Blarium implements ModInitializer {

    public static final String MOD_ID = "blarium";
    public static final String MOD_NAME = "Blarium";

    @Override
    public void onInitialize() {
        System.out.println("\uD83D\uDC4B Starting " + MOD_NAME + "!");

        ModItems.init();
        ModSounds.init();
        ModItemGroups.init();
        ModCommands.init();
    }
}
