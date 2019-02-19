package com.tentacraft.blocks.decor;

import com.tentacraft.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MonoBlock extends BlockBase
{

	public MonoBlock(String name, Material material)
	{
		super(name, material);
		setHardness(0.8f);
	}
	
}