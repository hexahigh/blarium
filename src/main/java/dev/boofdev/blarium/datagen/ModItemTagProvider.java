package dev.boofdev.blarium.datagen;

import dev.boofdev.blarium.registries.ModItems;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(
            FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(
                        ModItems.DISC_THE_FLAME,
                        ModItems.DISC_MATILDA,
                        ModItems.DISC_LIBELLA_SWING,
                        ModItems.DISC_HOTEL_AXOS,
                        ModItems.DISC_FLEUR_DE_LILLE,
                        ModItems.DISC_CATGROOVE,
                        ModItems.DISC_DROOPY_LIKES_RICOCHET,
                        ModItems.DISC_DROOPY_LIKES_YOUR_FACE,
                        ModItems.DISC_THROW_IT_BACK,
                        ModItems.DISC_FAIDHERBE_SQUARE,
                        ModItems.DISC_APRIL_SHOWERS,
                        ModItems.DISC_SIGMA_BOY,
                        ModItems.DISC_ARCTIC_PULSE,
                        ModItems.DISC_BEAUTIFUL_HORIZONS,
                        ModItems.DISC_ECHOES_OF_THE_PAST,
                        ModItems.DISC_ME_AND_THE_MOUNTAINS,
                        ModItems.DISC_ME_AND_THE_MOUNTAINS_2,
                        ModItems.DISC_ME_AND_THE_WILDERNESS,
                        ModItems.DISC_MUSIC_FOR_THE_LONELY_MAN,
                        ModItems.DISC_MUSIC_FOR_THE_LONELY_MAN_2,
                        ModItems.DISC_RUNNING_LIKE_THE_WIND,
                        ModItems.DISC_SOLITAIRE,
                        ModItems.DISC_SON_OF_FREEDOM,
                        ModItems.DISC_SON_OF_THE_WILDERNESS,
                        ModItems.DISC_THE_DOG,
                        ModItems.DISC_THE_NATIONAL_PARK,
                        ModItems.DISC_TRUMPET_TUNE_1,
                        ModItems.DISC_TRUMPET_TUNE_2,
                        ModItems.DISC_WALKING_SLOW_1,
                        ModItems.DISC_WALKING_SLOW_2,
                        ModItems.DISC_WALKING_SLOW_3,
                        ModItems.DISC_WHISTLING_IN_THE_WIND);
    }
}
