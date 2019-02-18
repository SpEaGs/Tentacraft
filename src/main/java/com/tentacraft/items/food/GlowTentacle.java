package com.tentacraft.items.food;

import com.tentacraft.Utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class GlowTentacle extends FoodBase
{
	
	public GlowTentacle(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(name, amount, saturation, isWolfFood);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		if(!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 160, 10, true, true));
			if(Utils.random(0,  10)<=1)
			{
				player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 10, true, true));
			}
		}
	}
	
}
