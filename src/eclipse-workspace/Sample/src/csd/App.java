/*--------------------------------------------------------------------------------------------------------------------
	Hiç sonlanamayacak sanılan ancak sonlanan bir döngü deyimi
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		int i;
		
		for (i = 0; i < 5; --i)
			; //System.out.printf("i = %d%n", i);
		
		System.out.printf("Döngü sonrası i = %d%n", i);
	}
}



