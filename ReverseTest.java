package labexercise;

import java.util.Scanner;

/* 7.	Reversing a Number
Write a program to read a positive number as input and to get the reverse of
 the given number and return it as output.
Include a class UserMainCode with a static method reverseNumber which accepts 
a positive integer .
The return type is an integer value which is the reverse of the given number.
 Create a Main class which gets the input as a integer and call the
  static method reverseNumber present in the UserMainCode
Input and Output Format:*/

class UserMainCode
{
	
	public static int reverseNumber(int a)
	{
		int num, reverse=0;
		num=a;
		while(num>0)
		{
			int digit=num % 10;
			reverse=reverse*10+ digit ;
			num/=10;	
		}
		return reverse;
			
	}
}
public class ReverseTest
{

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the number to be reversed:");
		Scanner scn=new Scanner(System.in);
		n=scn.nextInt();
		int rev=UserMainCode.reverseNumber(n);
		System.out.println("The reverse of the given number is: "+rev);
		
	}

}
