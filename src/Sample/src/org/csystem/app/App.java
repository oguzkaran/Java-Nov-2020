/*--------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Klavyeden aşağıdaki formatta girilen bilgiyi ayrıştırarak ekrana sonuçları yazdıran programı yazınız.
    Not: Format geçerlilik kontrolü yapılmayacaktır
    <isim>:<gg/aa/yyyy>:<ders adı>:<vize>:<final>
    Oğuz Karan:10/09/1976:Programlamaya Giriş:76:89
    Bu formatta kişimin vize ve final notlarına göre vize * 0.4 + final * 0.6 formülüne göre geçme notunu hesaplayan ve
    doğum tarihinin hangi güne geldiğini de ekrana yazdıran programı yazınız
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String[] args)
    {
        String text = "Bugün hava çok güzel.Bu [[[[[[güzel]]]]] havada ders yapıyoruz";
        String [] strings = text.split("[ .\\]\\[]+");

        for (int i = 0; i < strings.length; ++i)
            System.out.println(strings[i]);
    }
}

