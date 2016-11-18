package com.tentacraft.blocks;

import com.tentacraft.Ref;
import com.tentacraft.Tentacraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterBlocks
{

	public static BlockContainer BlockSquidChest;
	
	public static ItemBlock BlockSquidChestItem;
	
	public static final String BlockSquidChestName = "BlockSquidChest";
	
	public static void init()
	{
		BlockSquidChest = new BlockSquidChest();
		BlockSquidChestItem = new ItemBlock(BlockSquidChest);
	}
	
	public static void registerBlocks()
	{
		registerBlock(BlockSquidChest, BlockSquidChestItem, BlockSquidChestName);
	}
	
	public static void registerRenders()
	{
		registerRender(BlockSquidChest, BlockSquidChestItem, BlockSquidChestName);
	}
	
	public static void registerBlock(Block block, ItemBlock item, String name)
	{
		block.setRegistryName(name);
		block.setUnlocalizedName(name);
		block.setCreativeTab(Tentacraft.items);
		GameRegistry.register(block);
		
		item.setRegistryName(name);
		item.setUnlocalizedName(name);
		GameRegistry.register(item);
		
		Tentacraft.log().info("Registered Block: " + name);
	}
	
	public static void registerRender(Block block, ItemBlock item, String name)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Ref.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	
		Tentacraft.log().info("Registered Block Model: " + name);
	}
	
}
