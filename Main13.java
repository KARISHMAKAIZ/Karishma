package labexercise;
/*
13.	Removing vowels from String
Given a method with string input. Write code to remove vowels from even position in 
the string.
Include a class UserMainCode with a static method removeEvenVowels which accepts a
string as input.
The return type of the output is string after removing all the vowels. 
Create a Main class which gets string as an input and call the static 
method removeEvenVowels present in the UserMainCode. */

import java.util.Scanner;

class UserMainCode2
{
	public static String removeEvenVowels(String s1)
	{
		String s=s1;
		
		
		for(int i=0;i<s.length();i++)
		{
				boolean x=false;
				char vow=s.charAt(i);	
				
					if(i%2!=0 ||(vow == 'a' || vow== 'e' || vow == 'i' || vow == 'o' || vow == 'u'))
					{
					
					x=true;
					}
				    if(x==true)
					{
				    	s=removeChar(s,i);
				    	
					}
					
		}
		return s;
	}
	public static String removeChar(String s,int i)
	{
		
		String a= s.substring(0,i)+s.substring(i+1);
		
		return a;
	}

}
public class Main13 
{

	public static void main(String[] args) 
	{
		String n;
		System.out.println("Enter the String");
		Scanner scn=new Scanner(System.in);
		n=scn.next();
		String  a=UserMainCode2.removeEvenVowels(n);
		System.out.println(a);

	}

}
