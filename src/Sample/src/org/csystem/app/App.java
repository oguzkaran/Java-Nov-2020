/*----------------------------------------------------------------------------------------------------------------------
    ArrayList/Vector sınıfının ensureCapacity metodu capacity değerini aşağıdaki şekilde değiştirmekte (veya değiştirmemekte)
    kullanılabilir: (else-if biçiminde düşününüz)
    - Yeni capacity değeri var olan capacity değerinden küçük veya eşitse değişklik yapmaz
    - Yeni capacity değeri var olan capacity değerinin artması gereken değerinden küçük veya eşitse artması gereken değere
    çeker.
    - Yeni capacity değeri var olan capacity değerinin artması gereken değerinden büyükse verilen capacity değerine çeker
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.StringUtil;

import java.util.Random;
import java.util.Vector;

class App {
    public static void main(String [] args)
    {
        Vector passwords = new Vector();
        Random r = new Random();

        for (int i = 0; i < 12; ++i)
            passwords.add(StringUtil.getRandomTextTR(r, 10));

        System.out.printf("Size:%d%n", passwords.size());
        System.out.printf("Capacity:%d%n", passwords.capacity());

        passwords.ensureCapacity(15);

        System.out.printf("Size:%d%n", passwords.size());
        System.out.printf("Capacity:%d%n", passwords.capacity());

        passwords.ensureCapacity(30);

        System.out.printf("Size:%d%n", passwords.size());
        System.out.printf("Capacity:%d%n", passwords.capacity());

        passwords.ensureCapacity(90);

        System.out.printf("Size:%d%n", passwords.size());
        System.out.printf("Capacity:%d%n", passwords.capacity());
    }
}