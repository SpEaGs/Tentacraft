package com.tentacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBioluminescentBlock extends Block
{

	public BlockBioluminescentBlock()
	{
		super(Material.ROCK);
		this.setLightLevel(1.0f);
		this.setHardness(0.8f);
	}
	
}