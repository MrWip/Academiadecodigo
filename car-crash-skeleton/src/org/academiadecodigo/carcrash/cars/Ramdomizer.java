package org.academiadecodigo.carcrash.cars;

/**
 * Created by codecadet on 24/05/2018.
 */
public class Ramdomizer {

    static int random(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}
