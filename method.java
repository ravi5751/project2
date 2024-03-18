package com.class_concept;
import java.util.Scanner;
public class method
{
	public static void main(String[] args) 
	{
		method obj=new method();
		int factor_count=obj.factors(3,1,0);
		System.out.println(factor_count);
		if(factor_count==2)
	 	{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
		}
		int factors(int num,int start,int count)
		{
			for(start=1;start<=num;start++)
			{
				if(num%start==0)
				{
					count++;
				}
			}
			return count;
		}
	}

