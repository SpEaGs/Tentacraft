package com.tentacraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GlowCalamariBlock extends BlockBase
{

	public GlowCalamariBlock(String name, Material material)
	{
		super(name, material);
		setLightLevel(0.5f);
		setHardness(0.6f);
		setSoundType(SoundType.SLIME);
		setResistance(2.0f);
	}
	
}