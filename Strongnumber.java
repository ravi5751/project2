package com.base;

public class Strongnumber 
{
	 public static void main(String[] args) {

	      //declare an int variable and initialize a number as value
	      int input = 145;

	      //declare a variable for iteration
	      int i;

	      //declare variables for factorial value and the extracted digits
	      int factorial,digit;

	      //declare a variable to store the sum value
	      int sum = 0;

	      //transfer the input value to a temporary variable
	      int temp = input ;

	      //start looping for calculating the result
	      while(temp != 0) 
	      {
	         i = 1;
	         factorial = 1;

	         //extracting the digit
	         digit = temp % 10;

	         //get the factorial of the digit
	         while(i <= digit) 
	         {
	            factorial = factorial * i;
	            i++;
	         }

	         //store the sum value
	         sum = sum + factorial;	

	         //removing the digit one by one
	         temp = temp / 10;
	      }

	      //check condition
	      if(sum == input )
	         //if sum value is equal to input number
	         System.out.println(input  + " is a strong number");
	      else
	         //if sum value is not equal to input number
	         System.out.println(input  + " is not a strong number");
	   }   

}
