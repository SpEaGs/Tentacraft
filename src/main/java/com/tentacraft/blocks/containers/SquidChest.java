package com.tentacraft.blocks;

import java.util.Random;

import com.tentacraft.tileEntities.TE_SquidChest;

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
		this.setHardness(0.8f);
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
	public boolean isOpaqueCube(IBlockState state)
	{
		return true;
	}
	
	public int getRenderType()
	{
		return -1;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta)
	{
		return new TE_SquidChest();
	}
}