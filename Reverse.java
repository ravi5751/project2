package com.base;

public class Reverse 
{
	public static void main(String[] args)   
	{  
	/*int number = 123, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;//3+23+
	//System.out.println(reverse);//number = 123
	//remainder = 123 % 10 = 3,2,1
		//	reverse = 0 * 10 + 3 = 0 + 3=3
			//number = 123 / 10 = 12
	number = number/10;  
	}
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
}*/
		int num =12345;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
}
