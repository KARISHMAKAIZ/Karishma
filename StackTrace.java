package com.CoreJava;

public class StackTrace
{

	public static void main(String[] args)
	{
		try
		{
			y();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void y()
	{
		z();
	}
	static void z()
	{
		int p=4/0;
	}

}
