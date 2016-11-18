package com.tentacraft.items;

import com.tentacraft.Ref;
import com.tentacraft.Tentacraft;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSquidNet extends Item 
{

	public ItemSquidNet()
	{
		maxStackSize = 1;
	}
	@Override
	public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer Player, EntityLivingBase Target, EnumHand Hand) {
		if(Target!=null &&Target instanceof EntitySquid){
			if(!Target.worldObj.isRemote){
				Target.setDead();
				int slot = Player.inventory.currentItem;
				Player.inventory.setInventorySlotContents(slot, new ItemStack(RegisterItems.ItemSquidNetFull,1));
				return true;
			}
		}
		return false;
	}
	
	
	
}