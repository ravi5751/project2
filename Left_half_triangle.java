package patterns_models;

public class Left_half_triangle {
	public static void main(String[] args)
	{
		int n=6;
		int i,j;
		for (i = n; i >= 1; i--) 
		{	 
			for (j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (j = 0; j <= n - i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
