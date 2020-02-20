package com.CoreJava;


class A2
{
	int x,y;
	int get(int p,int q)
	{
		x=p;
		y=q;
		return 0;
	}
	void show()
	{
		System.out.println(x);
	}
}
public class Inherit extends A2
{

	public static void main(String[] args)
	{
		Inherit b=new Inherit();
		b.get(10,30);
		b.show();
		

	}

	void show()
	{	super.show();
		System.out.println(y);
	}
}
