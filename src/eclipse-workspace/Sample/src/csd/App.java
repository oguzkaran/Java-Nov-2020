/*--------------------------------------------------------------------------------------------------------------------
	-- operatörünün prefix kullanımında ürettiği değer (işleme giren değer) azaltılMAmış değerdir
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args) 
	{	
		int a = 10;
		int b;
		
		b = a--;
		
		System.out.printf("a=%d%n", a); //a=9
		System.out.printf("b=%d%n", b); //b=10
	}
}