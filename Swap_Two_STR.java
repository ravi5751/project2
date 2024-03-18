package com.base;

public class Swap_Two_STR 
{
	public static void main(String[] args) 
	{
		//swap two strings 
		String a="hello";
		String b="all";
		
		a=a+b;//helloall
	
		b=a.substring(0, a.length()-b.length());//hello
		
		a=a.substring(b.length());//all
		
		System.out.println(a+"  "+b);
	}
}
