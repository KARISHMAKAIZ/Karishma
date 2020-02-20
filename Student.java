package com.CoreJava;

import java.util.Scanner;

public class Student 
{

	
	public static void main(String[] args)
	{
		String name;
		int total=0;
		int mark[]=new int[5];
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		name=scn.next();
		
		for(int i=0;i<mark.length;i++)
		{
			System.out.print("Enter the marks in subject"+(i+1)+"=");
			mark[i]=scn.nextInt();
			total+=mark[i];
		}
	
		
		System.out.println("Name of the student:"+name);
		for(int i=0;i<mark.length;i++)
			System.out.println("Mark"+(i+1)+"="+mark[i]);
		System.out.println("Total marks obtained:"+total);

	}


}
