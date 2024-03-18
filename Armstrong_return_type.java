package com.base;

public class Armstrong_return_type 
{    
	    // Method to calculate the power of a number
	    public static int power(int number, int p) 
	    {
	        int result = 1;
	        for (int i = 0; i < p; i++)
	        {
	            result *= number;
	        }
	        return result;
	    }
	    
	    // Method to count the number of digits in a number
	    public static int countDigits(int number) 
	    {
	        int count = 0;
	        while (number != 0) 
	        {
	            number /= 10;
	            count++;
	        }
	        return count;
	    }
	    
	    // Method to check if a number is an Armstrong number
	    public static boolean isArmstrong(int number) 
	    {
	        int originalNumber = number;
	        int numDigits = countDigits(number);
	        int sum = 0;
	        while (number != 0) 
	        {
	            int digit = number % 10;
	            sum += power(digit, numDigits);
	            number /= 10;
	        }
	        return sum == originalNumber;
	    }
	    
	    public static void main(String[] args) 
	    {
	        int num = 153; // Change this number to check for different numbers
	        if (isArmstrong(num)) 
	        {
	            System.out.println(num + " is an Armstrong number.");
	        }
	        else
	        {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	    }
	}


