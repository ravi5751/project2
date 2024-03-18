package com.practice;

public class Example 
{
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6,7,8};
	        int n = arr.length;
	        
	        // Divide the array into two equal halves
	        int mid = n / 2;
	        
	        // Copy the first half of the array into B array in reverse order
	        int[] B = new int[mid];
	        for (int i = 0; i < mid; i++)
	        {
	            B[i] = arr[mid - i - 1];
	        }
	       

	        // Print the whole array
	       System.out.println("Original Array:");
	        for (int num : arr) {
	           System.out.print(num + " ");
	        }
	       
	        
	        // Print the reversed first half of the array (B array)
	        System.out.println("Reversed First Half of the Array (B array):");
	        for (int num : B) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}




