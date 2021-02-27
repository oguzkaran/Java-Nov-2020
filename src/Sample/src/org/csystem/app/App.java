/*--------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı en fazla üç basamaklı bir sayının Türkçe okunuşunu döndüren
	numberToText3DigitsTR metodunu yazınız ve test ediniz. Metot 3 basamaktan daha büyü sayılar için kontrol
	yapmayacaktır
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;
import org.csystem.util.NumberUtil;

import java.util.Scanner;

class App {
    public static void main(String[] args)
    {
        NumberToText3DigitsTR.run();
    }
}

class NumberToText3DigitsTR {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Üç basamaklı bir sayı giriniz:");
            int val = Integer.parseInt(kb.nextLine());

            System.out.println(NumberUtil.numberToText3DigitsTR(val));

            if (val == 0)
                break;
        }
    }
}

