package com.codinghub.pakckage2;

public class Prime_range 
{
	public static void main(String[] args) 
	{
		int start=1,end=100;
		for(int i=start; i<=end; i++)
	      {
	         int count = 0;
	         for(int j=2; j<i; j++)
	         {
	            if(i%j==0)
	            {
	               count++;
	               break;
	            }
	         }
	         if(count==0)
	            System.out.println(i);
	      }
	}
}
