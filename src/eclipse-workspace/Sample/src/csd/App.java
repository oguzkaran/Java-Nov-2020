/*--------------------------------------------------------------------------------------------------------------------		
	 
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		String s = "Bugün hava çok güzel. Fakat bu çok güzel havada dışarı çıkamıyoruz";
		String str = "güzel";
		
		int index = s.lastIndexOf(str);
		
		System.out.printf("Index:%d%n", index);		
	}
}

