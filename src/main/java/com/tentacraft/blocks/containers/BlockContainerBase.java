package com.tentacraft.blocks.containers;

import com.tentacraft.Tentacraft;
import com.tentacraft.handlers.IHasModel;
import com.tentacraft.handlers.ModBlocks;
import com.tentacraft.handlers.ModItems;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockContainerBase extends BlockContainer implements IHasModel
{

	public BlockContainerBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Tentacraft.itemTab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}

	public boolean onBlockActivated(World world, BlockPos pos,
									IBlockState blockState,
									EntityPlayer player, EnumFacing side,
									float hitX, float hitY, float hitZ)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
