package net.thenameislinus.dyomwood.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.thenameislinus.dyomwood.DyomWood;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COMPRESSED_DYOM_WOOD_STONE = registerBlock("compressed_dyom_wood_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool()));

    public static final Block DYOM_LOG = registerBlock("dyom_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block DYOM_WOOD = registerBlock("dyom_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_DYOM_LOG = registerBlock("stripped_dyom_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_DYOM_WOOD = registerBlock("stripped_dyom_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block DYOM_PLANKS = registerBlock("dyom_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block DYOM_LEAVES = registerBlock("dyom_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(1f)));

    public static final Block DYOM_SAPLING = registerBlock("dyom_sapling",
            new SaplingBlock(null, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_DYOM_SAPLING = registerBlockWithoutBlockItem("potted_dyom_sapling",
            new FlowerPotBlock(DYOM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block DYOM_STAIRS = registerBlock("dyom_stairs",
            new StairsBlock(ModBlocks.DYOM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block DYOM_SLAB = registerBlock("dyom_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));

    public static final Block DYOM_BUTTON = registerBlock("dyom_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block DYOM_PRESSURE_PLATE = registerBlock("dyom_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final Block DYOM_DOOR = registerBlock("dyom_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block DYOM_TRAPDOOR = registerBlock("dyom_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block DYOM_FENCE = registerBlock("dyom_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DYOM_FENCE_GATE = registerBlock("dyom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.ACACIA));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DyomWood.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DyomWood.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(DyomWood.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        DyomWood.LOGGER.info("Registering ModBlocks for " + DyomWood.MOD_ID);
    }
}
