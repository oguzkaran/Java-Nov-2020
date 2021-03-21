/*--------------------------------------------------------------------------------------------------------------------
    Fraction sınıfı ve test kodu
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.Fraction;

class App {
    public static void main(String[] args)
    {
        Fraction f = new Fraction(3, 4);

        f.increment(2);
        System.out.println(f.toString());
        f.decrement(2);
        System.out.println(f.toString());

    }
}



