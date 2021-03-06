package com.tentacraft.handlers;

import com.tentacraft.Utils;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropEventHandler 
{
	
	@SubscribeEvent
	public void addDrops(LivingDropsEvent e)
	{
		addSquidDrops(e, ModItems.TENTACLE, Utils.random(0, 3));
		addSquidDrops(e, ModItems.GLOW_TENTACLE, Utils.perChance(10));
	}
	
	public void addSquidDrops(LivingDropsEvent e, Item item, int i)
	{
		if(e.getEntityLiving() instanceof EntitySquid)
		{
			e.getDrops().add(new EntityItem(e.getEntityLiving().world, e.getEntityLiving().posX, e.getEntityLiving().posY,
											e.getEntityLiving().posZ, new ItemStack(item, i)));
		}
	}

}