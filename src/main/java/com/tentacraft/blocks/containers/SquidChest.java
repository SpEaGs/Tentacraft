package com.tentacraft.blocks.containers;

import java.util.Random;

import com.tentacraft.Ref;
import com.tentacraft.Tentacraft;
import com.tentacraft.handlers.IHasModel;
import com.tentacraft.tileEntities.TE_SquidChest;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SquidChest extends BlockContainerBase implements IHasModel, ITileEntityProvider
{
	
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public SquidChest(String name, Material material)
	{
		super(name, material);
		
		this.setHardness(0.8f);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	@Override
	public Item getItemDropped(IBlockState blockState, Random rand, int fortune)
	{
		return Item.getItemFromBlock(this);
	}
	
	@Override
	public ItemStack getItem(World world, BlockPos pos, IBlockState blockState)
	{
		return new ItemStack(Item.getItemFromBlock(this));
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState blockState,
									EntityPlayer player, EnumHand hand, EnumFacing side,
									float hitX, float hitY, float hitZ)
	{
		if(!world.isRemote)
		{
			player.openGui(Tentacraft.instance, Ref.GUI_SQUID_CHEST, world, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}
	
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState blockState)
	{
		if(!world.isRemote)
		{
			IBlockState north = world.getBlockState(pos.north());
			IBlockState south = world.getBlockState(pos.south());
			IBlockState east = world.getBlockState(pos.east());
			IBlockState west = world.getBlockState(pos.west());
			EnumFacing face = (EnumFacing)blockState.getValue(FACING);
			
			if(face == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.SOUTH;
			else if(face == EnumFacing.SOUTH && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.NORTH;
			else if(face == EnumFacing.WEST && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.EAST;
			else if(face == EnumFacing.EAST && north.isFullBlock() && !south.isFullBlock()) face = EnumFacing.WEST;
			world.setBlockState(pos, blockState.withProperty(FACING, face), 2);
		}
	}
	
	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState blockState)
	{
		TE_SquidChest tileEntity = (TE_SquidChest)world.getTileEntity(pos);
		InventoryHelper.dropInventoryItems(world, pos, tileEntity);
		super.breakBlock(world, pos, blockState);
	}
	
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState blockState, EntityLivingBase placer, ItemStack stack)
	{
		if(stack.hasDisplayName())
		{
			TileEntity tileEntity = world.getTileEntity(pos);
			
			if(tileEntity instanceof TE_SquidChest)
			{
				((TE_SquidChest)tileEntity).setCustomName(stack.getDisplayName());
			}
		}
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state)
	{
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta)
	{
		return new TE_SquidChest();
	}
	
//	@Override
//	public IBlockState getStateForPlacement(World world, BlockPos pos, int meta,
//											EnumFacing facing, EnumHand hand
//											float hitX, float hitY, float hitZ,
//											EntityLivingBase placer)
//	{
//		return this.getDefaultState().withProperty(FACING, placer);
//	}
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState blockState)
	{
		return EnumBlockRenderType.MODEL;
	}
	
	@Override
	public IBlockState withRotation(IBlockState blockState, Rotation rot)
	{
		return blockState.withProperty(FACING, rot.rotate((EnumFacing)blockState.getValue(FACING)));
	}
	
	@Override
	public IBlockState withMirror(IBlockState blockState, Mirror mirror)
	{
		return blockState.withRotation(mirror.toRotation((EnumFacing)blockState.getValue(FACING)));
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {FACING});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing facing = EnumFacing.getFront(meta);
		if(facing.getAxis() == EnumFacing.Axis.Y) facing = EnumFacing.NORTH;
		return this.getDefaultState().withProperty(FACING, facing);
	}
	
	@Override
	public int getMetaFromState(IBlockState blockState)
	{
		return ((EnumFacing)blockState.getValue(FACING)).getIndex();
	}
	
	@Override
	public boolean isFullBlock(IBlockState blockState)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState blockState)
	{
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
}