/*--------------------------------------------------------------------------------------------------------------------		
	Sınıf Çalışması: Parametresi ile aldığı bir yazınızn sadece başındaki boşluk karakterlerini atan trimLeading ile
	sadece sonundaki boşluk karakterlerini atan trimTrailing isimli metotları yazınız
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		TrimLeadingTrailingTest.run();
	}
}

class TrimLeadingTrailingTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.printf("[%s]%n", s);						
			System.out.printf("[%s]%n", StringUtil.trimLeading(s));
			System.out.printf("[%s]%n", StringUtil.trimTrailing(s));
		}
		
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}


class StringUtil {
	public static String trimLeading(String s)
	{	
		int i;
		int length = s.length();
		
		for (i = 0; i < length && Character.isWhitespace(s.charAt(i)) ; ++i)
			;
		
		return s.substring(i);
	}
	
	public static String trimTrailing(String s)
	{
		int i;
		
		for (i = s.length() - 1; i >= 0 && Character.isWhitespace(s.charAt(i)); --i)
			;
		
		return s.substring(0, i + 1);
	}
}




