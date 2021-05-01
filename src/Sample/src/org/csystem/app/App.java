/*----------------------------------------------------------------------------------------------------------------------
	Aşağıdaki örnekte bir oyun sistemine ilişkin demo bir şablon hazırlanmıştır. Bu sisteme oyun olarak
	dahil olabilmek için AbstractGame isimli şablon (template) sınıftan türetme yapmak ve ilgili metotları
	override etmek gerekmektedir. Konunun daha fazla detayları vardır. Burada demo biçiminde ele alınmıştır
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.games.template.GameRunnerApp;

class App {
    public static void main(String [] args)
    {
        GameRunnerApp app = new GameRunnerApp();

        app.run();
    }
}




