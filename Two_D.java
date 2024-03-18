package com.practice;

public class Two_D 
{
	public static void main(String[] args) 
	{
		//int[][]a=new int[][] {{1,2,3},{4,5,6}};
		/*
		for(int i=0; i<a.length;i++)
		{	int []arr=a[i];
			for(int j=0; j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}*/
		
		        int[][] twoDArray;

		        // Initialize a 2D array with specific dimensions (3 rows, 4 columns)
		        twoDArray = new int[3][4];

		        // Assign values to elements in the 2D array
		        twoDArray[0][0] = 1;
		        twoDArray[0][1] = 2;
		        twoDArray[0][2] = 3;
		        twoDArray[0][3] = 4;
		        twoDArray[1][0] = 5;
		        twoDArray[1][1] = 6;
		        twoDArray[1][2] = 7;
		        twoDArray[1][3] = 8;
		        twoDArray[2][0] = 9;
		        twoDArray[2][1] = 10;
		        twoDArray[2][2] = 11;
		        twoDArray[2][3] = 12;
		        
		        // Access and print elements of the 2D array
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 4; j++) {
		                System.out.print(twoDArray[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

