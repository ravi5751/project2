package Constructors;

public class Myclass 
{
	public static void main(String[] args) 
	{
		public class MyClass {
		    private int value;

		    // Constructor with no parameters
		    public MyClass() {
		        this.value = 0;
		    }

		    // Constructor with a single parameter
		    public MyClass(int value) {
		        this.value = value;
		    }

		    // Constructor with multiple parameters
		    public MyClass(int value1, int value2) {
		        this.value = value1 + value2;
		    }

		    // Getter method
		    public int getValue() {
		        return value;
		    }

		    public static void main(String[] args) {
		        MyClass obj1 = new MyClass(); // Invokes the first constructor
		        System.out.println(obj1.getValue()); // Output: 0

		        MyClass obj2 = new MyClass(5); // Invokes the second constructor
		        System.out.println(obj2.getValue()); // Output: 5

		        MyClass obj3 = new MyClass(3, 7); // Invokes the third constructor
		        System.out.println(obj3.getValue()); // Output: 10
		    }
		}

		
	}

}
