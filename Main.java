package com.class_concept;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Student2 student=new Student2(10);
		
	}
}
class Student2
{
	int n;//instance variable
	public Student2(int number)//local variable
	{
		n=number;// local instances
	}
	public void print()
	{
		System.out.println(n);
	}
}