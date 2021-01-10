/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı bir sayının Armstrong sayısı olup olmadığını test eden isArmstrong
	metodunu NumberUtil sınıfı içerisinde yazınız ve test ediniz. 
	
	Açıklamalar:
	- Kuvvet alma işlemi için Math sınıfının pow metodunu kullanmayınız
	
	- Bir sayının her basamağının basamak sayıncı kuvvetleri alınıp toplandığında sonuç sayının kendisine eşitse, bu 
	sayı bir Armstrong sayısıdır
	Örneğin: 153 -> 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
	
	- Sayı negatif ise false döndürebilirsiniz
	
	- Test işlemini 1, 2, 3, 4, 5, 6 ve 7 basamaklı Armstrong sayılarını ekrana yazdırarak yapabilirsiniz
	
	Örnekte Math.pow metodunun += operatörü ile kullanımına ve countDigits metoduna dikkat ediniz
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		IsArmstrongTest.run();
	}
}


class IsArmstrongTest {
	public static void run()
	{
		for (int n = -100; n <= 9999999; ++n)
			if (NumberUtil.isArmstrong(n))
				System.out.println(n);
	}
}

class NumberUtil {
	public static boolean isArmstrong(int val)
	{
		if (val < 0)
			return false;
		
		return getDigitstPowSum(val) == val;	
	}
	
	public static int getDigitstPowSum(int val)
	{
		int n = countDigits(val);		
		int sum = 0;
		
		while (val != 0) {
			sum += Math.pow(val % 10, n);
			val /= 10;
		}
		
		return sum;				
	}
	
	public static int countDigits(long val)
	{
		if (val == 0)
			return 1;
		
		return (int)Math.log10(Math.abs(val)) + 1;
	}	
	
}