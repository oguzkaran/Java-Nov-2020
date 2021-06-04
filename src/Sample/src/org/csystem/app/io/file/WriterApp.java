/*----------------------------------------------------------------------------------------------------------------------
    FileOutputStream sınıfının byte türden dizi parametreli write metotları ile yazma işlemi yapılabilir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileOutputStream;
import java.util.Random;

final class WriterApp {
    private WriterApp()
    {
    }
    public static void main(String[] args)
    {
        if (args.length != 2) {
            System.err.println("Geçersiz sayıda argümanlar");
            System.exit(-1);
        }

        Random r = new Random();

        try (FileOutputStream fos = new FileOutputStream(args[0], true)) {
            int n = Integer.parseInt(args[1]);
            byte [] data = new byte[n];

            r.nextBytes(data);

            for (byte val : data)
                System.out.printf("%d ", val);

            fos.write(data, n / 2, data.length - n / 2);

            System.out.println();
        }
        catch (NumberFormatException ignore) {
            System.err.println("Geçersiz sayı formatı");
        }
        catch (Throwable ex) {
            System.err.printf("Exception:%s", ex.getMessage());
        }
    }
}
