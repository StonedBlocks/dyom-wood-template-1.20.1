package net.thenameislinus.dyomwood.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thenameislinus.dyomwood.DyomWood;

public class ModItems {
    public static final Item COMPRESSED_DYOM_WOOD_ROCK = registerItem("compressed_dyom_wood_rock",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(DyomWood.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(COMPRESSED_DYOM_WOOD_ROCK);
    }

    public static void registerModItems() {
        DyomWood.LOGGER.info("Registering Mod Items for " + DyomWood.MOD_ID);


    }
}
