/*--------------------------------------------------------------------------------------------------------------------
	Gerçek sayı türünden tamsayı türüne yapılan explicit dönüşüm şu aşamalarla gerçekleşir:
	- Sayının noktadan sonraki kısmı atılır
		- Elde edilen değer hedef türün sınırları içerisinde kalıyorsa doğrudan hedef türe atılır
		- Elde edilen değer hedef türün sınırları içerisinde değilse:
			- Hedef tür byte, short, int ve char türlerinden biriyse elde edilen değer int türüne dönüştürülür
				- Elde edilen değer int türü sınırları içerisinde int türüne dönüşüm kuralları uygulanır. Buradan
				elde edilen değer tamsayılar arasındaki dönüşüm kurallarına göre hedef türe atanır 
				- Elde edilen değer int türü sınırları içerisinde değilse değerin pozitif ya da negatif olmasına
				göre int türünün en büyük ya da en küçük değeri alınır ve hedef türe dönüştürülür
			- Hedef tür long türü ise elde edilen long türüne dönüştürülür
				- Elde edilen değer long türü sınırları içerisindeyse doğrudan atanır
				- Elde edilen değer long türü sınırları içerisinde değilse sayının değerin pozitif ya da negatif olmasına
				göre long türünün en büyük ya da en küçük değeri alınır ve hedef türe atanır
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		double a;
		int b;
		
		a = -5_000_000_000.907;
		
		b = (int)a;
		
		System.out.printf("%d%n", (int)-5_000_000_000L);		
		System.out.printf("b = %d%n", b);
	}
}