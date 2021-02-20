/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir diziyi teryüz eden reverse isimli metodu yazınız ve test ediniz.
    Metodu ikinci bir dizi kullanmadan yazınız
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.ArrayUtil.*;

class App {
    public static void main(String [] args)
    {
        SumTest.run();
    }
}

class SumTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Dizinin eleman sayısını giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            int [] a = generateRandomArray(r, n, 1, 100);
            display(a);
            System.out.printf("Toplam:%d%n", sum(a));
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

