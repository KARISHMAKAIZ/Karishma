package com.CoreJava;

public class ThreadLowPriority
{

	public static void main(String[] args)
	{
		MyThread1 t1= new MyThread1(1);
		MyThread1 t2=new MyThread1(2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);

	}

}

class MyThread1 extends Thread
{
	int id;
	MyThread1(int id)
	{
		this.id=id;
		start();
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("My id is:"+id);
		}
	}
}