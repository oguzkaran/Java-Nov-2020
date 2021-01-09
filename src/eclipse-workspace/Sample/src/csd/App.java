/*--------------------------------------------------------------------------------------------------------------------
	 implicit olarak yapılabilen dönüşümler explicit olarak da yapılabilir. Aşağıdaki örnekte bu yapılmıştır ancak
	 anlamı yoktur 	 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		int a = 10;
		long b;
		
		b = (long)a;
		
		System.out.printf("b = %d%n", b);		
	}
}