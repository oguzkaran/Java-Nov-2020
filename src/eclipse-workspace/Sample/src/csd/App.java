/*--------------------------------------------------------------------------------------------------------------------
	Etiketli break deyiminin kullanımı
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		EXIT_LOOP:
		for (int i = 3; i < 10; ++i) {
			EXIT_INNER_LOOP:
			for (int j = 0; j < 100; ++j) {
				for (int k = 5; k >= 0; --k) {
					System.out.printf("{i : %d, j : %d, k : %d}%n", i, j, k);
					if ((i + j + k) % 8 == 0)
						break EXIT_INNER_LOOP;
					
					if ((i + j + k) % 11 == 0)
						break EXIT_LOOP;
				}				
			}			
		}
		
		System.out.println("Tekrar yapıyor musunuz?");
	}
}

