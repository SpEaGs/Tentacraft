package com.tentacraft.proxy;

import com.tentacraft.Tentacraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Server extends Common
{
	
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
		Tentacraft.log().info("Preinit");
    }
	@Override
    public void init(FMLInitializationEvent e)
	{
		Tentacraft.log().info("Init");
    }
	@Override
    public void postInit(FMLPostInitializationEvent e)
	{
		Tentacraft.log().info("PostInit");
    }
	
}