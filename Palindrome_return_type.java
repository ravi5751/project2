package com.base;

public class Palindrome_return_type 
{

		    // Method to check if a number is a palindrome
		    public static boolean isPalindrome(int number) 
		    {
		        int rev = reverseNumber(number);
		        return rev == number;
		    }
		    
		    // Method to reverse a number
		    public static int reverseNumber(int number)
		    {
		        int rev = 0;
		        while (number != 0) 
		        {
		            int digit = number % 10;
		            rev = rev * 10 + digit;
		            number /= 10;
		        }
		        return rev;
		    }
		    
		    public static void main(String[] args)
		    {
		        int num = 12321; // Change this number to check for different numbers
		        if (isPalindrome(num)) 
		        {
		            System.out.println(num + " is a palindrome.");
		        } 
		        else
		        {
		            System.out.println(num + " is not a palindrome.");
		        }
		    }
		}

