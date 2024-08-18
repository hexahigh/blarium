package dev.boofdev.blarium.registries;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EXTRA_DISCS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier("extra_discs", "discs"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.extra_discs"))
    .icon(() -> new ItemStack(ModItems.DISC_THE_FLAME)).entries((displayContext, entries) -> {
        entries.add(ModItems.DISC_THE_FLAME);
        entries.add(ModItems.DISC_MATILDA);
        entries.add(ModItems.DISC_LIBELLA_SWING);
        entries.add(ModItems.DISC_HOTEL_AXOS);
        entries.add(ModItems.DISC_FLEUR_DE_LILLE);
        entries.add(ModItems.DISC_CATGROOVE);

        entries.add(ModItems.TOKEN);
    }).build());

    public static void init() { }
}