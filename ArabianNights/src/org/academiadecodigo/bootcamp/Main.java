package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Main {

    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(1);
        System.out.println(lamp1);
        Demigod g1 = lamp1.rub();
        System.out.println(g1);
        System.out.println(lamp1);

        lamp1.currentGenie.concedeWish();
        lamp1.currentGenie.concedeWish();
        lamp1.currentGenie.concedeWish();
        lamp1.currentGenie.concedeWish();
        System.out.println(lamp1);
        Demigod g2 = lamp1.rub();
        System.out.println(g2);
        System.out.println(lamp1);
        g2.recycle(lamp1);



    }

}
