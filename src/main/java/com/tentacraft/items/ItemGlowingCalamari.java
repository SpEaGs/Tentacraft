package com.tentacraft.items;

import com.tentacraft.Utils;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemGlowingCalamari extends ItemFood
{

	public int result()
	{
		return Utils.random(0, 100);
	}
	
	public ItemGlowingCalamari(int healAmount, float saturationModifier, boolean wolvesFav)
	{
		super(healAmount, saturationModifier, wolvesFav);
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
	{
		if(!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 10, 10, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 10, 10, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 10, 10, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 10, 10, true, true));
		}
	}
	
}
