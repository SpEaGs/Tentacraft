package com.tentacraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItems {
	public static final ItemSquidNet ItemSquidNet = new ItemSquidNet; 
	public static final String ItemSquidNetName = "ItemSquidNet"; 
	
	public static void RegisterAll(){
		RegisterItem(ItemSquidNet,ItemSquidNetName);
		
	}
	public void RegisterItem(Item item, String name){
		item.setRegistryName(name);
		item.setUnlocalizedName(name);
		GameRegistry.register(item);
	}
	
}
