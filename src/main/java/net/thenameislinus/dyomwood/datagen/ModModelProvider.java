package net.thenameislinus.dyomwood.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.thenameislinus.dyomwood.block.ModBlocks;
import net.thenameislinus.dyomwood.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COMPRESSED_DYOM_WOOD_STONE);

        blockStateModelGenerator.registerLog(ModBlocks.DYOM_LOG).log(ModBlocks.DYOM_LOG).wood(ModBlocks.DYOM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DYOM_LOG).log(ModBlocks.STRIPPED_DYOM_LOG).wood(ModBlocks.STRIPPED_DYOM_WOOD);
        BlockStateModelGenerator.BlockTexturePool dyomPlanksTexturePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DYOM_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DYOM_LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DYOM_SAPLING, ModBlocks.POTTED_DYOM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        dyomPlanksTexturePool.stairs(ModBlocks.DYOM_STAIRS);
        dyomPlanksTexturePool.slab(ModBlocks.DYOM_SLAB);
        dyomPlanksTexturePool.button(ModBlocks.DYOM_BUTTON);
        dyomPlanksTexturePool.pressurePlate(ModBlocks.DYOM_PRESSURE_PLATE);


        blockStateModelGenerator.registerDoor(ModBlocks.DYOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DYOM_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COMPRESSED_DYOM_WOOD_ROCK, Models.GENERATED);
    }
}
