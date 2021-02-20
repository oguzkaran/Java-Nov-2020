/*----------------------------------------------------------------------------------------------------------------------
    Bir dizi yaratılıdığında tüm elemanlarına default değerler atanır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n = Integer.parseInt(kb.nextLine());
        boolean []flags;

        flags = new boolean[n];

        for (int i = 0; i < flags.length; ++i)
            System.out.printf("%b ", flags[i]);

        System.out.println();

        flags = new boolean[2 * n];

        for (int i = 0; i < flags.length; ++i)
            System.out.printf("%b ", flags[i]);

        System.out.println();

    }
}

