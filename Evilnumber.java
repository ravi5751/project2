package com.base;

public class Evilnumber 
{
	public static void main(String[] args) 
	{
		 //declare a variable which store the static input
	      int no =15;
	      
	      //declare other variables for calculations
	      long binaryOfInputNumber = 0;
	      int temp= no;
	      int reminder = 0;
	      int i = 1;
	      
	      //binary conversion
	      while(temp != 0)
	      {
	         //find the unit place number
	         reminder = temp % 2;
	         binaryOfInputNumber+= reminder * i;	         
	         temp = temp / 2;
	         i = i * 10;
	      }
	      
	      // for counting the number of 1's we declare a variable
	      int count = 0;
	      
	      //take a loop with a condition till the value is zero
	      while(binaryOfInputNumber != 0){
	      
	         // check whether the unit place consisting 1 or not
	         if(binaryOfInputNumber % 10 == 1)
	         
	         //increment the count value
	         count++;
	         
	         // after counting removing the unit place in each iteration
	         binaryOfInputNumber = binaryOfInputNumber / 10;
	      }
	      // condition for checking the count value is even or odd
	      // If even then the number is an evil number otherwise not
	      if(count % 2 == 0)
	      
	         //return true if satisfied
	         System.out.println(no + " is an evil number");
	      
	         //return false if not satisfied
	      else
	         System.out.println(no + " is not an evil number");
	   }
	}


