package com.tentacraft.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSquidChest extends BlockContainer
{
	
	public BlockSquidChest()
	{
		super(Material.WOOD);
	}
	
	@Override
	public Item getItemDropped(IBlockState blockState, Random rand, int fortune)
	{
		return Item.getItemFromBlock(this);
	}
	
//	@Override
//	public boolean onBlockActivated(World world,
//									BlockPos pos,
//									IBlockState blockState,
//									EntityPlayer player,
//									EnumFacing side,
//									float hitX,
//									float hitY,
//									float hitZ)
//	{
//		if(!world.isRemote)
//		{
//			player.openGui();
//		}
//		return true;
//	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return null;
	}
}
