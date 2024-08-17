package dev.boofdev.extradiscs.registries;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import dev.boofdev.extradiscs.ExtraDiscs;
import net.minecraft.item.*;
import net.minecraft.item.Item.Settings;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class Items {

    public static final Item DISC_the_flame = registerDisc("music_disc_the_flame", Sounds.SOUND_the_flame, 333);

    public static Item registerDisc(String id, SoundEvent sound, int length) {
        Settings settings = new FabricItemSettings();
        settings.maxCount(1);
        settings.rarity(Rarity.RARE);
        return registerItem(id, new MusicDiscItem(14, sound, settings, length));
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExtraDiscs.MOD_ID, name), item);
    }

    private static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(items -> {
            items.add(Items.DISC_the_flame);
        });
    }

    public static void init() { 
        registerModItems();
    }

}
