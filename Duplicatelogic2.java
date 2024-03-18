package com.practice;

public class Duplicatelogic2 
{
	public static void main(String[] args) 
	{	
		int a[]=new int [] {1,4,2,3,2,1,4,5};
		boolean b[]=new boolean[a.length];
		for(int x=0; x<a.length;x++)
		{
			int count=1;
			{
				for(int y=x+1; y<a.length;y++)
				{
					if(a[x]==a[y])
					{
						count++;
						b[y]=true;
					}
				}
				if(count==1)//count==1  unique values
					System.out.println(a[x]);
			}
		}
	}
}
