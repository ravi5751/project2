package patterns_models;

public class Number_changing_half_triangle
{
	public static void main(String[] args) 
	{
		int n=6; int num=1;
		int i,j;
		
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++) 
            {
            	System.out.print(num + " ");
            	num++;
            }
            System.out.println();
        }
    }
}	
