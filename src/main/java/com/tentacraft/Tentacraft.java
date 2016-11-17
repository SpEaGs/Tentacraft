package com.tentacraft;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tentacraft.proxy.Common;
import com.tentacraft.Ref;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MODID, version = Ref.VERSION)
public class Tentacraft
{
    
	public static final CreativeTabs items = new CreativeTab();
	
    @SidedProxy(clientSide="com.tentacraft.proxy.Client", serverSide="com.tentacraft.proxy.Server")
    public static Common proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit(e);
    }
    
    private static Logger logger;
    public static Logger log()
    {
    	if(logger==null)
    	{
    		logger = LogManager.getFormatterLogger(Ref.MODID);
    	}
    	return logger;
    }
    
}
