/*--------------------------------------------------------------------------------------------------------------------		
	Sınıf Çalışması: İki zar atıldığında zarların çift gelmesi (ikisi de aynı) olasılığını yaklaşık olarak hesaplayan
	basit bir simülasyon programını yazınız
---------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)
	{
		DiceSimulationApp.run();	
	}
}

class DiceSimulationApp {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("Kaç kez atmak istiyorsunuz?");
		int n = Integer.parseInt(kb.nextLine());
		
		DiceSimulation diceSimulation = new DiceSimulation();
		
		diceSimulation.run(n);
		
		System.out.printf("p = %.10f%n", diceSimulation.p);		
	}
}

class DiceSimulation {
	public double p;
	
	//...
	
	public static boolean areSame(java.util.Random r)
	{
		return r.nextInt(6) == r.nextInt(6); 
	}
	
	public void run(int n)
	{
		java.util.Random random = new java.util.Random();
		
		int count = 0;
		
		for (int i = 0; i < n; ++i)
			if (areSame(random))
				++count;
		
		p = (double) count/ n;
	}
}

