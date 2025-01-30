package dev.tankpillow.universe;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.tankpillow.universe.block.ModBlocks;
import dev.tankpillow.universe.item.ModItems;

public class TanksUniverse implements ModInitializer {
	public static final String MOD_ID = "tanks-universe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() 
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}