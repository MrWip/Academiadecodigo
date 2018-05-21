package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 21/05/2018.
 */
public class Main {

    public static void main(String[] args) {
        Players players[] = new Players[2];
        players[0] = new Players("Ze");
        players[1] = new Players("Antonieta");

        Game newgame = new Game(3);
        newgame.start(players);

    }

}
