package com.tentacraft.blocks.decor;

import com.tentacraft.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TentacleBlock extends BlockBase
{

	public TentacleBlock(String name, Material material)
	{
		super(name, material);
		setHardness(0.4f);
		setSoundType(SoundType.SLIME);
		setResistance(2.0f);
	}
	
}