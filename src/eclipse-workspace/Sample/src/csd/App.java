/*--------------------------------------------------------------------------------------------------------------------	
	Aşağıdaki örnekte s yerel değişkenine değer atanmadan kullanıldığı error oluşur
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{		
		Sample s;
		
		s.x = 10; //error				
	}
}

class Sample {
	public int x;
	public boolean y;
	//...
}

