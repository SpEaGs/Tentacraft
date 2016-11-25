package com.tentacraft.Handlers;

import com.tentacraft.Tentacraft;
import com.tentacraft.blocks.RegisterBlocks;
import com.tentacraft.items.RegisterItems;

import net.minecraft.init.Blocks;
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
		//Squid Chest
		GameRegistry.addRecipe(new ItemStack(RegisterBlocks.BlockSquidChest), new Object[] {"TTT", "TCT", "TTT", 'T', RegisterItems.ItemTentacle, 'C', Blocks.CHEST});
		//Tentacle Block
		GameRegistry.addRecipe(new ItemStack(RegisterBlocks.BlockTentacleBlock), new Object[] {"TTT", "TTT", "TTT", 'T', RegisterItems.ItemTentacle});
		//Calamari Block
		GameRegistry.addRecipe(new ItemStack(RegisterBlocks.BlockCalamariBlock), new Object[] {"CCC", "CCC", "CCC", 'C', RegisterItems.ItemCalamari});
		//Monochrome Ink
		GameRegistry.addRecipe(new ItemStack(RegisterItems.ItemMonochromeInk, 6), new Object[] {"IGB", "   ", "   ", 'I', new ItemStack(Items.DYE, 1, 0), 'G', new ItemStack(Items.DYE, 1, 8), 'B', new ItemStack(Items.DYE, 1, 15)});
		//Monochromatic Block
		GameRegistry.addRecipe(new ItemStack(RegisterBlocks.BlockMonochromaticBlock, 8), new Object[] {"SSS", "SMS", "SSS", 'S', Blocks.STONE, 'M', RegisterItems.ItemMonochromeInk});
		//Bioluminescent Block
		GameRegistry.addRecipe(new ItemStack(RegisterBlocks.BlockBioluminescentBlock, 2), new Object[] {"   ", "BGB", "   ", 'B', RegisterItems.ItemBioluminescentDust, 'G', RegisterBlocks.BlockMonochromaticBlock});
		//Bioluminescent Dust
		GameRegistry.addRecipe(new ItemStack(RegisterItems.ItemBioluminescentDust, 4), new Object[] {"   ", " G ", "   ", 'G', RegisterItems.ItemBioluminescentDust});
	}

	public static void registerSmeltingRecipes()
	{
		Tentacraft.log().info("Registering smelting recipes...");
		//Calamari
		GameRegistry.addSmelting(RegisterItems.ItemTentacle, new ItemStack(RegisterItems.ItemCalamari, 1), 0.7f);
		//Calamari Block
		GameRegistry.addSmelting(RegisterBlocks.BlockTentacleBlock, new ItemStack(RegisterBlocks.BlockCalamariBlock, 1), 0.7f);
		//Glowing Calamari
		GameRegistry.addSmelting(RegisterItems.ItemGlowingTentacle, new ItemStack(RegisterItems.ItemGlowingCalamari, 1), 0.7f);
	}

}