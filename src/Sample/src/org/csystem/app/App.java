/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elamanlarını yine parametresi ile aldığı değer
    kadar karıştıran shuffle isimli metodu yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        ShuffleTest.run();
    }
}

class ShuffleTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n == 0)
                break;

            int [] a = ArrayUtil.generateRandomArray(r, n, 0, 14);

            ArrayUtil.display(a);
            Util.shuffle(r, a, 100);
            ArrayUtil.display(a);
        }
    }
}

class Util {
    public static void shuffle(Random r, int [] a, int count)
    {
        int i, k;

        while (count-- > 0) {
            while ((i = r.nextInt(a.length)) == (k = r.nextInt(a.length)))
                ;
            swap(a, i, k);
        }
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp;

        temp = a[i];
        a[i] = a[k];
        a[k] = temp;
    }
}