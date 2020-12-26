/*--------------------------------------------------------------------------------------------------------------------
	Kontrolün başta yapıldığı while döngü deyiminin genel biçimi:
	
	while (<koşul ifadesi>)
		<deyim>
		
	Koşul ifadesi boolean türden olmalıdır. Bu döngü koşul ifadesinin true olduğu sürece yinelenir 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		int i = 0;
		
		while (i < n) {
			System.out.printf("%d ", i);
			++i;
		}	
		System.out.printf("%nDöngü sonrası:i = %d%n", i);
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

