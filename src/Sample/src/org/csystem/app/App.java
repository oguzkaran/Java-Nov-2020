/*--------------------------------------------------------------------------------------------------------------------
    A ile B arasındaki "agrregation" ilişkisinin genel biçimi
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        B x = new B(/*...*/);
        B y = new B(/*...*/);
        A z = new A(x/*...*/);

        z.doWork1();
        z.doWork2();

        z.setB(y);

        z.doWork1();
        z.doWork2();
    }
}

class A {
    private B m_b;

    public A(B b/*...*/)
    {
        //...
        setB(b);
    }

    public void setB(B b)
    {
        //...
        m_b = b;
    }

    public B getB()
    {
        return m_b;
    }

    public void doWork1()
    {
        //...
        m_b.doSomething();
    }

    public void doWork2()
    {
        //...
        m_b.doSomething();
    }

    //...
}

class B {
    //...
    public void doSomething()
    {
        //...
    }
}
