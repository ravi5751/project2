package com.practice;

public class Sorting_logical 
{
	public static void main(String[] args)   
	{  
		 //define original array     
        int [] a = new int [] {52,45,32,64,12,87,78,98,23,7};     
        int temp = 0;    
        //Sort the array in ascending order using two for loops    
        for (int i = 0; i <a.length-1; i++) 
        {     
          for (int j = i+1; j <a.length; j++)  
          {     
              if(a[i] > a[j]) 
              {//swap elements if not in order
                 temp = a[i];    
                 a[i] = a[j];    
                 a[j] = temp;    
               }
            }     
        }    
        for (int i = 0; i <a.length; i++) 
        {     
            System.out.print(a[i]+" ");    
        }    
    }    
}
