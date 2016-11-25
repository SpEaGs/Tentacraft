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
	public static Block BlockTentacleBlock;
	public static Block BlockCalamariBlock;
	public static Block BlockMonochromaticBlock;
	public static Block BlockBioluminescentBlock;
	
	public static ItemBlock BlockSquidChestItem;
	public static ItemBlock BlockTentacleBlockItem;
	public static ItemBlock BlockCalamariBlockItem;
	public static ItemBlock BlockMonochromaticBlockItem;
	public static ItemBlock BlockBioluminescentBlockItem;
	
	public static final String BlockSquidChestName = "BlockSquidChest";
	public static final String BlockTentacleBlockName = "BlockTentacleBlock";
	public static final String BlockCalamariBlockName = "BlockCalamariBlock";
	public static final String BlockMonochromaticBlockName = "BlockMonochromaticBlock";
	public static final String BlockBioluminescentBlockName = "BlockBioluminescentBlock";
	
	public static void init()
	{
		BlockSquidChest = new BlockSquidChest();
		BlockSquidChestItem = new ItemBlock(BlockSquidChest);
		
		BlockTentacleBlock = new BlockTentacleBlock();
		BlockTentacleBlockItem = new ItemBlock(BlockTentacleBlock);
		
		BlockCalamariBlock = new BlockCalamariBlock();
		BlockCalamariBlockItem = new ItemBlock(BlockCalamariBlock);
		
		BlockMonochromaticBlock = new BlockMonochromaticBlock();
		BlockMonochromaticBlockItem = new ItemBlock(BlockMonochromaticBlock);
		
		BlockBioluminescentBlock = new BlockBioluminescentBlock();
		BlockBioluminescentBlockItem = new ItemBlock(BlockBioluminescentBlock);
	}
	
	public static void registerBlocks()
	{
		registerBlock(BlockSquidChest, BlockSquidChestItem, BlockSquidChestName);
		registerBlock(BlockTentacleBlock, BlockTentacleBlockItem, BlockTentacleBlockName);
		registerBlock(BlockCalamariBlock, BlockCalamariBlockItem, BlockCalamariBlockName);
		registerBlock(BlockMonochromaticBlock, BlockMonochromaticBlockItem, BlockMonochromaticBlockName);
		registerBlock(BlockBioluminescentBlock, BlockBioluminescentBlockItem, BlockBioluminescentBlockName);
	}
	
	public static void registerRenders()
	{
		registerRender(BlockSquidChest, BlockSquidChestItem, BlockSquidChestName);
		registerRender(BlockTentacleBlock, BlockTentacleBlockItem, BlockTentacleBlockName);
		registerRender(BlockCalamariBlock, BlockCalamariBlockItem, BlockCalamariBlockName);
		registerRender(BlockMonochromaticBlock, BlockMonochromaticBlockItem, BlockMonochromaticBlockName);
		registerRender(BlockBioluminescentBlock, BlockBioluminescentBlockItem, BlockBioluminescentBlockName);
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
