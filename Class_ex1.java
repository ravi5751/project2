package com.class_concept;

import java.util.Scanner;

public class Class_ex1 
{
	public static void main(String[] args) 
	{
		B b1;//reference variable
		b1=new B();//way 1//object
		b1.countryIndia();//method call
		b1.countryIndia();// many times call a implementation
		b1.countryAustralia();
		b1.countryRussia();
		
	}
}
class B//blue print
{
	public void countryIndia()//method implementation
	{
		System.out.println("INDIA");
	}
	public void countryAustralia()
	{
		System.out.println("AUSTRALIA");
	}
	public void countryRussia()
	{
		System.out.println("RUSSIA");
	}
}