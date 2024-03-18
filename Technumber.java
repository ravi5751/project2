package com.base;

public class Technumber 
{
	public static void main(String[] args) 
	{
		  
	      //declaring the variables
	      int Number, temp, firstno, secondno, count = 0,res = 0;
	      
	      //Declare and initialize the original input number
	      Number = 2025;
	      
	      //store the original number into a temporary variable
	      temp =  Number;

	      //find the number of digits available in input number
	      while (temp > 0) 
	      {
	         count++;
	         temp = temp / 10;
	      }
	      //check whether the number of digits is ever or not
	      //if even number of digits are present then proceed to check Tech number
	      if (count % 2 == 0) 
	      {
	         temp =  Number;
	         
	         //find the first part and store it into a variable
	         firstno = temp % (int) Math.pow(10, count / 2);
	         //find the second part and store it into a variable
	         secondno = temp / (int) Math.pow(10, count / 2);
	         //calculate the square of sum of those two parts of input number
	         res = (int) Math.pow((firstno + secondno), 2);
	         if ( Number == res)
	         {
	            
	            //if the original number is equal to calculated value
	            System.out.println( Number+" is a Tech Number.");
	         }
	         else
	         {
	            //if the original number is not equal to calculated value
	            System.out.println( Number+" is not a Tech Number.");
	         }
	      }
	      else
	      {
	         //if the input number has odd number of digits
	         System.out.println( Number+" is not a Tech Number.");
	      } 
	}  
}
	
