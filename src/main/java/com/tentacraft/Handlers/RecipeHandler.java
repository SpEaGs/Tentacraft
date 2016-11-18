package com.tentacraft.Handlers;

import com.tentacraft.Tentacraft;
import com.tentacraft.items.RegisterItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler
{
	
	public static void registerRecipes()
	{
		registerCraftingRecipes();
		registerSmeltingRecipes();
	}
	
	public static void registerCraftingRecipes()
	{
		Tentacraft.log().info("Registering crafting recipes...");
		//Squid Net (empty)
		GameRegistry.addRecipe(new ItemStack(RegisterItems.ItemSquidNet), new Object[] {"SSS", "STS", "SSS", 'S', Items.STRING, 'T', RegisterItems.ItemTentacle});
		
	}

	public static void registerSmeltingRecipes()
	{
		Tentacraft.log().info("Registering smelting recipes...");
		GameRegistry.addSmelting(RegisterItems.ItemTentacle, new ItemStack(RegisterItems.ItemCalamari, 1), 0.7f);
	}

}