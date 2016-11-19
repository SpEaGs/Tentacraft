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
		
		
		
		if(!world.isRemote)
		{
			Entity squid = new EntitySquid(world);
			BlockPos pos2 = pos.offset(facing);
			squid.setPositionAndRotation(pos.getX(), pos.getY()+1, pos.getZ(), player.cameraYaw, player.cameraPitch);
			world.spawnEntityInWorld(squid);
			Tentacraft.log().info(squid.toString());
			int slot = player.inventory.currentItem;
			player.inventory.setInventorySlotContents(slot, new ItemStack(RegisterItems.ItemSquidNet,1));
			return EnumActionResult.SUCCESS;
		}
		return EnumActionResult.FAIL;
	}
	
}