package dev.boofdev.blarium.datagen;

import dev.boofdev.blarium.registries.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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
        itemModelGenerator.register(ModItems.DISC_THE_FLAME, Models.GENERATED);
        itemModelGenerator.register(ModItems.DISC_MATILDA, Models.GENERATED);
        itemModelGenerator.register(ModItems.DISC_LIBELLA_SWING, Models.GENERATED);
        itemModelGenerator.register(ModItems.DISC_HOTEL_AXOS, Models.GENERATED);
        itemModelGenerator.register(ModItems.DISC_FLEUR_DE_LILLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DISC_CATGROOVE, Models.GENERATED);
    }
}
