/*--------------------------------------------------------------------------------------------------------------------
	Basit bir menü uygulamasının iskeleti
	(İleride daha iyisi yazılacaktır)
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		MenuApp.run();
	}
}

class MenuApp {
	public static void run()
	{
		Menu.run();
	}
}

class Menu {
	public static void displayMenu()
	{
		System.out.println("1.Ekle");
		System.out.println("2.Güncelle");
		System.out.println("3.Sil");
		System.out.println("4.Listele");
		System.out.println("5.Çıkış");
		System.out.print("Seçenek:");
	}
	
	public static void doWorkForInsert()
	{
		System.out.println("***************");
		System.out.println("Ekle seçildi");
		System.out.println("***************");
	}
	
	public static void doWorkForUpdate()
	{
		System.out.println("***************");
		System.out.println("Güncelle seçildi");
		System.out.println("***************");
	}
	
	public static void doWorkForDelete()
	{
		System.out.println("***************");
		System.out.println("Sil seçildi");
		System.out.println("***************");
	}
	
	public static void doWorkForList()
	{
		System.out.println("***************");
		System.out.println("Listele seçildi");
		System.out.println("***************");
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		EXIT_MENU:
		for (;;) {
			displayMenu();
			int option = Integer.parseInt(kb.nextLine());
			
			switch (option) {
			case 1:
				doWorkForInsert();
				break;
			case 2:
				doWorkForUpdate();
				break;
			case 3:
				doWorkForDelete();
				break;
			case 4:
				doWorkForList();
				break;
			case 5:
				break EXIT_MENU;
			default:
				System.out.println("Geçersiz seçenek");			
			}			
		}
		
		System.out.println("Teşekkürler");
	}
}
