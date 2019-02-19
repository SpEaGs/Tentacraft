package com.tentacraft.blocks.decor;

import com.tentacraft.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BiolumBlock extends BlockBase
{

	public BiolumBlock(String name, Material material)
	{
		super(name, material);
		setLightLevel(1.0f);
		setHardness(0.8f);
	}
	
}