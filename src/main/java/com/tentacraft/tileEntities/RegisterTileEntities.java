package com.tentacraft.tileEntities;

import com.tentacraft.tileEntities.render.TE_SquidChestRender;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterTileEntities
{
	
	public static final String TE_SquidChestName = "TE_SquidChest";
	
	public static void registerTileEntities()
	{
		registerTileEntity(TE_SquidChest.class, TE_SquidChestName);
	}
	
	public static void registerTERenders()
	{
		
	}
	
	public static void registerTileEntity(Class c, String name)
	{
		GameRegistry.registerTileEntity(c, name);
	}
	
	public static void registerTERender()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TE_SquidChest.class, new TE_SquidChestRender());
	}
	
}
