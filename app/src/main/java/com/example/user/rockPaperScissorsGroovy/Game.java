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

    public int compareMoves(Move playerMove, Move computerMove) {
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

    public String displayWinner(int result){
        switch (result){
            case 0:
                return "It is a draw.";
            case 1:
                return "Player wins.";
            case -1:
                return "Computer wins.";
        }
        return null;
    }

}
