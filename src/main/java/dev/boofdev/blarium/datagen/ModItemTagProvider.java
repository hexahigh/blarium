package dev.boofdev.blarium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import java.util.concurrent.CompletableFuture;

import dev.boofdev.blarium.registries.ModItems;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.DISC_THE_FLAME, ModItems.DISC_MATILDA, ModItems.DISC_LIBELLA_SWING,
                        ModItems.DISC_HOTEL_AXOS, ModItems.DISC_FLEUR_DE_LILLE, ModItems.DISC_CATGROOVE,
                        ModItems.DISC_DROOPY_LIKES_RICOCHET, ModItems.DISC_DROOPY_LIKES_YOUR_FACE);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.DISC_THE_FLAME, ModItems.DISC_MATILDA, ModItems.DISC_LIBELLA_SWING,
                        ModItems.DISC_HOTEL_AXOS, ModItems.DISC_FLEUR_DE_LILLE, ModItems.DISC_CATGROOVE,
                        ModItems.DISC_DROOPY_LIKES_RICOCHET, ModItems.DISC_DROOPY_LIKES_YOUR_FACE);
    }

}
