/*--------------------------------------------------------------------------------------------------------------------
	Yukarıdaki örnek parantez konarak daha okunabilir hale getirilebilir	
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz:");
		int a = Integer.parseInt(kb.nextLine());
		
		System.out.print("İkinci sayıyı giriniz:");
		int b = Integer.parseInt(kb.nextLine());	
		
		System.out.print("Üçüncü sayıyı giriniz:");
		int c = Integer.parseInt(kb.nextLine());

		int min;
		
		min = (a < b) ? (a < c ? a : c) : (b < c ? b : c); 
		
		System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, min);		
	}
}