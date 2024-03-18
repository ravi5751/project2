package com.practice;

public class Singleloopsort
{
	public static void main(String[] args) 
	{
		int [] a= {3,33,1,4,8,6,5};
		for(int i=0; i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i+1];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
		for(int t:a)
		{
			System.out.println(t);
		}
	}
}
