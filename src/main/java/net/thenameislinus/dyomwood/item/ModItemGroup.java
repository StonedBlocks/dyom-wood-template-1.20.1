package net.thenameislinus.dyomwood.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Items;
import net.thenameislinus.dyomwood.DyomWood;
import net.thenameislinus.dyomwood.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DYOM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(DyomWood.MOD_ID, "pink_garnet_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dyom_group"))
                    .icon(() -> new ItemStack(Items.KELP)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COMPRESSED_DYOM_WOOD_STONE);
                        entries.add(ModBlocks.DYOM_LOG);
                        entries.add(ModBlocks.DYOM_WOOD);
                        entries.add(ModBlocks.STRIPPED_DYOM_LOG);
                        entries.add(ModBlocks.STRIPPED_DYOM_WOOD);
                        entries.add(ModBlocks.DYOM_PLANKS);
                        entries.add(ModBlocks.DYOM_LEAVES);
                        entries.add(ModBlocks.DYOM_SAPLING);
                        entries.add(ModBlocks.DYOM_STAIRS);
                        entries.add(ModBlocks.DYOM_SLAB);

                        entries.add(ModItems.COMPRESSED_DYOM_WOOD_ROCK);
                        
                    }).build());

    public static void registerItemGroups() {

    }
}
