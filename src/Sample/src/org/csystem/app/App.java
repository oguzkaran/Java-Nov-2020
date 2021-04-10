/*--------------------------------------------------------------------------------------------------------------------
    Aşağıdaki örnekte Object dizisinin referanslarının dinamik türlerine göre downcasting yapılmıştır. Dinamik tür bir
    bilgisi tür isminden elde edilmiştir. Programcının tür ismini yanlış yazma olasılığı vardır. Ayrıca yazı karşılaştırması
    göreceli yavaştır.
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.app.samples.randomgenerator.RandomObjectArrayGeneratorApp;

class App {
    public static void main(String[] args)
    {
        RandomObjectArrayGeneratorApp.run();
    }
}

