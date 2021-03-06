/*--------------------------------------------------------------------------------------------------------------------
    Sınıf elemanlarının erişim belirleyicileri:
    Sınıf elemanlarının (veri elemanları, metotlar, ctor'lar vb.) erişim belirleyicileri 4(dört) tanedir:
    public, protected, no-modifier, private.
    Erişim belirleyici anlamında sınıf dört bölüme ayrılmıştır. Yani örneğin sınıfın public bir elemanı sınıfın
    public bölümüne eklenmiş olur. Erişim belileyiciler sınıf dışından erişim için anlamlıdır. Sınıfın dışı başka
    bir sınıfın içi demektir. Sınıfın içinde erişim belirleyici anlamında bir kısıt yoktur. Yani sınıf içerisinde her
    bölüme erişilebilir.

    Anahtar Notlar: Sınıfın no-modifier elemanı (hiçbir erişim belirleyici yazılmaması) Java'da erişim anlamında
    diğerlerinden (public, protected, private) farklıdır. Bazı dillerde olduğu gibi no-modifier diğerlerinden bir anlamına
    gelmez. Bu durumunun bir tek enum class'larda istisnası vardır. İleride ele alınacaktır.


---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 9, 8}};

        for (int [] array : a) {
            for (int val : array)
                System.out.printf("%d ", val);

            System.out.println();
        }
    }
}

