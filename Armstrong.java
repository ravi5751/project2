package com.class_concept;

import java.util.Scanner;
public class Armstrong
{
	
	public class ArmstrongChecker {
	    private int number;

	    public ArmstrongChecker(int number) {
	        this.number = number;
	    }

	    // Method to check if the number is an Armstrong number
	    public boolean isArmstrong() {
	        int originalNumber = number;
	        int numberOfDigits = String.valueOf(number).length();
	        int sum = 0;

	        while (originalNumber > 0) {
	            int digit = originalNumber % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            originalNumber /= 10;
	        }

	        return sum == number;
	    }

	    // Static method to check if a given number is an Armstrong number
	    public static boolean isArmstrong(int number) {
	        Armstrong checker = new Armstrong();
	       return ((ArmstrongChecker) checker).isArmstrong();
	    }

	    public static void main(String[] args) {
	        int testNumber = 153;
	        System.out.println("Is " + testNumber + " an Armstrong number? " + isArmstrong(testNumber));

	        testNumber = 123;
	        System.out.println("Is " + testNumber + " an Armstrong number? " + isArmstrong(testNumber));
	    }
	}


}
	

	

