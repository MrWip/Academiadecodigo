package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 18/05/2018.
 */
public class Randomizer {

    static int random(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
