/*--------------------------------------------------------------------------------------------------------------------
    String sınıfı immutable olduğundan aşağıdaki ilişki ne aggregation, ne de composition'dır. İkisine de belirli
    ölçüde yakın olmasına karşın tam olarak uymamaktadır. Bu durum özeldir ve ilişkileri etkilemez. Aynı zamanda
    isim de vermek gerekmez
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class C extends B {
    //...
}

class B extends A {
    //..
}

class A {
    //...
}
