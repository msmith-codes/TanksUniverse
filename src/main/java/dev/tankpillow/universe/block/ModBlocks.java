package dev.tankpillow.universe.block;

import dev.tankpillow.universe.TanksUniverse;
import dev.tankpillow.universe.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks 
{
	public static final Block ALUMINUM_BLOCK = registerBlock("aluminum_block", 
			new Block(FabricBlockSettings.of(Material.METAL)
					.strength(6f)
					.requiresTool()
					.sounds(BlockSoundGroup.COPPER)), ModItemGroup.UNIVERSE_BLOCKS);
	
	public static final Block ALUMINUM_ORE = registerBlock("aluminum_ore", 
			new Block(FabricBlockSettings.of(Material.STONE)
					.strength(4f)
					.requiresTool()
					.sounds(BlockSoundGroup.STONE)), ModItemGroup.UNIVERSE_BLOCKS);
	
	public static final Block DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore", 
			new Block(FabricBlockSettings.of(Material.STONE)
					.strength(6f)
					.requiresTool()
					.sounds(BlockSoundGroup.DEEPSLATE)), ModItemGroup.UNIVERSE_BLOCKS);
	
	public static Block registerBlock(String name, Block block, ItemGroup group)
	{
		ModBlocks.registerBlockItem(name, block, group);
		return Registry.register(Registry.BLOCK, new Identifier(TanksUniverse.MOD_ID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block, ItemGroup group)
	{
		return Registry.register(Registry.ITEM, new Identifier(TanksUniverse.MOD_ID, name), 
				new BlockItem(block, new FabricItemSettings().group(group)));
	}
	
	public static void registerModBlocks()
	{
		TanksUniverse.LOGGER.info("Registering Mod Blocks for " + TanksUniverse.MOD_ID + "...");
	}
}
