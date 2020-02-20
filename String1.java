package com.CoreJava;

public class String1 
{

	public static void main(String[] args) 
	{
		String s1= new String("Hello");
		String s2= new String("WorldWide");
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println(s1.concat(s2));
		System.out.println(s1.indexOf('e'));
		System.out.println(s2.length());
		System.out.println(s2.charAt(4));
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s2.replace("World", "Wide"));
		System.out.println(s1.concat(s2));
		
		StringBuffer sb= new StringBuffer("Java");
		System.out.println(sb.append("Program"));
		System.out.println(sb.capacity());
		System.out.println(sb.deleteCharAt(3));
		System.out.println("");
		}

}
