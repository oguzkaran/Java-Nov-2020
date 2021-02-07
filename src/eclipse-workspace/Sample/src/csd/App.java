/*--------------------------------------------------------------------------------------------------------------------		
	Java 7 ile birlikte switch deyiminde Strinf de kullanılabilmektedir. Bu durumda case bölümlerinin String literal
	olması zorunludur. String sınıfı switch deyimi ile kullanıldığında karşılaştırma equals metodu ile yapılır
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Şehir ismini giriniz:");
		String city = kb.nextLine();
		
		switch (city.toLowerCase()) {
		case "ankara":
		case "çankırı":
		case "konya":
			System.out.println("İç Anadolu Bölgesi");
			break;
		case "istanbul":
		case "bursa":
		case "çanakkale":
			System.out.println("Marmara Bölgesi");
			break;
			
		case "zonguldak":
		case "bolu":
		case "sinop":
			System.out.println("Batı Karadeniz Bölgesi");
			break;
		default:
			System.out.println("Geçersiz şehir ismi");			
		}		
	}
}

