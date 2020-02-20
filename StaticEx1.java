package com.CoreJava;

public class StaticEx1
{
	static
	{
		System.out.println("Static Block");
	}
		
	public StaticEx1()
	{
		System.out.println("This is Constructor");
	}
	
	public static String s1="Static Variable";
	
	static
	{
		System.out.println("This is second static block and "+s1);
	}
	

	public static void main(String[] args) 
	{
		StaticEx1 st=new StaticEx1();
		st.staticMethod2();	
	}
	
	static
	{
		staticMethod();
		System.out.println("This is third static block");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static method");
	}
	
	public static void staticMethod2()
	{
		System.out.println("This is static method 2");
	}

}
