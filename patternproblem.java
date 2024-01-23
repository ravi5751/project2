package com.patterns;

public class patternproblem {
public static void main(String[] args){
	  	int x,y;
	  	for(x=1;x<=6;x++)//outer loop
	    {
	      for(y=1;y<=6;y++)//inner loop
	      {
	        if(x==1)
	          System.out.print(" * ");
	        else if(x==2)
	        {
	          if(y==1||y==2||y==6)
	            System.out.print(" * ");
	          else
	            System.out.print("   ");
	        }
	        else if(x==3)
	        {
	          if(y==1||y==3||y==6)
	            System.out.print(" * ");
	          else
	            System.out.print("   ");
	        }
	        else if(x==4)
	        {
	          if(y==1||y==4||y==6)
	            System.out.print(" * ");
	          else
	            System.out.print("   ");            
	        }
	        else if(x==5)
	        {
	          if(y==1||y==5||y==6)
	            System.out.print(" * ");
	          else
	            System.out.print("   ");
	        }
	        else if(x==6)
	        {
	          if(y==1||y==6||y==6)
	            System.out.print(" * ");
	          else
	            System.out.print("   ");
	        }
	        else
	        System.out.print(" * ");
	      	}
	      System.out.println();
	    }

	  }

	}
