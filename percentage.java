package com.class_concept;

public class percentage 
{
	public static void main(String[] args) 
	{
		Student student1=new Student();
		int s1=12,s2=10,s3=14,s4=15,s5=20;
		int total=student.caltotal(int s1,int s2,int s3,int s4,int s5);
		System.out.println(student.calpercentage(total));
	}
}
class student
{
	public int caltotal(int s1,int s2,int s3,int s4,int s5)
	{
		int total=s1+s2+s3+s4+s5;
		return total;
	}
	public double calpercentage(int obtained)
	{
		double max=150;
		double percentage=obtained/max*100;
		return percentage;
	}
}
