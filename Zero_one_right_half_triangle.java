package patterns_models;

public class Zero_one_right_half_triangle 
{
	public static void main(String[] args) 
	{
		int n=6;
		int i,j;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++)
            {
            	if ((i + j) % 2 == 0)
            	{
                    System.out.print(1 + " ");
                }
                else
                {
                    System.out.print(0 + " ");
                }
            }
			System.out.println();
        }
    }
		
}


