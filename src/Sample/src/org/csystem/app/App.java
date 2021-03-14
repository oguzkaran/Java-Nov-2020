/*--------------------------------------------------------------------------------------------------------------------
    IntValue sınıfı ve test kodu
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.IntValue;

class App {
    public static void main(String[] args)
    {
        IntValue ten = IntValue.TEN;

        for (IntValue i = IntValue.ZERO; i.compareTo(ten) < 0; i = i.increment())
            System.out.printf("%d ", i.getVal());

        System.out.println();
    }
}



