package com.tentacraft;

import com.tentacraft.Handlers.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs
{

	public CreativeTab()
	{
		super("Tentacraft");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		 return new ItemStack(ModItems.TENTACLE, 1);
	}

}
