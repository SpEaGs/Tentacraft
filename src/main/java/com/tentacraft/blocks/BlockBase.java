package com.tentacraft.blocks;

import com.tentacraft.Tentacraft;
import com.tentacraft.handlers.IHasModel;
import com.tentacraft.handlers.ModBlocks;
import com.tentacraft.handlers.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{

	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Tentacraft.itemTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Tentacraft.proxy.registerItemRenderer(Item.getItemFromBlock(this),  0,  "inventory");		
	}
	
}
