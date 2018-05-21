package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 21/05/2018.
 */
public class Players {

    private String name;
    private int wins;

    //constructor
    public Players(String name) {
        this.name = name;
        wins = 0;
    }

    //Functions of player class

    public Choice playerChoice(){

       Choice[] choice = Choice.values();
       Choice playerChoice = choice[Randomizer.random(0,2)];
       return playerChoice;

    }

    public String getName() {
        return name;

    }

    public int getWins(){
        return wins;
    }

    public void setWins() {
        this.wins++;
    }
}
