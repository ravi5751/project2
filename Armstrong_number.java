package com.base;

public class Armstrong_number 
{
	public static void main(String[] args) 
	{
		/*int n=153, temp, digits=0, last=0, sum=0;   
		//assigning n into a temp variable  
		temp=n;
		//loop execute until the condition becomes false  
		while(temp>0)
		{   
		temp = temp/10;  
		digits++;   
		}
		temp = n;   
		while(temp>0)   
		{   
		//determines the last digit from the number      
		last = temp % 10; //3 /5/ 1
		//calculates the power of a number up to digit times and add the resultant to the sum variable  
		sum += (Math.pow(last, digits));   
		//removes the last digit   
		temp = temp/10;
		}
		//compares the sum with n  
		if(n==sum)
		{
			
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not");
		}
	}
}*/
		int cube=0;
		int num=153;
		int rev,temp;
		temp=num;
		
		while(num!=0)
		{
			rev=num%10;
			
			num=num/10;
			
			cube=cube+(rev*rev*rev);	
		}
		if(temp==cube)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not");
		}
	}
}
