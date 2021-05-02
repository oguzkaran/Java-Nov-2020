/*----------------------------------------------------------------------------------------------------------------------
    Throwable sınıfı içerisinde Throwable türünden bir referans tutulur. Bu referans bir exception sınıfı içerisinde
    başka bir exception referansının tutulabilmesine olanak sağlar. getCause metodu ile içsel olarak tutulan referans
    elde edilebilir. Ayrıca Throwable sınıfının Throwble parametresi de alan ctor elemanı ile bu bilgi nesneye verilebilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.util.Scanner;

class App {
    public static void main(String [] args)
    {
        try {
            System.out.println(Sample.foo());
        }
        catch (WrapperException ex) {
            System.out.println(ex.getMessage());
            Throwable cause = ex.getCause();

            if (cause instanceof NumberFormatException)
                System.out.printf("Cause Message:%s%n", cause.getMessage());
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}

class Sample {
    public static double foo()
    {
        try {
            Scanner kb = new Scanner(System.in);

            System.out.print("Bir sayı giriniz:");
            double val = Double.parseDouble(kb.nextLine());
            double result = MathUtil.myLog(val);

            return result;
        }
        catch (Throwable ex) {
            //...
            throw new WrapperException("foo exception", ex);
        }
    }
}

class MathUtil {
    public static double myLog(double val)
    {
        if (val < 0)
            throw new WrapperException("val < 0", new MyException("val can not be negative", ErrorStatus.NEGATIVE));

        if (val == 0)
            throw new MyException("val can not be zero", ErrorStatus.ZERO);

        return Math.log(val);
    }
}

class WrapperException extends RuntimeException {
    public WrapperException(String message)
    {
        super(message);
    }

    public WrapperException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public String getMessage()
    {
        Throwable cause =  getCause();

        return String.format("Message:%s%s",
                super.getMessage(), cause != null ? ", Cause Message:" + cause.getMessage() : "");
    }
}

enum ErrorStatus {ZERO, NEGATIVE}

class MyException extends RuntimeException {
    private final ErrorStatus m_errorStatus;
    public MyException(String message, ErrorStatus errorStatus)
    {
        super(message);
        m_errorStatus = errorStatus;
    }

    public ErrorStatus getErrorStatus()
    {
        return m_errorStatus;
    }

    public String getMessage()
    {
        return String.format("Message:%s, Error Status:%s", super.getMessage(), m_errorStatus);
    }
}
