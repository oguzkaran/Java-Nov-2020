/*--------------------------------------------------------------------------------------------------------------------		
	  String sınıfının endsWith metodu 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Email adresini giriniz:");
		String email = kb.nextLine();
		
		if (!email.endsWith(".com"))
			email += ".com";
		
		System.out.println(email);		
	}
}

