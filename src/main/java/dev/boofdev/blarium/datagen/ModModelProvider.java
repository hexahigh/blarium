package dev.boofdev.blarium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import dev.boofdev.blarium.registries.ModItems;

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
        regMulGen(itemModelGenerator, ModItems.DISC_THE_FLAME, ModItems.DISC_MATILDA, ModItems.DISC_LIBELLA_SWING, ModItems.DISC_HOTEL_AXOS, ModItems.DISC_FLEUR_DE_LILLE, ModItems.DISC_CATGROOVE);

        itemModelGenerator.register(ModItems.TOKEN, Models.GENERATED);
    }

    /**
     * Registers multiple items with the given ItemModelGenerator.
     * Models are automatically generated from the given items
     *
     * @param  itemModelGenerator the ItemModelGenerator to register the items with
     * @param  items             the items to register
     */
    private void regMulGen(ItemModelGenerator itemModelGenerator, Item... items) {
        for (Item item : items) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}