package com.class_concept;

public class Student_class 
{
	public static void main(String[] args) 
	{
		Student student1;//reference variable//stack memory
		student1=new Student();//heap memory
		student1.name="raju";
		student1.section='a';
		student1.s1=22;student1.s2=21;student1.s3=25;
		student1.calTotal();
		Student student2;
		student2=new Student();
		student2.name="ram";
		student2.section='b';
		student2.s1=25;student2.s2=28;student2.s3=25;
		student2.calTotal();
		Student student3;
		student3=new Student();
		student3.name="rock";
		student3.section='c';
		student3.s1=25;student3.s2=25;student3.s3=24;
		student3.calTotal();
		}
}
class Student
{
	String name;//null
	char section;
	int s1,s2,s3;
	public void calTotal() 
	{
		System.out.println(name+"  "+section);
		System.out.println(s1+s2+s3);
	}
}
			
	
