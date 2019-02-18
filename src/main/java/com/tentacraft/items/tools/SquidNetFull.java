package com.tentacraft.items.tools;

import com.tentacraft.Handlers.ModItems;
import com.tentacraft.items.ItemBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SquidNetFull extends ItemBase
{

	public SquidNetFull(String name)
	{
		super(name);
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
			squid.setPositionAndRotation(pos2.getX()+0.5, pos2.getY(), pos2.getZ()+0.5, player.cameraYaw, player.cameraPitch);
			squid.setPositionAndRotation(pos.getX(), pos.getY()+1, pos.getZ(), player.cameraYaw, player.cameraPitch);
			world.spawnEntity(squid);
			int slot = player.inventory.currentItem;
			player.inventory.setInventorySlotContents(slot, new ItemStack(ModItems.SQUID_NET,1));
			return EnumActionResult.SUCCESS;
		}
		return EnumActionResult.FAIL;
	}
	
}