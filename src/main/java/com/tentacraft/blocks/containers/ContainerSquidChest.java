package com.tentacraft.blocks.containers;

import com.tentacraft.tileEntities.TE_SquidChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerSquidChest extends Container
{

	private final int numRows;
	private final TE_SquidChest chestInv;
	
	public ContainerSquidChest(InventoryPlayer playerInv, TE_SquidChest TESquidChest, EntityPlayer player)
	{
		this.chestInv = TESquidChest;
		this.numRows = TESquidChest.getSizeInventory() / 9;
		TESquidChest.openInventory(player);
		
		for(int i = 0; i < this.numRows; ++i)
		{
			for(int j = 0; j < 9; ++j)
			{
				this.addSlotToContainer(new Slot(TESquidChest, j + i*9, 8 + j*18, 18 + i*18));
			}
		}
		
		for(int y = 0; y < 3; y++)
		{
			for(int x=0; x < 9; x++)
			{
				this.addSlotToContainer(new Slot(playerInv, x + y*9 + 9, 8 + x*18, 175 + y*18));
			}
		}
		
		for(int z = 0; z < 9; z++)
		{
			this.addSlotToContainer(new Slot(playerInv, z, 8 + z*18, 233));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player)
	{
		return this.chestInv.isUsableByPlayer(player);
	}
	
	@Override
	public void onContainerClosed(EntityPlayer player)
	{
		super.onContainerClosed(player);
		chestInv.closeInventory(player);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int index)
	{
		ItemStack stack = ItemStack.EMPTY;
		Slot slot = this.inventorySlots.get(index);
		
		if(slot != null && slot.getHasStack())
		{
			ItemStack stack1 = slot.getStack();
			stack = stack1.copy();
			
			if(index < this.numRows * 9)
			{
				if(!this.mergeItemStack(stack1, this.numRows * 9, this.inventorySlots.size(), true))
				{
					return ItemStack.EMPTY;
				}
			}
			else if(!this.mergeItemStack(stack1, 0, this.numRows * 9, false))
			{
				return ItemStack.EMPTY;
			}
			
			if(stack1.isEmpty())
			{
				slot.putStack(ItemStack.EMPTY);
			}
			else
			{
				slot.onSlotChanged();
			}
		}
		
		return stack;
	}
	
	public TE_SquidChest getChestInventory()
	{
		return this.chestInv;
	}
}
