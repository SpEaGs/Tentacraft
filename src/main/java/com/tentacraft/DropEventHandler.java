package com.tentacraft;

import com.tentacraft.items.RegisterItems;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class DropEventHandler 
{
	@SubscribeEvent
	public void addDrops(LivingDropsEvent e)
	{
		addSquidDrops(e, RegisterItems.ItemTentacle);
	}
	
	public void addSquidDrops(LivingDropsEvent e, Item item)
	{
		if(e.getEntityLiving() instanceof EntitySquid)
		{
			e.getDrops().add(new EntityItem(e.getEntityLiving().worldObj, e.getEntityLiving().posX, e.getEntityLiving().posY,
											e.getEntityLiving().posZ, new ItemStack(item)));
		}
	}

}
