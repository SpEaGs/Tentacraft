package com.tentacraft.items;

import com.tentacraft.Tentacraft;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSquidNetFull extends Item
{

	public ItemSquidNetFull()
	{
		maxStackSize = 1;
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand,
									  EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		Entity squid = new EntitySquid(world);
		double posX = pos.getX(); double posY = pos.getY(); double posZ = pos.getZ();
		squid.posX = posX; squid.posY = posY; squid.posZ = posZ;
		world.spawnEntityInWorld(squid);
		Tentacraft.log().info(squid.toString());
		if(!world.isRemote)
		{
			int slot = player.inventory.currentItem;
			player.inventory.setInventorySlotContents(slot, new ItemStack(RegisterItems.ItemSquidNet,1));
			return EnumActionResult.SUCCESS;
		}
		return EnumActionResult.SUCCESS;
	}
	
}