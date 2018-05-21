package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 18/05/2018.
 */
public class Main {

    public static void main(String[] args) {

        Player players[] = new Player[4];
        players[0] = new Player("Antonio", 1,10);
        players[1] = new Player("Ze", 1,10);
        players[2] = new Player("Francisco", 1,10);
        players[3] = new Player("Mariana", 1,10);
        Game newgame = new Game(1,10);
        newgame.start(players);

    }


}
