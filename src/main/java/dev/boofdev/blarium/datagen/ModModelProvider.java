package dev.boofdev.blarium.datagen;

import dev.boofdev.blarium.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // We don't have any blocks yet
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Discs
        regMulGen(
                itemModelGenerator,
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
                ModItems.DISC_WHISTLING_IN_THE_WIND,
                ModItems.DISC_WORLD_IS_MINE,
                ModItems.DISC_TELEPATHY,
                ModItems.DISC_RESTLESSNESS,
                ModItems.DISC_TOE_WIZARD,
                ModItems.DISC_GONE_GONE);

        itemModelGenerator.register(ModItems.TOKEN, Models.GENERATED);
    }

    /**
     * Registers multiple items with the given ItemModelGenerator.
     * Models are automatically generated from the given items
     *
     * @param itemModelGenerator the ItemModelGenerator to register the items with
     * @param items              the items to register
     */
    private void regMulGen(ItemModelGenerator itemModelGenerator, Item... items) {
        for (Item item : items) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}
