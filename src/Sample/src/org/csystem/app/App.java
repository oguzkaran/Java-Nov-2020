/*--------------------------------------------------------------------------------------------------------------------
    Homework001-2. sorunun bir çözümü
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.NumberUtil;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        MidTest.run();
    }
}

class MidTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Birinci sayıyı giriniz:");
            int a = Integer.parseInt(kb.nextLine());

            System.out.print("İkinci sayıyı giriniz:");
            int b = Integer.parseInt(kb.nextLine());

            System.out.print("Üçüncü sayıyı giriniz:");
            int c = Integer.parseInt(kb.nextLine());

            System.out.println(NumberUtil.mid(a, b, c));
            System.out.println(NumberUtil.mid(b, a, c));
            System.out.println(NumberUtil.mid(c, a, b));
            System.out.println(NumberUtil.mid(a, c, b));
            System.out.println(NumberUtil.mid(c, b, a));
            System.out.println(NumberUtil.mid(b, c, a));

            if (a == 0)
                break;
        }
    }
}

