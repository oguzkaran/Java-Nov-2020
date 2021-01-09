/*--------------------------------------------------------------------------------------------------------------------
	Bilindiği gibi Java'da byte ve short türden sabit yoktur. Ancak "sınırlar içerisinde kalan int türden 
	bir sabit" byte/short türüne atanabilir
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		short a;
		byte b;
		
		a = 45;
		b = 67;
		
		a = 40000; //error
		b = -156; //error
		
		a = 10L; //error
		b = 20L; //error
	}
}