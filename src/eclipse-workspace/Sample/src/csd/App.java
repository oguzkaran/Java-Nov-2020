/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının tersini döndüren reversed isimli metodu
	yazınız ve test ediniz.
	
	123 -> 3 -> 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		SumDigitsTest.run();				
	}
}

class SumDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {
			int sum = NumberUtil.sumDigits(val);
			
			System.out.printf("%d sayısının basamakları toplamı:%d%n", val, sum);
			System.out.print("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının basamakları toplamı:%d%n", NumberUtil.sumDigits(0));
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class NumberUtil {
	public static int sumDigits(int val)
	{		
		int sum = 0;		
		
		while (val > 0) {
			sum += val % 10;
			val /= 10;			
		}
		
		return Math.abs(sum);
	}
}

