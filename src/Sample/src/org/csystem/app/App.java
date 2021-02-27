/*----------------------------------------------------------------------------------------------------------------------
    Homework-008-5. sorunun char türden dizi kullanarak bir çözümü
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.StringUtil;

import java.util.Random;
import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        ChangeCaseTest.run();
    }
}

class ChangeCaseTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        for (;;) {
            System.out.print("Bir sayı giriniz:");
            int n = Integer.parseInt(kb.nextLine());

            if (n <= 0)
                break;

            String s = StringUtil.getRandomTextTR(n);
            System.out.println(s);
            System.out.println(StringUtil.changeCase(s));
        }
        System.out.println("Tekrar yapıyor musunuz?");
    }
}

