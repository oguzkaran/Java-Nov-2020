/*--------------------------------------------------------------------------------------------------------------------		
	Sınıf Çalışması: Parametresi ile aldığı bir yazının palindrom olup olmadığını test eden isPalindrome isimli
	metodu yazınız ve test ediniz.
	
	Palindrom: Yalnızca alfabetik karakterler tersten okuduğunda aynı olan yazılara denir. Yani alfabetik dışı
	karakterler yok sayılır
	Örnek: 
	Ey edip Adana'da pide ye ->eyedipadanadapideye
	Ali Papila -> alipapila
	Anastas mum satsana -> anastasmumsatsana	
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		PalindromTest.run();
	}
}

class PalindromTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.println(StringUtil.isPalindrome(s) ? "Palindrom" : "Palindrom değil");
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
		
	}
}

class StringUtil {
	public static boolean isPalindrome(String s)
	{
		
	}
}
