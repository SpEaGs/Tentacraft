package com.tentacraft.tileEntities;

import com.tentacraft.Ref;
import com.tentacraft.blocks.containers.ContainerSquidChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
public class TE_SquidChest extends TileEntityLockableLoot implements IInventory
{
	
	private NonNullList<ItemStack> inv;
	public int numPlayersUsing, ticksSinceSync;
	private String customName;
	
	public TE_SquidChest()
	{
		this.inv = NonNullList.<ItemStack>withSize(getSizeInventory(), ItemStack.EMPTY);
	}

	@Override
	public int getSizeInventory()
	{
		return 54;
	}

	@Override
	public int getInventoryStackLimit()
	{
		return 256;
	}

	@Override
	public boolean isEmpty()
	{
		for(ItemStack stack : this.inv)
		{
			if(!stack.isEmpty()) return false;
		}
		return true;
	}
	
	@Override
	public String getName()
	{
		return this.hasCustomName() ? this.customName : "container.TE_SquidChest";
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
	public boolean hasCustomName()
	{
		return this.customName != null && !this.customName.isEmpty();
	}
	
	@Override
	public ITextComponent getDisplayName()
	{
		return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName());
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		
		if(!this.checkLootAndWrite(nbt)) ItemStackHelper.saveAllItems(nbt, inv);
		if(nbt.hasKey("CustomName", 8)) nbt.setString("CustomName", this.customName);
		
		return nbt;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		this.inv = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		
		if(!this.checkLootAndRead(nbt)) ItemStackHelper.loadAllItems(nbt,  inv);
		if(nbt.hasKey("CustomName", 8)) this.customName = nbt.getString("CustomName");
	}
	
	@Override
	public Container createContainer(InventoryPlayer playerInv, EntityPlayer player)
	{
		return new ContainerSquidChest(playerInv, this, player);
	}
	
	@Override
	public String getGuiID()
	{
		return Ref.MODID + ":squid_chest";
	}

	@Override
	protected NonNullList<ItemStack> getItems()
	{
		return this.inv;
	}

	@Override
	public void openInventory(EntityPlayer player)
	{
		++this.numPlayersUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayersUsing);
		this.world.notifyNeighborsOfStateChange(pos, this.getBlockType(), false);
	}

	@Override
	public void closeInventory(EntityPlayer player)
	{
		--this.numPlayersUsing;
		this.world.addBlockEvent(pos, this.getBlockType(), 1, this.numPlayersUsing);
		this.world.notifyNeighborsOfStateChange(pos, this.getBlockType(), false);
	}
	
}
