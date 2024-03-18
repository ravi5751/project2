package Constructors;

public class Parameterized_constructor 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(20,"Kiran");  
		Student s2 = new Student(21,"kumar");  
		s1.display();//calling method to display the values of object
		s2.display();
	}
}
class Student
{  
	int id;
	String name;
	Student(int i,String n)//creating a parameterized constructor  
	{  
		id = i;
		name = n;
	}  
	public void display()//method to display the values  
	{
		System.out.println(id+" "+name);
	}
}
