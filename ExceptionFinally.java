package com.CoreJava;

public class ExceptionFinally 
{
	String a="10";
	int b=Integer.parseInt(a);

	public static void main(String s[]) 
	{
		
		try
		{
			int length=s[0].length()+s[1].length();
			if(length<10)
			
				return;
				System.out.println("Name length should be less than 20 in total");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Two command line arguments required");
		}
		finally
		{
			System.out.println("Thank You");
		}

	}

}
