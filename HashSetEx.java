package com.CoreJava;
import java.util.*;
public class HashSetEx
{

	public static void main(String[] args)
	
	{
		TreeSet t=new TreeSet();
		t.add(30);
		//t.add(null);
		t.add(10);
		t.add(40);
		t.add(30);
		System.out.println(t);
		Set hs= new HashSet();
		hs.add("Sandeep");
		hs.add("Tilaka");
		hs.add("Deepak");
		hs.add("Elan");
		hs.add("Chithra");
		hs.add("Tilaka");
		hs.add("Elan");
		System.out.println(hs);
		

	}

}
