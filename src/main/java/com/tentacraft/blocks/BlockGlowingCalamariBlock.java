package com.tentacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockGlowingCalamariBlock extends Block
{

	public BlockGlowingCalamariBlock()
	{
		super(Material.WOOD);
		this.setLightLevel(0.5f);
		this.setHardness(0.6f);
	}
	
}