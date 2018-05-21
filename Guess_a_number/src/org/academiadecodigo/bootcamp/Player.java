package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 18/05/2018.
 */
public class Player {

    private String name;
    private int number;

    //constructor
    public Player(String name, int min, int max) {
        this.name = name;
        pick(min,max);
    }

    //Functions of player class

    public void pick(int min, int max){

        number = Randomizer.random(min,max);

    }

    public String getName() {
        return name;

    }

    public int getNumber() {
        return number;
    }

}
