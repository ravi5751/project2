package com.base;

public class Palindrome 
{
	public static void main(String[] args) 
	{
	  
		int rem,sum=0,temp;    
		int n=454;//It is the number variable to be checked for palindrome
		temp=n;    
		while(n>0)
		{    
			rem=n%10;  //getting remainder  4/5/4
			sum=(sum*10)+rem;    
			n=n/10; //454//45/4/0  
		}    
		if(temp==sum) 
		{
			System.out.println("palindrome number");  
		}
		else
		{
			System.out.println("not palindrome");    
		} 	
	}
}
