package com.codinghub.pakckage2;

public class String_character_sort 
{
	public static void main(String[] args)
	{
		String s1=new String("HELLO ALL GOOD MORINING");
		char[] arr=s1.tocharArray();
		int x,xy;
		char temp;
		for(x=0;x<arr.length;x++)
		{
			for(y=x+1;y<arr.length;y++)
				if(arr[x]<arr[y])
				{
					temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
					
				}
		}
}
	for(char)
