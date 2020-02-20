package labexercise;

import java.util.Scanner;
import java.util.regex.Pattern;

/* Write a program to read a string of 10 digit number , 
 * check whether the string contains a 10 digit number in
 *  the format XXX-XXX-XXXX where 'X' is a digit.
Include a class UserMainCode with a static method validateNumber
 which accepts a string as input .
The return type of the output should be 1 if the string meets the 
above specified format . In case the number does not meet the specified format 
then return -1 as output.
Create a class Main which would get the input as a String of numbers and 
call the static methodvalidateNumber present in the UserMainCode.
Input and Output Format:*/
class UserMainCode1
{
	 public static int validateNumber(String s)
	 {
		String s1=s;
		boolean numeric=s1.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}");
		if (numeric==true && s1.length() >10)
			return 1;
		
		else
			return -1;
		 
	 }
}
public class TesterValidation
{
	public static void main(String[] args) 
	{
		String n;
		System.out.println("Enter the String in XXX-XXX-XXXX format");
		Scanner scn=new Scanner(System.in);
		n=scn.next();
		int a=UserMainCode1.validateNumber(n);
		if(a==1)
		System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}