package com.practice;
import java.util.Arrays;
public class Binary_search 
{
	public static void main(String[] args) 
	{
		int[]a= {50,90,70,80,100,20,30,60,};
		Arrays.sort(a);
		int f=0, l=a.length-1, m=f+l/2, search=80;
		//int count=0;
		while(f<l)
		{
			//count++;
			m=(f+l)/2;
			if(search==a[m])
			{
				System.out.println("element found");
				break;
			}
			else if(search>a[m])
			{
				l=m-1;
			}
			else if(search<a[m])
			{
				l=m+1;
			}
		}
		if(f>l)
		{
			System.out.println("element not found");
		}
		//System.out.println("no.of iteration"+count);
		//System.out.println("no of elements"+a.length);
	}
}
