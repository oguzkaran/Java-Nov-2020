package org.csystem.app.samples.randomgenerator;

import org.csystem.util.ArrayUtil;
import org.csystem.util.IntValue;
import org.csystem.util.datetime.Date;
import org.csystem.util.datetime.Time;


public class RandomObjectArrayGeneratorApp {
    private RandomObjectArrayGeneratorApp()
    {
    }

    public static void run()
    {
        RandomObjectArrayGenerator rag = new RandomObjectArrayGenerator(5);

        rag.run();

        for (Object object : rag.getObjects()) {
            String typeName = object.getClass().getName();
            System.out.printf("Dinamik tür ismi:%s%n", typeName);

            if (object instanceof String) {
                String s = (String)object;

                System.out.printf("Yazı:%s%n", s);
                System.out.printf("Yazı:%s%n", s.toUpperCase());
            }
            else if (object instanceof Date) {
                Date date = (Date)object;

                System.out.println(date.toLongDateStringTR());
            }
            else if (object instanceof Time) {
                Time time = (Time) object;

                System.out.println(time.toLongTimeString());
            }
            else if (object instanceof IntValue) {
                IntValue ival = (IntValue)object;

                System.out.printf("ival = %d%n", ival.getVal());
                ival = ival.add(20);
                System.out.printf("ival = %d%n", ival.getVal());
            }
            else if (object instanceof int[]){
                int [] a = (int[])object;

                ArrayUtil.display(2, a);
            }
        }
    }
}
