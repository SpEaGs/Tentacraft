package com.tentacraft.handlers;

import java.util.ArrayList;
import java.util.List;

import com.tentacraft.blocks.containers.SquidChest;
import com.tentacraft.blocks.decor.BiolumBlock;
import com.tentacraft.blocks.decor.CalamariBlock;
import com.tentacraft.blocks.decor.GlowCalamariBlock;
import com.tentacraft.blocks.decor.GlowTentacleBlock;
import com.tentacraft.blocks.decor.MonoBlock;
import com.tentacraft.blocks.decor.TentacleBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
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
	
	//Containers
	public static final BlockContainer SQUID_CHEST = new SquidChest("squid_chest", Material.WOOD);
	
}
