/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: n pozitif bir tamsayı üzere ve a, b, c, d birbirinden farklı tamsayılar olmak üzere eğer
	n = a ^ 3 + b ^ 3 = c ^ 3 + d ^ 3 eşitliğini sağlayacak şekilde a, b, c ve d tamsayıları var ise n bir
	Hardy-Ramanujan sayısıdır.  
	
	1729 = 9 ^ 3 + 10 ^ 3 = 1 ^ 3 + 12 ^3
	Buna göre 100000'den küçün olan tüm Hardy-Ramanujan sayılarını ekrana bastıran metodu programı yazınız  
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		DisplayCollatzTest .run();
	}
}

class DisplayCollatzTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n == 0)
				break;
			
			NumberUtil.displayCollatz(n);
		}
	}
}

class NumberUtil {
	
	public static void displayCollatz(int n)
	{
		if (n <= 0) {
			System.out.println("Geçersiz değer");
			return;
		}
		
		for (;;) {
			System.out.println(n);
			
			if (n == 1)
				break;
			
			if (n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;				
		}
	}
}

