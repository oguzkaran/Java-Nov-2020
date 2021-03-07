/*--------------------------------------------------------------------------------------------------------------------
    Aşağıdaki Person sınıfında m_married veri elemanı için get metodu "is" ile başlatılmıştır
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {

    }
}

class Person {
    private String m_name;
    private int m_no;
    private boolean m_married;

    //...

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        //...
        m_name = name;
    }

    //...

    public boolean isMarried()
    {
        return m_married;
    }

    public void setMarried(boolean married)
    {
        m_married = married;
    }
}