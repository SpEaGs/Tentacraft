package com.tentacraft.items;

import com.tentacraft.Ref;
import com.tentacraft.Tentacraft;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterItems
{
	
	public static final ItemSquidNet ItemSquidNet = new ItemSquidNet(); 
	public static final String ItemSquidNetName = "ItemSquidNet";
	
	public static final ItemSquidNetFull ItemSquidNetFull = new ItemSquidNetFull();
	public static final String ItemSquidNetFullName = "ItemSquidNetFull";
	
	public static final ItemTentacle ItemTentacle = new ItemTentacle(3, 0.2f, false);
	public static final String ItemTentacleName = "ItemTentacle";
	
	public static final ItemCalamari ItemCalamari = new ItemCalamari(6, 0.7f, false);
	public static final String ItemCalamariName = "ItemCalamari";
	
	public static void RegisterAll()
	{
		registerItem(ItemSquidNet, ItemSquidNetName);
		registerItem(ItemSquidNetFull, ItemSquidNetFullName);
		registerItem(ItemTentacle, ItemTentacleName);
		registerItem(ItemCalamari, ItemCalamariName);
	}
	
	public static void registerItem(Item item, String name)
	{
		item.setRegistryName(name);
		item.setUnlocalizedName(name);
		item.setCreativeTab(Tentacraft.items);
		GameRegistry.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Ref.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Tentacraft.log().info("Registered: " + name);
		
	}
	
}
