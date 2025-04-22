package dev.boofdev.blarium.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLARIUM = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of("blarium", "discs"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.blarium"))
                    .icon(() -> new ItemStack(ModItems.DISC_THE_FLAME))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.DISC_THE_FLAME);
                        entries.add(ModItems.DISC_MATILDA);
                        entries.add(ModItems.DISC_LIBELLA_SWING);
                        entries.add(ModItems.DISC_HOTEL_AXOS);
                        entries.add(ModItems.DISC_FLEUR_DE_LILLE);
                        entries.add(ModItems.DISC_CATGROOVE);

                        entries.add(ModItems.DISC_DROOPY_LIKES_RICOCHET);
                        entries.add(ModItems.DISC_DROOPY_LIKES_YOUR_FACE);

                        entries.add(ModItems.DISC_THROW_IT_BACK);
                        entries.add(ModItems.DISC_APRIL_SHOWERS);
                        entries.add(ModItems.DISC_FAIDHERBE_SQUARE);

                        entries.add(ModItems.DISC_SIGMA_BOY);

                        entries.add(ModItems.DISC_ARCTIC_PULSE);
                        entries.add(ModItems.DISC_BEAUTIFUL_HORIZONS);
                        entries.add(ModItems.DISC_ECHOES_OF_THE_PAST);
                        entries.add(ModItems.DISC_ME_AND_THE_MOUNTAINS);
                        entries.add(ModItems.DISC_ME_AND_THE_MOUNTAINS_2);
                        entries.add(ModItems.DISC_ME_AND_THE_WILDERNESS);
                        entries.add(ModItems.DISC_MUSIC_FOR_THE_LONELY_MAN);
                        entries.add(ModItems.DISC_MUSIC_FOR_THE_LONELY_MAN_2);
                        entries.add(ModItems.DISC_RUNNING_LIKE_THE_WIND);
                        entries.add(ModItems.DISC_SOLITAIRE);
                        entries.add(ModItems.DISC_SON_OF_FREEDOM);
                        entries.add(ModItems.DISC_SON_OF_THE_WILDERNESS);
                        entries.add(ModItems.DISC_THE_DOG);
                        entries.add(ModItems.DISC_THE_NATIONAL_PARK);
                        entries.add(ModItems.DISC_TRUMPET_TUNE_1);
                        entries.add(ModItems.DISC_TRUMPET_TUNE_2);
                        entries.add(ModItems.DISC_WALKING_SLOW_1);
                        entries.add(ModItems.DISC_WALKING_SLOW_2);
                        entries.add(ModItems.DISC_WALKING_SLOW_3);
                        entries.add(ModItems.DISC_WHISTLING_IN_THE_WIND);

                        entries.add(ModItems.DISC_WORLD_IS_MINE);
                        entries.add(ModItems.DISC_TELEPATHY);
                        entries.add(ModItems.DISC_RESTLESSNESS);
                        entries.add(ModItems.DISC_TOE_WIZARD);

                        entries.add(ModItems.TOKEN);
                    })
                    .build());

    public static void init() {}
}
