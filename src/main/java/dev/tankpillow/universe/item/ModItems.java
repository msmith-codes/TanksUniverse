package dev.tankpillow.universe.item;

import dev.tankpillow.universe.TanksUniverse;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems 
{
	public static final Item ALUMINUM_INGOT = ModItems.registerItem("aluminum_ingot", 
			new Item(new FabricItemSettings()
					.group(ModItemGroup.UNIVERSE_ITEMS)));
	
	public static final Item RAW_ALUMINUM = ModItems.registerItem("raw_aluminum", 
			new Item(new FabricItemSettings()
					.group(ModItemGroup.UNIVERSE_ITEMS)));
	
	
	private static Item registerItem(String name, Item item)
	{
		return Registry.register(Registry.ITEM, new Identifier(TanksUniverse.MOD_ID, name), item);
	}
	
	public static void registerModItems()
	{
		TanksUniverse.LOGGER.info("Registering Mod Items for " + TanksUniverse.MOD_ID + "...");
	}
}
