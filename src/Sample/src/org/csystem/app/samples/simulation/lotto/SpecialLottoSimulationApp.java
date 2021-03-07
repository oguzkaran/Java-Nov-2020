package org.csystem.app.samples.simulation.lotto;

import java.util.Scanner;

public class SpecialLottoSimulationApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Kaç kez oynatmak istiyorsunuz?");
        int n = Integer.parseInt(kb.nextLine());
        SpecialLottoSimulation simulation = new SpecialLottoSimulation();

        simulation.run(n);
        System.out.printf("p1 = %f%n", simulation.firstGameWinProbability);
        System.out.printf("p1 = %f%n", simulation.secondGameWinProbability);
        System.out.printf("p1 = %f%n", simulation.thirdGameWinProbability);
    }
}
