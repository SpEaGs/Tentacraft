package com.tentacraft.items.food;

import com.tentacraft.Tentacraft;
import com.tentacraft.handlers.IHasModel;
import com.tentacraft.handlers.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{

	public FoodBase(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
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
