/*----------------------------------------------------------------------------------------------------------------------
    ArrayUtil sınıfının partition metodu (partition algoritması kullanılmıştır)
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.ArrayUtil;

class App {
    public static void main(String[] args)
    {
        PartitionTest.run();
    }
}

class PartitionTest {
    public static void run()
    {
        int [] a = {12, 13, 5, 10, 3, 7};

        ArrayUtil.display(a);
        int index = ArrayUtil.partition(a, 3);
        System.out.printf("Partition Index:%d%n", index);
        ArrayUtil.display(a);
    }
}

