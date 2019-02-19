package com.tentacraft.proxy;

import com.tentacraft.handlers.RegistryHandler;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common
{
	public void registerItemRenderer(Item item, int meta, String id) {}
	
	public void preInit(FMLPreInitializationEvent e)
	{
		RegistryHandler.registerTileEntities();
    }

    public void init(FMLInitializationEvent e)
    {
    	
    }

    public void postInit(FMLPostInitializationEvent e)
    {
    	
    }
    
}