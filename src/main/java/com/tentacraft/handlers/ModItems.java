package com.tentacraft.handlers;

import java.util.ArrayList;
import java.util.List;

import com.tentacraft.items.food.Calamari;
import com.tentacraft.items.food.GlowCalamari;
import com.tentacraft.items.food.GlowTentacle;
import com.tentacraft.items.food.Tentacle;
import com.tentacraft.items.misc.BiolumDust;
import com.tentacraft.items.misc.MonoInk;
import com.tentacraft.items.tools.SquidNet;
import com.tentacraft.items.tools.SquidNetFull;

import net.minecraft.item.Item;

public class ModItems
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item MONO_INK = new MonoInk("mono_ink");
	public static final Item BIOLUM_DUST = new BiolumDust("biolum_dust");
	public static final Item SQUID_NET = new SquidNet("squid_net");
	public static final Item SQUID_NET_FULL = new SquidNetFull("squid_net_full");
	
	//Food
	public static final Item TENTACLE = new Tentacle("tentacle", 3, 0.2f, false);
	public static final Item CALAMARI = new Calamari("calamari", 6, 0.7f, false);
	public static final Item GLOW_TENTACLE = new GlowTentacle("glow_tentacle", 3, 0.2f, false);
	public static final Item GLOW_CALAMARI = new GlowCalamari("glow_calamari", 6, 0.7f, false);
	
}
