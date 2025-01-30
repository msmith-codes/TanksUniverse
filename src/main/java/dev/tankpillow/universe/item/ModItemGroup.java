package dev.tankpillow.universe.item;

import dev.tankpillow.universe.TanksUniverse;
import dev.tankpillow.universe.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup 
{
	public static final ItemGroup UNIVERSE_BLOCKS = FabricItemGroupBuilder.build(
			new Identifier(TanksUniverse.MOD_ID, "universe_blocks"), () -> new ItemStack(ModBlocks.ALUMINUM_ORE));
	public static final ItemGroup UNIVERSE_ITEMS = FabricItemGroupBuilder.build(
			new Identifier(TanksUniverse.MOD_ID, "universe_items"), () -> new ItemStack(ModItems.ALUMINUM_INGOT));
}
