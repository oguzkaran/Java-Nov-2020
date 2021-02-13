/*----------------------------------------------------------------------------------------------------------------------
	Niteliksiz isim arama genel kuralları (else if biçiminde değerlendiriniz):
	1. Bir isim metot içerisinde kullanılmışsa, kullanıldığı yerden yukarıya doğru metot içerisinde aranır. Burada
	yerel değişken ve parametre değişken isimlerine de bakılır 
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

public class App {
	public static void main(String [] args)
	{		
		int a;	
		
		a = 10;						
	}
}


class Sample {
	public void foo()
	{
		int bar;
		
		bar = 10;	
	}
	
	
	public static void bar()
	{
		
	}
}

