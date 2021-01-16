/*--------------------------------------------------------------------------------------------------------------------	
	
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		short a = 10;
		float b = 30;
		
		Sample.foo(a, b);
	}
}

class Sample {
	public static void foo() // #1
	{
		System.out.println("Sample, foo");	
	}
	
	public static void foo(int a) //#2
	{
		System.out.println("Sample, foo, int");
	}		
	
	public static void foo(long a, int b) //#3
	{
		System.out.println("Sample, foo, double, int");
	}
	
	public static void foo(int a, long b) //#4
	{
		System.out.println("Sample, foo, int, long");
	}
	
	public static void foo(int a, float b) //#5
	{
		System.out.println("Sample, foo, int, float");
	}
	
	public static void bar(int a) //#6
	{
		System.out.println("Sample, bar, int");
	}
}

