/*--------------------------------------------------------------------------------------------------------------------		
	 Sınıf Çalışması: Parametresi ile aldığı bir yazının tersini döndüren reverse isimli metodu StringUtil sınıfı
	 içerisinde yazınız ve metodu test ediniz
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Derece değerini giriniz:");
		double degree = Double.parseDouble(kb.nextLine());	
		
		
		System.out.println("Bugün hava " + degree + " derece");
	}
}

