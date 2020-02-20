public class Demo5
{
	public static void main(String[] args)
	{
		String a="Susan";
		int mark1=70,mark2=80,mark3=90;
		int total=mark1+mark2+mark3;
		float avg=(mark1+mark2+mark3)/3;
		System.out.println("The total mark is:"+total);
		System.out.println("The average mark is:"+avg);
		if(avg>60)
		System.out.println("First Class");
		if(avg<60 && avg>40)
		System.out.println("Second Class");
		if(avg<40 && avg>30)
		System.out.println("Pass Class");
		if(avg<30)
		System.out.println("Fail");
				
	}


}