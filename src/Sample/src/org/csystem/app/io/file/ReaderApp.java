/*----------------------------------------------------------------------------------------------------------------------
    FileInputStream sınıfının byte dizi parametreli read metotları byte türden dizinin içerisine dosyadaki bilgileri
    okur. Yani dosyaya yazar. Ne kadar okuduğu miktarı ile de geri döner. Bu durumda programcının ne kadar okunduğu
    miktarına göre dizinin elemanlarını kullanması gerekir. Yani aslında dizinin uzunluğu ya da okumak için verilen sayı
    en fazla ne kadar okunacağını belirtir
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

final class ReaderApp {
    private ReaderApp()
    {
    }
    public static void main(String[] args)
    {
        if (args.length != 2) {
            System.err.println("Geçersiz sayıda argümanlar");
            System.exit(-1);
        }

        try (FileInputStream fis = new FileInputStream(args[0])) {
            byte [] data = new byte[Integer.parseInt(args[1])];
            int result;

            while ((result = fis.read(data, 0, data.length)) > 0) {
                System.out.printf("Okunan byte sayısı:%d%n", result);
                for (int i = 0; i < result; ++i)
                    System.out.printf("%d%n", data[i]);
            }
        }
        catch (NumberFormatException ignore) {
            System.err.println("Geçersiz blok uzunluğu");
        }
        catch (FileNotFoundException ignore) {
            System.err.println("Dosya bulunamadı");
        }
        catch (Throwable ex) {
            System.err.printf("Exception:%s", ex.getMessage());
        }
    }
}
