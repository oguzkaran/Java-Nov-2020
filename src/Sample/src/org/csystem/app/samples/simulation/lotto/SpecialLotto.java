package org.csystem.app.samples.simulation.lotto;

import org.csystem.util.NumberUtil;

import java.util.Random;

public class SpecialLotto {
    public Random random;
    public boolean firstGameWinStatus;
    public boolean secondGameWinStatus;
    public boolean thirdGameWinStatus;
    public int first;
    public int second;
    public int third;

    public int getNumber()
    {
        return random.nextInt(99) + 1;
    }

    public void setNumbers()
    {
        setFirst();
        setSecond();
        setThird();
    }

    public void setFirst()
    {
        first = getNumber();
    }

    public void setSecond()
    {

        while ((second = getNumber()) == first)
            ;
    }

    public void setThird()
    {
        while ((third = getNumber()) == first || third == second)
            ;
    }

    public void playFirstGame(int first, int second, int third)
    {
        firstGameWinStatus = first + second + third < 150;
    }

    public void playSecondGame(int first, int second, int third)
    {
        secondGameWinStatus = NumberUtil.isPrime(first + second + third);
    }

    public void playThirdGame(int first, int second, int third)
    {
        int max = Math.max(Math.max(first, second), third);
        int min = Math.min(Math.min(first, second), third);
        int mid = first + second + third - max - min;

        thirdGameWinStatus = max - min > mid;
    }

    public SpecialLotto()
    {
        random = new Random();
    }

    public SpecialLotto(Random rand)
    {
        random = rand;
    }

    public void playFirstGame()
    {
        setNumbers();
        playFirstGame(first, second, third);
    }

    public void playSecondGame()
    {
        setNumbers();
        playSecondGame(first, second, third);
    }

    public void playThirdGame()
    {
        setNumbers();
        playThirdGame(first, second, third);
    }

    public void play()
    {
        setNumbers();
        playFirstGame(first, second, third);
        playSecondGame(first, second, third);
        playThirdGame(first, second, third);
    }
}
