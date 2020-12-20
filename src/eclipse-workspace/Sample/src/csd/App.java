/*--------------------------------------------------------------------------------------------------------------------
	  Aşağıdaki örnekte kod tekrarı yapılmadığına yani iş yapan başka bir metodun çağrıldığına dikkat ediniz.
	  Yazılım geliştirmede kod tekrarı yapmamaya "DO NOT REPEAT YOURSELF" cümlesi kullanılır. Zorunlu olmadıkça
	  programı kod tekrarı yapmamalıdır
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int val = Integer.parseInt(kb.nextLine());
		
		Util.displayEvenStatusByFlag(NumberUtil.isEven(val));		
		Util.displayOddStatusByFlag(NumberUtil.isOdd(val));
	}
}

class NumberUtil {
	public static boolean isEven(int val)
	{
		return val % 2 == 0;
	}
	
	public static boolean isOdd(int val)
	{
		return !isEven(val);
	}
}

class Util {
	public static void displayEvenStatusByFlag(boolean flag)
	{
		if (flag)
			System.out.println("Çift sayı girdiniz");
		else
			System.out.println("Tek sayı girdiniz");
	}
	
	public static void displayOddStatusByFlag(boolean flag)
	{
		displayEvenStatusByFlag(!flag);
	}
}

