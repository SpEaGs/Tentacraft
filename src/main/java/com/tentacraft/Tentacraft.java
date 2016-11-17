package com.tentacraft;

import com.tentacraft.proxy.Common;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tentacraft.MODID, version = Tentacraft.VERSION)
public class Tentacraft
{
	 
    public static final String MODID = "tentacraft";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide="com.tentacraft.proxy.Common", serverSide="com.tentacraft.proxy.Server")
    public static Common proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    public static void log(String line){
    	System.out.println(line);
    }
    
}
