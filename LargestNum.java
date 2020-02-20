public class LargestNum
{
	public static void main(String[] args)
	{
		int a=100,b=300,c=500;
		if(a>b && a>c)
		 {
			System.out.println("the largest number is:"+a);
			System.out.println("The second largest is:"+(b>c?b:c));
		  }
		if(b>a && b>c)
		 {
			System.out.println("the largest number is:"+b);
			System.out.println("The second largest is:"+(a>c?a:c));	
		 
		 }
		if(c>a && c>b)
		 {
			System.out.println("the largest number is:"+c);
			System.out.println("The second largest is:"+(a>b?a:b));
		 }
	}
}