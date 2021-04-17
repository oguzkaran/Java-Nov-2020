/*--------------------------------------------------------------------------------------------------------------------
    null referans bir metodun geri değerinin referans olması durumunda kontrol amaçlı kullanılabilir
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n == 0)
                break;

            int [] a = Util.generateRandomArray(r, n, 1, 100);

            if (a == null) {
                System.out.println("Geçersiz değer");
                continue;
            }

            ArrayUtil.display(2, a);
        }
    }
}

class Util {
    public static int [] generateRandomArray(Random r, int n, int min, int max) //[min, max)
    {
        if (n <= 0 || min >= max)
            return null;

        int [] a = new int[n];

        for (int i = 0; i < n; ++i)
            a[i] = r.nextInt(max - min) + min;

        return a;
    }
}