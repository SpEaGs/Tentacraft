package com.tentacraft.Handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler
{
	
	public static enum Example implements IStringSerializable 
	{
		EX1("empty", 0),
		EX2("full", 1);
		
		private int ID;
		private String name;
		
		private Example(String name, int ID)
		{
			this.ID = ID;
			this.name = name;
		}
		
		@Override
		public String getName()
		{
			return this.name;
		}
		
		public int getID()
		{
			return ID;
		}
		
		@Override
		public String toString()
		{
			return getName();
		}
	}

}
