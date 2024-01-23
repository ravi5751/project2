package com.patterns;

public class palindrometrainglepattern {
	public static void main(String[] args) 
	{
		 int rows=6,columns=6;
		 int i=rows,j=columns;
	        // outer loop to handle number of rows
	        for (i = 1; i <= rows; i++)
	        {
	            // inner loop to print the spaces
	            for (j = 1; j <= 2 * (columns - i); j++)
	            {
	                System.out.print("  ");
	            }
	 
	            // inner loop to print the first part
	            for (j = i; j >= 1; j--) {
	                System.out.print(" *  ");
	            }
	 
	            // inner loop to print the second part
	            for (j = 2; j <= i; j++) {
	                System.out.print(" *  ");
	            }
	 
	            // printing new line for each row
	            System.out.println();
	        }
		}
}

