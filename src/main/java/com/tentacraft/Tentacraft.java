package com.tentacraft;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.tentacraft.Handlers.DropEventHandler;
import com.tentacraft.Handlers.RecipeHandler;
import com.tentacraft.blocks.RegisterBlocks;
import com.tentacraft.items.RegisterItems;
import com.tentacraft.proxy.Common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Ref.MODID, version = Ref.VERSION, name = Ref.NAME)
public class Tentacraft
{
    
	public static final CreativeTabs items = new CreativeTab();
	
    @SidedProxy(clientSide="com.tentacraft.proxy.Client", serverSide="com.tentacraft.proxy.Server")
    public static Common proxy;
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
    	Tentacraft.log().info("Pre-Initializing...");
    	MinecraftForge.EVENT_BUS.register(new DropEventHandler());
    	
        RegisterItems.init();
        RegisterItems.registerItems();
        RegisterBlocks.init();
        RegisterBlocks.registerBlocks();

        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	Tentacraft.log().info("Initializing...");
    	
    	RecipeHandler.registerRecipes();
    	
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
    	Tentacraft.log().info("Post-Initializing...");
    	
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