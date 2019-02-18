package com.tentacraft.proxy;

import com.tentacraft.Tentacraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Client extends Common
{
	public void registerItemRenderer(Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	}
	
	@Override
	public void preInit(FMLPreInitializationEvent e)
	{
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