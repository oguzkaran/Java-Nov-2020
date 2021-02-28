/*--------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Parametresi ile aldığı int türden bir dizi dizisinin elemanlarının toplamını döndüren sum
    isimli metodu ArrayUtil sınıfı içerisinde yazınız ve test ediniz

    Sınıf Çalışması: Parametresi ile aldığı matrisin devriğini (transpose) döndüren transpose isimli metodu yazınız
    ve test ediniz
    Not: Matris kontrolü yapılmayacaktır
    Örnek:
    1 2 3
    4 5 6

    1 4
    2 5
    3 6

    Sınıf Çalışması: Parametresi ile aldığı int türden dizi dizisinin matrsi olup olmadığını test eden isMatrix isimli
    metodu ArrayUtil sınıfı içerisinde yazınız ve test ediniz
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;

class App {
    public static void main(String[] args)
    {
        int [][] a;

        a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        ArrayUtil.display(2, a);
    }
}

