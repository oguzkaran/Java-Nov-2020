/*--------------------------------------------------------------------------------------------------------------------	
	 Sınıfın non-static bir metodu içerisinde içerisinde aynı sınıfın static veri elemanlarına doğrudan erişilebilir 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		Sample s, k;
		
		s = new Sample();
		k = new Sample();
		
		s.foo(20);
		System.out.printf("Sample.x = %d%n", Sample.x);
		
		k.foo(10);		
		System.out.printf("Sample.x = %d%n", Sample.x);		
	}
}

class Sample {
	public static int x;
	
	public void foo(int a)
	{
		x = a;
	}
	
}