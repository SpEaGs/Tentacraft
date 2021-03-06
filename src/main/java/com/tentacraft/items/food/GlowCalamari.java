package com.tentacraft.items.food;

import com.tentacraft.Utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class GlowCalamari extends FoodBase
{
	
	public GlowCalamari(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(name, amount, saturation, isWolfFood);
		setAlwaysEdible();
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		if(!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 160, 0, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 160, 1, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 160, 1, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 160, 0, true, true));
		}
	}
	
}
