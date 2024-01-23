package patterns_models;

public class hollow_square {
	public static void main(String[] args) {
		for(int r=4;r>=1;r--)//1<=4//2<+=4//3<=4//4<=4.
		{
		for( int c=1;c<=4;c++)
		{
			if((r==2 && c==2) || (r==3 && c==3))
			{
				System.out.print(" $ ");
			}
			else
				System.out.print(" * ");
			}
				System.out.println();
		}
	}
}


