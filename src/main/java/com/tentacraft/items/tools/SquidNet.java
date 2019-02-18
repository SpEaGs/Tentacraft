package com.tentacraft.items.tools;

import com.tentacraft.Handlers.ModItems;
import com.tentacraft.items.ItemBase;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class SquidNet extends ItemBase
{

	public SquidNet(String name)
	{
		super(name);
		maxStackSize = 1;
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer Player, EntityLivingBase Target, EnumHand Hand) {
		if(Target!=null &&Target instanceof EntitySquid){
			if(!Target.world.isRemote){
				Target.setDead();
				int slot = Player.inventory.currentItem;
				Player.inventory.setInventorySlotContents(slot, new ItemStack(ModItems.SQUID_NET_FULL,1));
				return true;
			}
		}
		return false;
	}
	
	
	
}