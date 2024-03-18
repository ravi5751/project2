package com.practice;

public class Linear_search 
{
	public static void main(String[] args) 
	{
		 int[] a= {10,20,30,50,70,90};
		 int search=50;
		 boolean flag=false;
		  for(int i=0;i<a.length;i++)
		  {   
			if(a[i]==search)
			{
				System.out.println(search+" "+" element is found");
				flag=true;
				break;
			}
		  }
		  if(flag==false)
		  {  
		  System.out.println("element is not found");
		  }
	}
} 
	
