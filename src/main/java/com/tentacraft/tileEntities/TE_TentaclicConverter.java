package com.tentacraft.tileEntities;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyProvider;
import cofh.api.energy.IEnergyReceiver;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TE_TentaclicConverter extends InventoryBasic implements IEnergyReceiver, IEnergyProvider{
	private EnergyStorage internalstorage;
	
	public TE_TentaclicConverter(){
	
		super("Tentalitic Converter",true, 1);
		internalstorage = new EnergyStorage(10000, 25000, 25000);
	}

	@Override
	public int getEnergyStored(EnumFacing from) {
		// TODO Auto-generated method stub
		return internalstorage.getEnergyStored();
	}

	@Override
	public int getMaxEnergyStored(EnumFacing from) {
		// TODO Auto-generated method stub
		return internalstorage.getMaxEnergyStored();
	}

	@Override
	public boolean canConnectEnergy(EnumFacing from) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int extractEnergy(EnumFacing from, int maxExtract, boolean simulate) {
		// TODO Auto-generated method stub
		return internalstorage.extractEnergy(maxExtract, simulate);
	}

	@Override
	public int receiveEnergy(EnumFacing from, int maxReceive, boolean simulate) {
		// TODO Auto-generated method stub
		return internalstorage.receiveEnergy(maxReceive, simulate);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}
}