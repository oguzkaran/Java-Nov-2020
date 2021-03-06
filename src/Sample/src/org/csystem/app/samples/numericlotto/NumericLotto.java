package org.csystem.app.samples.numericlotto;

import java.util.Random;

public class NumericLotto {
    public Random random;

    public boolean [] getFlags()
    {
        boolean [] flags = new boolean[50];

        for (int i = 0; i < 6; ++i) {
            int val;
            for (;;) {
                val = random.nextInt(49) + 1;
                if (!flags[val])
                    break;
            }
            flags[val] = true;
        }

        return flags;
    }

    public static int [] getNumbers(boolean [] flags)
    {
        int [] numbers = new int[6];

        int index = 0;

        for (int i = 1; i < 50; ++i)
            if (flags[i])
                numbers[index++] = i;

        return numbers;
    }

    public NumericLotto()
    {
        random = new Random();
    }

    public NumericLotto(Random r)
    {
        random = r;
    }

    public int [] getNumbers()
    {
        return getNumbers(getFlags());
    }

    public int [][] getNumbers(int n)
    {
        int [][] result = new int[n][];

        for (int i = 0; i < n; ++i)
            result[i] = getNumbers();

        return result;
    }
}
