package net.thenameislinus.dyomwood;

import net.fabricmc.api.ModInitializer;

import net.thenameislinus.dyomwood.block.ModBlocks;
import net.thenameislinus.dyomwood.item.ModItemGroup;
import net.thenameislinus.dyomwood.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyomWood implements ModInitializer {
	public static final String MOD_ID = "dyomwood";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModItemGroup.registerItemGroups();



	}
}