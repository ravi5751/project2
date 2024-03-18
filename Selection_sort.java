package com.practice;

public class Selection_sort 
{
	public static void main(String[] args) 
	{
		int [] a = new int [] {80, 10, 5, 70, 30, 60, 40, 50};
		int min=0;
		for(int x = 0; x<a.length-1; x++)
		{
			min=x;
			for(int y=x+1; y<a.length; y++)
			{
				if(a[min]>a[y])
				{
					min=y;
				}
			}
			int temp = a[min];
			a[min]=a[x];
			a[x]=temp;
		}
		for(int x:a)
		{
			System.out.println(x);
		}
	}
}
