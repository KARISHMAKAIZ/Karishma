package com.CoreJava;

import java.util.*;

public class LambdaIterator
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("Rick");
		list.add("Nick");
		list.add("Alan");
		list.add("Arya");
		list.add("Kiran");
		
		list.forEach((names)->{System.out.println(names);});

	}

}
