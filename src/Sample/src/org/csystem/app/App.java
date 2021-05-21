/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Komut satırından aşağıdaki gibi çalışan programı yazınız:
        java org.csystem.app.App <src> <dest>
    Program komut satırı argümanı verilmezse klavyeden yol ifadesini isteyecektir. src ile aldığı dosyayı dest ile
    aldığı dosya olarak kopyalayacaktır. Hedef dosya varsa hedef dosya ismi ve uzantısının sonuna "-bak" ekelenerek
    yedeklenecektir. Daha önce yedeklenmişse üzerine yazılacaktır. Bu işlemden sonra kopyalama yapılacaktır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import java.io.IOException;
import java.nio.file.*;

class App {
    public static void main(String[] args)
    {
        if (args.length != 2) {
            System.out.println("Wrong number of arguments");
            System.exit(-1);
        }

        try {
            Files.move(Path.of(args[0]), Path.of(args[1]));
            System.out.println("Kopyalama başarılı...");
        }
        catch (DirectoryNotEmptyException ignore) {
            System.out.println("Dizin boş değil!...");
        }
        catch (FileAlreadyExistsException ignore) {
            System.out.println("Hedef dosya var kopyalayamazsınız!....");
        }
        catch (IOException ignore) {
            System.out.println("Dosya işlemlerine ilişkin bir sorun oluştu");
        }
        catch (Throwable ignore) {
            System.out.println("Belirlenemeyen bir durum oluştu");
        }
    }
}

