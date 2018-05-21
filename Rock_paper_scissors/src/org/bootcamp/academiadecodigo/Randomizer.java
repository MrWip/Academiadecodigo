package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 21/05/2018.
 */
public class Randomizer {

    static int random(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}
