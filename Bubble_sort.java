package com.practice;

public class Bubble_sort
{
	public static void main(String[] args) 
	{
		 int arr[] ={3,60,35,2,45,300,5};  	  
	        int temp = 0;  
	        for(int i=0; i < arr.length; i++)
	        {
	        	 for(int j=1; j < (arr.length-i); j++)
	        	 { //System.out.println(j);
	        		 if(arr[j-1] > arr[j])
	        		 {
                         //swap elements  
                         temp = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
	        		 }
	        	 }     
	        }
	        for(int i=0; i < arr.length; i++)
	        {  
                System.out.print(arr[i] + " ");  
	        }		
		}
}


