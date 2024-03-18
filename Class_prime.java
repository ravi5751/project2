
package com.class_concept;

public class Class_prime 
{
	public static void main(String[] args)
	{
			prime p=new prime();
			int num=8;
			int result=p.forloop(num);
			p.ifcondition(result);
	}
}
class prime
{
	public int forloop(int n)
	{
		int x,count=0;
		for(x=2;x<=n/2;x++);
		{
			if(n%x==0)
				count++;
		}
		return count;
	}
	public void ifcondition(int temp) 
	{
		if (temp==0)
			System.out.println("PRIME");
		else
			System.out.println("not prime");
	}
}