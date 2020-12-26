/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak toplamını döndüren sumDigits metodunu
	NumberUtil isimli bir sınıf içerisinde yazınız ve klavyeden girilen değerlerle çağırarak test ediniz. Metot 
	negatif için de basamakları toplamını pozitif olarak döndürecektir	 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		CountDigitsTest.run();				
	}
}


class CountDigitsTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:");
		int val;
		
		while ((val = Integer.parseInt(kb.nextLine())) != 0) {
			int count = NumberUtil.countDigits(val);
			
			System.out.printf("%d sayısının basamak sayısı:%d%n", val, count);
			System.out.print("Bir sayı giriniz:");
		}
		
		System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.countDigits(0));
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}

class NumberUtil {
	public static int countDigits(int val)
	{
		if (val == 0)
			return 1;
		
		int count = 0;
		
		while (val != 0) {
			++count;
			val /= 10;			
		}
		
		return count;
	}
}

