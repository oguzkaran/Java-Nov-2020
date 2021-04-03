/*--------------------------------------------------------------------------------------------------------------------
    AnalyticalCircle sınıfı ve test kodu:
    Bir sınıfın içerisinde veri elemanı olarak tuttuğu referansa ilişkin bir metodun aynı isimde ve genel olarak
    aynı parametrik yapıda yazılan bir versiyonuna "delegate method" denir
---------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.util.math.geometry.AnalyticalCircle;
import org.csystem.util.math.geometry.Point;

class App {
    public static void main(String[] args)
    {
        Point center = new Point(100, 100);
        AnalyticalCircle ac = new AnalyticalCircle(-4.5, center);

        System.out.printf("Radius:%f%n", ac.getRadius());
        System.out.printf("Area:%f%n", ac.getArea());
        System.out.printf("Circumference:%f%n", ac.getCircumference());
        System.out.printf("{x : %d, y : %d}%n", ac.getX(), ac.getY());

        ac.offset(-20);

        System.out.printf("Radius:%f%n", ac.getRadius());
        System.out.printf("Area:%f%n", ac.getArea());
        System.out.printf("Circumference:%f%n", ac.getCircumference());
        System.out.printf("{x : %d, y : %d}%n", ac.getX(), ac.getY());
    }
}


