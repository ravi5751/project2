package patterns_models;

public class Square_hollow_pattern {
	public static void main(String[] args) {
		int n=8;
		int i,j;
		for (i = 0; i < n; i++)
		{
           for (j = 0; j < n; j++) 
           {
             if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
             {
                System.out.print("*");
             }
             else
             {
                System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
}
