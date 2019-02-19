package com.tentacraft.blocks.machines;

import com.tentacraft.tileEntities.TE_SquidChest;
import com.tentacraft.tileEntities.TE_TentalyticConverter;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTentalyticConverter extends BlockContainer{

	public BlockTentalyticConverter( ) {
		super(Material.ROCK);
		
	}
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	


	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TE_TentalyticConverter();
	}
	

}
