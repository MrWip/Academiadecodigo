package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.field.Direction;

/**
 * Created by codecadet on 25/05/2018.
 */
public class Randomizer {

    public static int randomNumber(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static Direction randomDirection(Direction oldDirection){

        Direction newDirection = oldDirection;
        while(oldDirection == newDirection){
            switch((int) ( Math.random() * 4 + 1)) {
                case 1:
                    newDirection = Direction.UP;
                    break;
                case 2:
                    newDirection = Direction.DOWN;
                    break;
                case 3:
                    newDirection = Direction.RIGHT;
                    break;
                case 4:
                    newDirection = Direction.LEFT;
                    break;
            }
        }
        return newDirection;
    }
}
