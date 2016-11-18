package com.tentacraft.proxy;

import com.tentacraft.Tentacraft;
import com.tentacraft.Handlers.RecipeHandler;
import com.tentacraft.items.RegisterItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Client extends Common
{
	
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		Tentacraft.log().info("PreinitClient");
		RegisterItems.RegisterAll();
    }
	@Override
    public void init(FMLInitializationEvent e)
	{
		Tentacraft.log().info("InitClient");
		RecipeHandler.registerRecipes();
    }
	@Override
    public void postInit(FMLPostInitializationEvent e)
	{

    }
	
}