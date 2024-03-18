package com.base;

public class Primechecker 
{
	    
		    // Method to check if a number is prime or not
		    public static boolean isPrime(int number) 
		    {
		        // Handling edge cases
		        if (number <= 1)
		        {
		            return false;
		        }
		        
		        // Checking from 2 to the square root of the number
		        for (int i = 2; i <= Math.sqrt(number); i++)
		        	
		        {
		            if (number % i == 0)
		            {
		                return false; // Not a prime number
		            }
		        }
		        return true; // Prime number
		    }
		    
		    public static void main(String[] args) 
		    {
		        int num = 11; // Change this number to check for different numbers
		        if (isPrime(num))
		        {
		            System.out.println(num + " is a prime number.");
		        } 
		        else 
		        {
		            System.out.println(num + " is not a prime number.");
		        }
		    }		
	}

