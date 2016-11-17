package com.tentacraft.items;

import com.tentacraft.Ref;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemSquidNet extends Item 
{

	public ItemSquidNet(String unlocalizedName, String registryName)
	{
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Ref.MODID, registryName));
	}
	
}
