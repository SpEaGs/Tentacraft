package com.tentacraft.tileEntities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

public class TE_SquidChest extends TileEntity implements IInventory
{
	
	private ItemStack[] inv;
	private String customName;
	
	public TE_SquidChest()
	{
		this.inv = new ItemStack[this.getSizeInventory()];
	}
	
	public String getCustomName()
	{
		return this.customName;
	}
	
	public void setCustomName(String name)
	{
		this.customName = name;
	}
	
	@Override
	public String getName()
	{
		return this.hasCustomName() ? this.customName : "container.TE_SquidChest";
	}
	
	@Override
	public boolean hasCustomName()
	{
		return this.customName != null && !this.customName.equals("");
	}
	
	@Override
	public ITextComponent getDisplayName()
	{
		return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName());
	}

	@Override
	public int getSizeInventory()
	{
		return 54;
	}

	@Override
	public boolean func_191420_l()
	{
		return false;
	}

	@Override
	public ItemStack getStackInSlot(int index)
	{
		if(index<0 || index >= this.getSizeInventory())
		{
			return null;
		}
		return this.inv[index];
	}

	@Override
	public ItemStack decrStackSize(int index, int count)
	{
		if(this.getStackInSlot(index) != null)
		{
			ItemStack itemstack;
			//TODO IMPORTANT!!!: func_190916_E() = get stack size and func_190920_e() = set stack size (both will change in future)*
			if(this.getStackInSlot(index).func_190916_E() <= count)
			{
				itemstack = this.getStackInSlot(index);
				this.markDirty();
				return itemstack;
			}
			else
			{
				itemstack = this.getStackInSlot(index).splitStack(count);
				//TODO *Ditto
				if(this.getStackInSlot(index).func_190916_E() <= 0)
				{
					this.setInventorySlotContents(index, null);
				}
				else
				{
					this.setInventorySlotContents(index, this.getStackInSlot(index));
				}
				this.markDirty();
				return itemstack;
			}
		}
		else
		{
			return null;
		}
	}

	@Override
	public ItemStack removeStackFromSlot(int index)
	{
		ItemStack stack = this.getStackInSlot(index);
		this.setInventorySlotContents(index, null);
		return stack;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack)
	{
		if(index < 0 || index >= this.getSizeInventory())
		{
			return;
		}
		
		if(stack !=null && stack.func_190916_E() > this.getInventoryStackLimit())
		{
			//TODO *Ditto
			stack.func_190920_e(this.getInventoryStackLimit());
		}
		
		if(stack != null && stack.func_190916_E() == 0)
		{
			stack = null;
		}
		this.inv[index] = stack;
		this.markDirty();
		
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 256;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player)
	{
		return this.worldObj.getTileEntity(this.getPos()) == this && player.getDistanceSq(this.pos.add(0.5, 0.5, 0.5)) <= 16;
	}

	@Override
	public void openInventory(EntityPlayer player)
	{
		
	}

	@Override
	public void closeInventory(EntityPlayer player)
	{
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack)
	{
		return true;
	}

	@Override
	public int getField(int id)
	{
		return 0;
	}

	@Override
	public void setField(int id, int value)
	{
		
	}

	@Override
	public int getFieldCount()
	{
		return 0;
	}

	@Override
	public void clear()
	{
		for(int i=0; i<this.getSizeInventory(); i++)
		{
			this.setInventorySlotContents(i, null);
		}
	}
	
//	@Override
//	public void writeToNBT(NBTTagCompound nbt)
//	{
//		super.writeToNBT(nbt);
//		NBTTagList list = new NBTTagList();
//		for(int i=0; i<this.getSizeInventory(); ++i)
//		{
//			if(this.getStackInSlot(i) != null)
//			{
//				NBTTagCompound stackTag = new NBTTagCompound();
//				stackTag.setByte("Slot", ((byte)i));
//				this.getStackInSlot(i).writeToNBT(stackTag);
//				list.appendTag(stackTag);
//			}
//		}
//		nbt.setTag("Items", list);
//		if(this.hasCustomName())
//		{
//			nbt.setString("CustomName", this.getCustomName());
//		}
//	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("Items", 10);
		for(int i=0; i<list.tagCount(); ++i)
		{
			NBTTagCompound stackTag = list.getCompoundTagAt(i);
			int slot = stackTag.getByte("Slot") & 255;
//			ItemStack.setInventorySlotContents(slot, ItemStack(stackTag));
		}
	}
	
//	@Override
//	public void ItemStack(NBTTagCompound tag)
//	{
//		super.ItemStack(tag);
//	}
	
}
