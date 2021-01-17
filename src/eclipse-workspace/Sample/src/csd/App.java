/*--------------------------------------------------------------------------------------------------------------------	
	Yerel değişkenler ve parametre değişkenleri stack alanında yaratılır. Yerel değişkenin ömrü akış bakımından 
	bildirildiği yerde yaratılır, bildirildiği bloğun sonunda yok edilir. Parametre değişkenleri akış bakımından 
	metot çağrısında yaratılır, metot çağrısı bittiğinde yok edilir
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		{
			//...
			int a; //Akış buradayken stack'de yaratıldı
			int b; //Akış buradayken stack'de yaratıldı
			
			//...
		} // a ve b yok edildi
		
		
		Sample.foo(20, 56); //Parametre değişkenleri yaratıldı ve metot çağrısı bittiğinde yok edildi
		
		//...
		
		Sample.foo(20, 56); //Parametre değişkenleri yaratıldı ve metot çağrısı bittiğinde yok edildi
	}
}

class Sample {
	public static void foo(int a, int b)
	{
		//...
	}
}

