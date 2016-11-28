package com.tentacraft.tileEntities;

import com.tentacraft.tileEntities.render.TE_SquidChestRender;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterTileEntities
{
	
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TE_SquidChest.class, "TE_SquidChest");
		GameRegistry.registerTileEntity(TE_TentalyticConverter.class, "TE_TentalyticConverter");
	}
	
	public static void registerTERenders()
	{
		
	}
	
	public static void registerTERender()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TE_SquidChest.class, new TE_SquidChestRender());
	}
	
}
