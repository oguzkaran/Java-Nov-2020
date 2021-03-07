package org.csystem.app.samples.simulation.lotto;

import java.util.Random;

public class SpecialLottoSimulation {
    public double firstGameWinProbability;
    public double secondGameWinProbability;
    public double thirdGameWinProbability;

    public void runSimulation(int n)
    {
        SpecialLotto lotto = new SpecialLotto(new Random());

        int firstGameWinCount = 0;
        int secondGameWinCount = 0;
        int thirdGameWinCount = 0;

        for (int i = 0; i < n; ++i) {
            lotto.play();
            if (lotto.firstGameWinStatus)
                ++firstGameWinCount;

            if (lotto.secondGameWinStatus)
                ++secondGameWinCount;

            if (lotto.thirdGameWinStatus)
                ++thirdGameWinCount;
        }

        firstGameWinProbability = (double)firstGameWinCount / n;
        secondGameWinProbability = (double)secondGameWinCount / n;
        thirdGameWinProbability = (double)thirdGameWinCount / n;
    }

    public void run(int n)
    {
        runSimulation(n);
    }
}
