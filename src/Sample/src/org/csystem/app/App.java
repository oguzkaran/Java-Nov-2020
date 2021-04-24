/*----------------------------------------------------------------------------------------------------------------------
    Yukarıdaki örneğe C sınıfı eklenmesine rağmen main metodu içerisindeki kodlar bundan etkilenmemiştir. Yani
    main metodu içerisinde A'dan türeyen sınıflar anlamında türden bağımsız kod yazılmıştır. Diğer bir söylemle
    A sınıfından türemiş her sınıf A olarak düşünülerek kod yazılmıştır. Çalışma zamanı sırasında dinamik tür ile
    gerçek türlere ilişkin metotlar çağrılmaktadır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        Factory factory = new Factory();
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int val = Integer.parseInt(kb.nextLine());

        A x = factory.getAInstance(val);

        x.foo();
        x.bar(10);
    }
}

class Factory {
    //...
    public A getAInstance(int val)
    {
        if (val > 0)
            return new C();
        if (val == 0)
            return new B();

        return new A();
    }
}

class C extends B {
    public void foo() //override
    {
        System.out.println("C.foo()");
    }

    public void bar(int a) //override
    {
        System.out.println("C.bar(int)");
    }
}

class B extends  A {
    public void foo() //override
    {
        System.out.println("B.foo()");
    }

    public void bar(int a) //override
    {
        System.out.println("B.bar(int)");
    }
}

class A {
    public void foo()
    {
        System.out.println("A.foo()");
    }

    public void bar(int a)
    {
        System.out.println("A.bar(int)");
    }
}