package org.bootcamp.academiadecodigo;

/**
 * Created by codecadet on 21/05/2018.
 */
public class Game {

    int rounds;

    public Game(int rounds) {

        this.rounds = rounds;
    }

    public void start(Players players[]) {

        int result;
        Choice[] playerChoice = new Choice[2];

        for (int c = 0; c < rounds; c++) {
            for (int i = 0; i < 2; i++) {
                playerChoice[i] = players[i].playerChoice();

            }
            if(playerChoice[0] == playerChoice[1]){
                System.out.println("PLAYER 1 and 2 TIED");
                continue;
            }
            switch (playerChoice[0]) {

                case ROCK:

                    if (playerChoice[1] == Choice.SCISSORS) {
                        players[0].setWins();
                        System.out.println("Player 1 ROCK -- PLAYER 2 SCISSORS");
                    } else if (playerChoice[1] == Choice.PAPER) {
                        players[1].setWins();
                        System.out.println("Player 1 ROCK -- PLAYER 2 PAPER");
                    }

                    break;
                case SCISSORS:
                    if (playerChoice[1] == Choice.PAPER) {
                        players[0].setWins();
                        System.out.println("Player 1 SCISSORS -- PLAYER 2 PAPER");

                    } else if (playerChoice[1] == Choice.ROCK) {
                        players[1].setWins();
                        System.out.println("Player 1 SCISSORS -- PLAYER 2 ROCK");
                    }break;
                case PAPER:
                    if (playerChoice[1] == Choice.ROCK) {
                        players[0].setWins();
                        System.out.println("Player 1 PAPER -- PLAYER 2 ROCK");
                    } else if (playerChoice[1] == Choice.SCISSORS) {
                        players[1].setWins();
                        System.out.println("Player 1 PAPER -- PLAYER 2 SCISSORS");
                    }break;
            }
        }
        if (players[0].getWins() < players[1].getWins()) {
            System.out.println("Player 2 " + players[1].getName() + " wins");
        } else if (players[0].getWins() > players[1].getWins()) {
            System.out.println("Player 1 " + players[0].getName() + " wins");
        } else {
            System.out.println("GAME TIED");
        }
    }
}
