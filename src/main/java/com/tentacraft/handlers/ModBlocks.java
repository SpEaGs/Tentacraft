package com.tentacraft.Handlers;

import java.util.ArrayList;
import java.util.List;

import com.tentacraft.blocks.BiolumBlock;
import com.tentacraft.blocks.CalamariBlock;
import com.tentacraft.blocks.GlowCalamariBlock;
import com.tentacraft.blocks.GlowTentacleBlock;
import com.tentacraft.blocks.MonoBlock;
import com.tentacraft.blocks.TentacleBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block TENTACLE_BLOCK = new TentacleBlock("tentacle_block", Material.WOOD);
	public static final Block CALAMARI_BLOCK = new CalamariBlock("calamari_block", Material.WOOD);
	public static final Block GLOW_TENTACLE_BLOCK = new GlowTentacleBlock("glow_tentacle_block", Material.WOOD);
	public static final Block GLOW_CALAMARI_BLOCK = new GlowCalamariBlock("glow_calamari_block", Material.WOOD);
	public static final Block MONO_BLOCK = new MonoBlock("mono_block", Material.ROCK);
	public static final Block BIOLUM_BLOCK = new BiolumBlock("biolum_block", Material.ROCK);
	
}
