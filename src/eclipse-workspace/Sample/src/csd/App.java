/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden sayıdan büyük ilk Fibonacci sayısını döndüren getNextFibonacciNumber
	metodunu yazınız ve test ediniz
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		GetNextFibonacciTest.run();
	}
}

class GetNextFibonacciTest {
	public static void run()
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int val = Integer.parseInt(kb.nextLine());
			
			if (val <= -999)
				return;
			
			System.out.printf("%d sayısından sonraki ilk Fibonnacci sayısı:%d%n", val, NumberUtil.getNextFibonacciNumber(val));
		}
		
	}
}

class NumberUtil {
	public static int getNextFibonacciNumber(int val)
	{
		
	}	
}


