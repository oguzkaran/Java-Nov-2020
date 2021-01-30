/*--------------------------------------------------------------------------------------------------------------------		
	ctor çağrılmadan önce non-static veri elemanlarına default değerler atanmış olur
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Sample s1 = new Sample(10);
		Sample s2 = new Sample();
		Sample s3 = new Sample(34);
		
		//...						
	}
}

class Sample {
	public int x;
	public boolean y;
	
	public Sample()
	{
		System.out.println("Sample()");
		System.out.printf("x = %d%n", x);
		System.out.printf("b = %b%n", y);
	}	
	
	public Sample(double a)
	{
		System.out.println("Sample(double)");
		System.out.printf("x = %d%n", x);
		System.out.printf("b = %b%n", y);
	}
	
	public Sample(int a)
	{
		System.out.println("Sample(int)");
		System.out.printf("x = %d%n", x);
		System.out.printf("b = %b%n", y);
	}
	
}
