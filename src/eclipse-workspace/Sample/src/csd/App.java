/*--------------------------------------------------------------------------------------------------------------------		
	 Derleyici özdeş String atomları (string literals) için aynı adresi verecek kodu üretir. Aşağıdaki örnekte 
	 adres karşılaştırması yapılmıştır. Adresler aynı olduğu için "Aynı yazı" yazısı ekrana basılır. Anımsanacağı
	 gibi örneğin yazılar klavyeden alınırsa farklı nesnelerin elde edildiğinden yazılar aynı bile "Farklı yazılar"
	 yazısı ekrana basılır 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		String s1 = "ankara";
		String s2 = "ankara";
		
		if (s1 == s2) //Dikkat adres karşılaştırması
			System.out.println("Aynı yazı");
		else
			System.out.println("Farklı yazılar");		
	}
}
