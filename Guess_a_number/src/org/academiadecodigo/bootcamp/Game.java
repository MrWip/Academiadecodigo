package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 18/05/2018.
 */
public class Game {

    private int min;
    private int max;
    private int randNumber;


    //Constructor
    public Game(int min, int max) {
        this.min = min;
        this.max = max;
    }

    //Game engine

    public void start(Player players[]){

        pick();
        int hit = -1;
        while(hit!=0) {

            hit = randNumber;
            for(int i=0;i<players.length;i++){
                if(hit == players[i].getNumber()){
                    System.out.println("Player " + players[i].getName() + " HAS WON");
                    hit = 0;
                    break;
                }
                else {
                    System.out.println("Random Number was " + randNumber);
                    System.out.println("Player " + players[i].getName() + " picked:" + players[i].getNumber() + " LOST");
                    players[i].pick(min, max);
                }
            }



        }

    }

    private void pick(){

        randNumber = Randomizer.random(min,max);

    }


    //GET THE STORED VARIABLED FOR THE GAME
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
