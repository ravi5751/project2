package patterns_models;

public class Triangle_pattern {
	public static void main(String[] args) {
		int n=4;
		int i,j;
		for (i = 0; i < n; i++) {
			for (j = n - i; j > 1; j--) 
			{
                System.out.print(" ");
            }
 
            for (j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
 
            System.out.println();
        }
    }	
}
