package com.class_concept;

import java.util.Scanner;
public class Palindrome_Example1 
{
	//public class PalindromeChecker {
	    
	    // Static method to check if a string is a palindrome
	    public static boolean isPalindrome(String str) 
	    {
	        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
	        int length = cleanStr.length();
	        
	        for (int i = 0; i < length / 2; i++) 
	        {
	            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) 
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args)
	    {
	        // Example usage
	        String input = "madam";
	        if (isPalindrome(input)) 
	        {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } 
	        else 
	        {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }
	    }
	}

	      