package com.tentacraft.items;

import com.tentacraft.Tentacraft;
import com.tentacraft.Handlers.IHasModel;
import com.tentacraft.Handlers.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Tentacraft.itemTab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
	
		Tentacraft.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
