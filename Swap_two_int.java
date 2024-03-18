package com.base;

public class Swap_two_int 
{
	public static void main(String[] args) 
	{
		int x=5;
		int y=10;
		
		//1.y=10 and x=5
		//int t;
		//t=x;
		//x=y;
		//y=t;
		
		//x=x+y;//15    
		//y=x-y;//5      
		//x=x-y;//10      
		
		//3.x=x*y;50
		//y=x/y;5
		//x=x/y;10
		
		//4.using xor:^
		x=x^y;//15--->1111
		y=x^y;//10--->1010
		x=x^y;//5---->0101
		
		System.out.println("x="+x+"\n"+"y="+y);
	}

}
