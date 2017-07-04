package com.example.user.rockPaperScissorsGroovy;

import behaviours.Move;

/**
 * Created by user on 04/07/2017.
 */

public class Game {

    private Player player;
    private Computer computer;

    public Game(){
        player = new Player();
        computer = new Computer();
    }

    public void playGame(){
        Move computerMove = computer.getMove();
        Move playerMove = player.getMove();
        System.out.println("You played " + playerMove.getType());
        System.out.println("Computer played " + computerMove.getType());
        int winner = compareMoves(playerMove, computerMove);
        displayWinner(winner);
    }

    private int compareMoves(Move playerMove, Move computerMove) {
        if (playerMove == computerMove){
            return 0;
        }

        switch (playerMove) {
            case ROCK :
                return (computerMove == Move.SCISSORS ? 1: -1);
            case PAPER :
                return (computerMove == Move.ROCK ? 1 : -1);
            case SCISSORS :
                return (computerMove == Move.PAPER ? 1 : -1);
            default:
                return 0;
        }
    }

    private void displayWinner(int result){
        switch (result){
            case 0:
                System.out.println("Draw");
                break;
            case 1:
                System.out.println("Player wins");
                break;
            case -1:
                System.out.println("Computer wins");
        }
    }

}
