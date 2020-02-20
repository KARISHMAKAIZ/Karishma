package com.CoreJava;
import java.util.*;

public class HashMapEx 
{

	public static void main(String[] args)
	{
		HashMap hm=new HashMap();
		hm.put("oop", "Object Oriented Programming ");
		hm.put("object", "has state and behaviour ");
		hm.put("class", "Defines state and behaviour share by obj ");
		System.out.println(hm);
		
		Set s= hm.entrySet();
		
		System.out.println();
		System.out.println("\nhashmap current size:"+hm.size());
		System.out.println("Elements of Hashmap");
		System.out.println();
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object o=itr.next();
			System.out.println(o);
		}
		
		TreeMap tm=new TreeMap();
		tm.put("xava is", "oop");
		tm.put("java is", "simple");
		tm.put("zava is", "robust");
		tm.put("mava is", "temporary");
		System.out.println();
		System.out.println(tm);
		System.out.println("\n Elements of treemap by iteration");
		System.out.println();
		
		Set s1=tm.entrySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
			Object ob1=itr1.next();
			//both key and value
			System.out.println(""+ob1);
			//only for keys
			System.out.println(me.getValue());
			
		}
		
		System.out.println("\n treemap current size:"+tm.size());
		tm.putAll(hm);
		System.out.println("\nputting a map into invoke map result will sort");
		System.out.println("\n"+tm);
		System.out.println(tm.remove("ram is")+":i am removed value");
		System.out.println("\ntreemap current size:"+tm.size());
		System.out.println("\nChecking specific key/values status:"+tm.containsKey("java is")+""+tm.containsValue("temporary"));
		System.out.println("retrieve value by key:"+hm.get("oop"));
		
		Collection c =tm.values();
		System.out.println("\nValues of my treeMap:"+c);
		System.out.println("\nKeys of TreeMap:"+tm.keySet());
		
		
		

	}

}
