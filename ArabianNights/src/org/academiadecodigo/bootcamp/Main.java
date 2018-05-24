package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/05/2018.
 */
public class Main {

    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(1);
        Demigod g1 = lamp1.rub();
        Demigod g2 = lamp1.rub();
        System.out.println(lamp1);
        System.out.println(g2);
        lamp1.recycle(g2);
        System.out.println(lamp1);
        System.out.println(g2);





    }

}
