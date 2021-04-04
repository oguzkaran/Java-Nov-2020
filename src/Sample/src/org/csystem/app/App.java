/*--------------------------------------------------------------------------------------------------------------------
    "upcasting" işleminde taban sınıf referansına, ona atanan türemiş sınıf referansının gösterdiği nesnenin taban sınıf
    bölümünün adresi atanmış olur
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        B x = new B();
        A y;

        x.a = 10;
        x.b = 34;

        y = x;

        Sample.doWork(y);
        Sample.doWork(x);
        System.out.printf("y.a = %d%n", y.a);
        System.out.printf("x.a = %d%n", x.a);

        y.a *= 2;
        System.out.printf("y.a = %d%n", y.a);
        System.out.printf("x.a = %d%n", x.a);
    }
}

class Sample {
    public static void doWork(A a)
    {

    }
}

class B extends A {
    public int b;
    //...
}

class A {
    public int a;
}
