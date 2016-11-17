package com.tentacraft.proxy;

import com.tentacraft.Tentacraft;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common {
	public void preInit(FMLPreInitializationEvent e) {
		Tentacraft.log("Preinit");
		com.tentacraft.items.RegisterItems.RegisterAll();
    }

    public void init(FMLInitializationEvent e) {
    	Tentacraft.log("Init");
    	
    }

    public void postInit(FMLPostInitializationEvent e) {
    	Tentacraft.log("PostInit");
    }
}
