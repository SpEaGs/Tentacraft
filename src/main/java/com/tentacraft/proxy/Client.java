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
		RegisterItems.registerRenders();
		Tentacraft.log().info("Pre-Init Complete!");
    }
	@Override
    public void init(FMLInitializationEvent e)
	{
		Tentacraft.log().info("Init Complete!");
    }
	@Override
    public void postInit(FMLPostInitializationEvent e)
	{
    	Tentacraft.log().info("Post-Init Complete! Hello world!");
    }
	
}