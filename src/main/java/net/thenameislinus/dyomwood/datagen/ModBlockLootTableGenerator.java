package net.thenameislinus.dyomwood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.thenameislinus.dyomwood.block.ModBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.COMPRESSED_DYOM_WOOD_STONE);

        addDrop(ModBlocks.DYOM_SAPLING);
        addDrop(ModBlocks.STRIPPED_DYOM_WOOD);
        addDrop(ModBlocks.STRIPPED_DYOM_LOG);
        addDrop(ModBlocks.DYOM_WOOD);
        addDrop(ModBlocks.DYOM_LOG);
        addDrop(ModBlocks.DYOM_PLANKS);
        addDrop(ModBlocks.DYOM_STAIRS);
        addDrop(ModBlocks.DYOM_BUTTON);
        addDrop(ModBlocks.DYOM_PRESSURE_PLATE);
        addDrop(ModBlocks.DYOM_SLAB, slabDrops(ModBlocks.DYOM_SLAB));
        addDrop(ModBlocks.DYOM_TRAPDOOR);
        addDrop(ModBlocks.DYOM_DOOR, doorDrops(ModBlocks.DYOM_DOOR));

    }
}
