package com.CoreJava;
import java.util.*;

public class StackEx 
{

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		
		s.push("Karishma");
		s.push("Susan");
		s.push("Elena");
		s.push("Dawny");
		s.push("Akhil");
		
		System.out.println("stack elements:"+s);
		System.out.println("First Element:"+s.peek());
		System.out.println("stack elements:"+s);
		System.out.println("Popping out:"+s.pop());
		System.out.println("stack elements:"+s);
		s.push("Java");
		System.out.println("stack elements after adding:"+s);
		System.out.println("Popping out:"+s.pop());
		System.out.println("stack elements:"+s);
		System.out.println("First element:"+s.peek());
		
		
		Enumeration e=s.elements();
		System.out.println("stack elements are:");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
	}

}
