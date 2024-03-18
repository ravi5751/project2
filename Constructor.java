package com.class_concept;
import java.util.Scanner;
public class Constructor 
{
	public static void main(String[] args) 
	{
		Student1 student=new Student1();
		student.display();
	}
}
class Student1
{
	String name;
	int roll;
	Scanner sc=new Scanner(System.in);
	Student1()
	{
		System.out.println("my value are");
		name="ram";
		roll=12;
	}
}
