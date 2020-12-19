/*--------------------------------------------------------------------------------------------------------------------
	Derleyici yukarıdan aşağıya ve soldan sağa olmak üzere anlamlı en uzun ifadeyi alacak şekilde ayırma işlemini yapar
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b = 8;
		int c;
		
		c = a + ++b;
		
		System.out.printf("a=%d%n", a); //a=11 	
		System.out.printf("b=%d%n", b); //b=8 	
		System.out.printf("c=%d%n", c); //c=18 	
	}
}