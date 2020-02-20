import java.util.Scanner;
public class LastDigit

{
	public static void main(String[] args)
	{
		int a;
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the number:");
		a=scn.nextInt();
		int b=a%10;
		String c= b.toString();
		System.out.println("The last digit is:"+b);
		


	}




}