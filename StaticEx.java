package com.CoreJava;

public class StaticEx 
{
		 static int a;
		
		void display()
		{
			a++;
			System.out.println(a);
		}

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			StaticEx st=new StaticEx();
			st.display();
		}

	}

}
