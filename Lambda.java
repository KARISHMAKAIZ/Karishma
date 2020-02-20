package com.CoreJava;
interface MyFunctionalInterface
{
	public String sayHello(String s);
}
public class Lambda 
{

	public static void main(String[] args) 
	{
		//lambda Expression
		MyFunctionalInterface msg=(s)->{
			return s;
		};
		System.out.println(msg.sayHello("Karishma"));

	}

}
