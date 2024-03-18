package com.class_concept;

public class Return_type 
{
	public static void main(String[] args)
	{
		Return_type demo=new Return_type();
		int y=demo.m1();
		System.out.println(y);
		String x=demo.m2();
		System.out.println(x);
		float f=demo.m3();
		System.out.println(f);
		double d=demo.m4();
		System.out.println(d);
		long l=demo.m5();
		System.out.println(l); 
		Byte b=demo.m6();
		System.out.println(b);
		Boolean B=demo.m7();
		System.out.println(B);
		
	}
	public int m1()
	{
		return 11;
	}
	public String m2()
	{
		return "good evening";
	}
	public float m3()
	{
		return 11223;
	}
	public double m4()
	{
		return 10.10;
	}
	public long m5()
	{
		return 456789;
	}
	public Byte m6()
	{
	return 12;
	}
	public Boolean m7()
	{
		return true;
	}
}
