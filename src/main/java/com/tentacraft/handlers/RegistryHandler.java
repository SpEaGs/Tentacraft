package com.tentacraft.handlers;

import com.tentacraft.Ref;
import com.tentacraft.tileEntities.TE_SquidChest;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler
{

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> e)
	{
		e.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> e)
	{
		e.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent e)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for (Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void registerTileEntity(Class cla, String id)
	{
		GameRegistry.registerTileEntity(cla, id);
	}
	
	public static void registerTileEntities()
	{
		for(Class cla : ModTileEntities.TILE_ENTITIES)
		{
			registerTileEntity(cla, Ref.MODID + ":" + cla.getName().toLowerCase());
		}
	}
}
