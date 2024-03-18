package com.exception;

public class Example 
{
	 public static void main(String[] args) throws InterruptedException 
	 {          
         System.out.println("hello");
         try
         {
        	 Thread.sleep(1000);
        	 System.out.println(args);
        	 System.out.println(10/0);
         }
         catch(InterruptedException e)
         {
        	 System.out.println(e.getMessage());
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
         System.out.println("bye");
      
	 }
}
