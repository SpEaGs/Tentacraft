package com.tentacraft.blocks;

import com.tentacraft.Ref;
import com.tentacraft.Tentacraft;
import com.tentacraft.tileEntities.TE_SquidChest;
import com.tentacraft.tileEntities.TE_TentalyticConverter;

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
	public static Block BlockGlowingTentacleBlock;
	public static Block BlockGlowingCalamariBlock;
	public static Block BlockTentalyticConverterBlock;
	
	public static ItemBlock BlockSquidChestItem;
	public static ItemBlock BlockTentacleBlockItem;
	public static ItemBlock BlockCalamariBlockItem;
	public static ItemBlock BlockMonochromaticBlockItem;
	public static ItemBlock BlockBioluminescentBlockItem;
	public static ItemBlock BlockGlowingTentacleBlockItem;
	public static ItemBlock BlockGlowingCalamariBlockItem;
	public static ItemBlock BlockTentalyticConverterItem;
	
	public static final String BlockSquidChestName = "BlockSquidChest";
	public static final String BlockTentacleBlockName = "BlockTentacleBlock";
	public static final String BlockCalamariBlockName = "BlockCalamariBlock";
	public static final String BlockMonochromaticBlockName = "BlockMonochromaticBlock";
	public static final String BlockBioluminescentBlockName = "BlockBioluminescentBlock";
	public static final String BlockGlowingTentacleBlockName = "BlockGlowingTentacleBlock";
	public static final String BlockGlowingCalamariBlockName = "BlockGlowingCalamariBlock";
	public static final String BlockTentalyticConverterName = "BlockTentalyticConverterBlock";
	
	public static void init()
	{
		BlockSquidChest = new BlockSquidChest();
		BlockSquidChestItem = new ItemBlock(BlockSquidChest);
		
		BlockTentacleBlock = new TentacleBlock();
		BlockTentacleBlockItem = new ItemBlock(BlockTentacleBlock);
		
		BlockCalamariBlock = new CalamariBlock();
		BlockCalamariBlockItem = new ItemBlock(BlockCalamariBlock);
		
		BlockMonochromaticBlock = new MonoBlock();
		BlockMonochromaticBlockItem = new ItemBlock(BlockMonochromaticBlock);
		
		BlockBioluminescentBlock = new BiolumBlock();
		BlockBioluminescentBlockItem = new ItemBlock(BlockBioluminescentBlock);
		
		BlockGlowingTentacleBlock = new GlowTentacleBlock();
		BlockGlowingTentacleBlockItem = new ItemBlock(BlockGlowingTentacleBlock);
		
		BlockGlowingCalamariBlock = new GlowCalamariBlock();
		BlockGlowingCalamariBlockItem = new ItemBlock(BlockGlowingCalamariBlock);
		
		BlockTentalyticConverterBlock = new BlockTentalyticConverter();
		BlockTentalyticConverterItem = new ItemBlock(BlockTentalyticConverterBlock);
	}
	
	public static void registerBlocks()
	{
		Tentacraft.log().info("Registering Blocks...");
		
		registerBlock(BlockSquidChest, BlockSquidChestItem, BlockSquidChestName);
		registerBlock(BlockTentacleBlock, BlockTentacleBlockItem, BlockTentacleBlockName);
		registerBlock(BlockCalamariBlock, BlockCalamariBlockItem, BlockCalamariBlockName);
		registerBlock(BlockMonochromaticBlock, BlockMonochromaticBlockItem, BlockMonochromaticBlockName);
		registerBlock(BlockBioluminescentBlock, BlockBioluminescentBlockItem, BlockBioluminescentBlockName);
		registerBlock(BlockGlowingTentacleBlock, BlockGlowingTentacleBlockItem, BlockGlowingTentacleBlockName);
		registerBlock(BlockGlowingCalamariBlock, BlockGlowingCalamariBlockItem, BlockGlowingCalamariBlockName);
		registerBlock(BlockTentalyticConverterBlock, BlockTentalyticConverterItem, BlockTentalyticConverterName);
		
		Tentacraft.log().info("Done!");
	}
	
	public static void registerRenders()
	{
		Tentacraft.log().info("Registering Block Renders...");
		
		registerRender(BlockSquidChest, BlockSquidChestItem, BlockSquidChestName);
		registerRender(BlockTentacleBlock, BlockTentacleBlockItem, BlockTentacleBlockName);
		registerRender(BlockCalamariBlock, BlockCalamariBlockItem, BlockCalamariBlockName);
		registerRender(BlockMonochromaticBlock, BlockMonochromaticBlockItem, BlockMonochromaticBlockName);
		registerRender(BlockBioluminescentBlock, BlockBioluminescentBlockItem, BlockBioluminescentBlockName);
		registerRender(BlockGlowingTentacleBlock, BlockGlowingTentacleBlockItem, BlockGlowingTentacleBlockName);
		registerRender(BlockGlowingCalamariBlock, BlockGlowingCalamariBlockItem, BlockGlowingCalamariBlockName);
		registerRender(BlockTentalyticConverterBlock, BlockTentalyticConverterItem, BlockTentalyticConverterName);
		
		Tentacraft.log().info("Done!");
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
	}
	
	public static void registerRender(Block block, ItemBlock item, String name)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Ref.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
	
}
