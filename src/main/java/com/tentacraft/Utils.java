package com.tentacraft;

import scala.concurrent.forkjoin.ThreadLocalRandom;

public class Utils
{
	
	public static int random(int min, int max)
	{
		return ThreadLocalRandom.current().nextInt(min, max+1);
	}
	
	public static int perChance(int chance)
	{
		int i = ThreadLocalRandom.current().nextInt(0, 101);
		if(i<=chance)
		{
			return 1;
		}
		else { return 0; }
	}
	
	public static int toMJ(int RFIn)
	{
		return RFIn/8;
	}
	
	public static int toRF(int MJIn)
	{
		return MJIn*8;
	}

}