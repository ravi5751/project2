package com.practice;

public class OddindexofAinBarray 
{
	    public static void main(String[] args) 
	    {
	        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        
	        // Count the number of odd-indexed elements
	        int oddCount = A.length / 2;
	        if (A.length % 2 != 0) 
	        {
	            oddCount++;
	        }
	        // Create array B to store odd-indexed elements
	        int[] B = new int[oddCount];        
	        // Copy odd-indexed elements from A to B
	        for (int i = 1, j = 0; i < A.length; i += 2, j++) 
	        {
	            B[j] = A[i];
	        }
	        // Print array B
	        System.out.println("Elements at odd indices in array B:");
	        for (int num : B) 
	        {
	            System.out.print(num + " ");
	        }
	    }
	}
