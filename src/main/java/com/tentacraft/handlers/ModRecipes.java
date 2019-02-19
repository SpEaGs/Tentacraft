package com.tentacraft.Handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{

	public static void init()
	{		
		GameRegistry.addSmelting(ModItems.TENTACLE, new ItemStack(ModItems.CALAMARI), 1.0f);
		GameRegistry.addSmelting(ModItems.GLOW_TENTACLE, new ItemStack(ModItems.GLOW_CALAMARI), 1.5f);
		GameRegistry.addSmelting(ModBlocks.TENTACLE_BLOCK, new ItemStack(ModBlocks.CALAMARI_BLOCK), 2.0f);
		GameRegistry.addSmelting(ModBlocks.GLOW_TENTACLE_BLOCK, new ItemStack(ModBlocks.GLOW_CALAMARI_BLOCK), 3.0f);
	}
	
}
