package com.tentacraft;

import scala.concurrent.forkjoin.ThreadLocalRandom;

public class Utils
{
	
	public static int random(int min, int max)
	{
		return ThreadLocalRandom.current().nextInt(min, max+1);
	}

}