package com.codinghub.pakckage2;
public class example1 
{
	public static void main(String[] args) 
	{
		int num, start=1, end=1000, i, sum;
	        for(num=start; num<=end; num++)//1/2to1000.
		    {sum=0;//1/2to1000.
	         for(i=1; i<num; i++)//1to999.
	         {
	            if(num%i==0)//
	               sum = sum+i;
	         }
	         if(sum==num)
	            System.out.print(num+ " ");
	      }
	   }
}


