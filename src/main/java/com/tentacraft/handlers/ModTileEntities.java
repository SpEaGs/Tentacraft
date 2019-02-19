package com.tentacraft.handlers;

import java.util.ArrayList;
import java.util.List;

import com.tentacraft.Ref;
import com.tentacraft.tileEntities.TE_SquidChest;

import net.minecraft.tileentity.TileEntity;

public class ModTileEntities
{

	public static final List<Class> TILE_ENTITIES = new ArrayList<Class>();
	
	//containers
	public static final Class SQUID_CHEST = TE_SquidChest.class;
	
}
