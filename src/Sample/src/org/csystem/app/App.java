/*----------------------------------------------------------------------------------------------------------------------
	enum türleri ve exception sınıfları generic olarak bildirilemez
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.concurrent.Future;

class App {
    public static void main(String[] args)
    {
        IMyExecutorService<String> ies = Executors.newFixedThreadPool(10);

        IFuture<?> future = ies.submit();

        future.get();
    }
}


final class Executors {
    private Executors()
    {}

    public static MyExecutorService newFixedThreadPool(int n)
    {
        //...
        return new MyExecutorService();
    }
}

interface IFuture<T> {
    T get();
}

class MyFuture<T> implements IFuture<T> {
    private T m_t;

    public MyFuture()
    {
        //
    }

    public MyFuture(T t)
    {
        //
        m_t = t;
    }

    public T get()
    {
        return m_t;
    }
}

class MyExecutorService<T> implements IMyExecutorService<T> {
    public IFuture<T> submit(T t)
    {
        return new MyFuture<>(t);
    }

    public IFuture<?> submit()
    {
        return new MyFuture<>();
    }
}

interface IMyExecutorService<T> {
    IFuture<T> submit(T t);
    IFuture<?> submit();
}