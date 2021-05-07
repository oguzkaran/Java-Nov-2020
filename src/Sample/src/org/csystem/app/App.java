/*----------------------------------------------------------------------------------------------------------------------
    Fraction sınıfı ve test kodu
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.Console;
import org.csystem.util.math.Fraction;
import org.csystem.util.math.FractionException;

class App {
    public static void main(String [] args)
    {
        for (;;) {
            try {
                int a = Console.readInt("Pay değerini giriniz:");
                int b = Console.readInt("Payda değerini giriniz:");
                Fraction f = new Fraction(a, b);

                System.out.println(f);
            }
            catch (FractionException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

