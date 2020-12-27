/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir n değeri için n-inci asal sayıyı döndüren getPrime
	isimli metodu yazınız ve test ediniz:
	Açıklamalar:
	- isPrime metosunu kullanınız
	- isPrime metodunun hızlı olan versiyonunu kullandığınız bilinciyle yazınız
	- Metot n-nin pozitif olmayan değerleri için -1 sayını döndürecektir
	- Metodu klavyeden alınan değerlerle çağırarak test ediniz 	
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		GetPrimeTest.run();
	}
}

class GetPrimeTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int n = Integer.parseInt(kb.nextLine());
			
			if (n <= 0)
				return;
			
			System.out.printf("%d. asal sayı:%d%n", n, NumberUtil.getPrime(n));
		}
		
	}
}

class NumberUtil {
	public static int getPrime(int n)
	{
		if (n <= 0)
			return -1;
		
		int count = 0;
		int val = 2;		
		
		for (;;) {
			if (isPrime(val))
				++count;
			
			if (count == n)
				return val;
			
			++val;
		}		
	}
	
	public static boolean isPrime(int val)
	{
		if (val <= 1)
			return false;
		
		if (val % 2 == 0)
			return val == 2;
		
		if (val % 3 == 0)
			return val == 3;
		
		if (val % 5 == 0)
			return val == 5;
		
		if (val % 7 == 0)
			return val == 7;
	
		
		for (int i = 11; i * i <= val; i += 2)			
			if (val % i == 0)
				return false;		
		
		return true;
		
	}
}




