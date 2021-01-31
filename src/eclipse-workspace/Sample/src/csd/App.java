/*--------------------------------------------------------------------------------------------------------------------		
	 Sınıf Çalışması: Klavyeden bir kullanıcı adı ve şifre isteyen basit bir ATM uygulamasının bir parçası olan
	 aşağıda açıklanan programı yazınız:
	 Açıklamalar:
	 - Kullanıcı ve şifre 3(üç) kez denenebilecektir
	 - Denemeler sırasında doğru giriş yapılırsa "Giriş başarılı", 3 kez denemede de yanlış olursa 
	 "Giriş başarısız. Artık deneme hakkınız bitti" mesajı verilecektir
	 - Kullanıcı adı ve şifrenin doğruluğu program içerisinde belirlenen bir kullanıcı adı ve şifre ile yapılacaktır
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		TrimTest.run();	
	}
}

class TrimTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;			
			
			System.out.printf("[%s]%n", s.trim());			
			System.out.printf("[%s]%n", s);
		}	
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
	
}

