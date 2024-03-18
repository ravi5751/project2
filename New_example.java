package Constructors;

public class New_example 
{
	public static void main(String[] args) 
	{
		product product=new product();
		
	}
}
class product
{
	product()
	{
		this(20,30);
		System.out.println("im in defoult constructor");
	}
	product(char c)
	{
		System.out.println("im in single are constructor");
	}
	product(int a,int b)
	{
		this('x');
		System.out.println("im in parameterized constructor");
	}
}
	

 
