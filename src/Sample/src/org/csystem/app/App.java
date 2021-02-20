/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir dizinin elemanlarının toplamını döndüren sum isimli
    metodu ArrayUtil sınıfı içerisinde yazınız ve elemanları rasgele üretilmiş diziler ile test ediniz
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Random;

import static org.csystem.util.ArrayUtil.*;

class App {
    public static void main(String [] args)
    {
        Random r = new Random();
        int [] a = new int[10];
        fillRandomArray(r, a, 10, 20);

        display(a);
    }
}

