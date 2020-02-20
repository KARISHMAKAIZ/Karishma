package com.CoreJava;


class TwoStrings 
{
	static void print(String s1,String s2)
	{
		System.out.println(s1);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{}
			System.out.println(s2);
		
	}
}

class PrintStringsThread implements Runnable
{
	Thread td;
	String str1,str2;
	PrintStringsThread(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
		td= new Thread(this);
		td.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
		
	}
}
public class TestThread
{

	public static void main(String[] args) 
	{
		new PrintStringsThread("Hello","There");
		new PrintStringsThread("How","Are You");
		new PrintStringsThread("Thank You","Very Much");
		

	}

}
