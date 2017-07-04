package com.example.user.rockPaperScissorsGroovy;

import behaviours.Move;

/**
 * Created by user on 04/07/2017.
 */

public class Player {

    public Move getMoveRock(){
        return Move.ROCK;
    }

    public Move getMovePaper(){
        return Move.PAPER;
    }

    public Move getMoveScissors(){
        return Move.SCISSORS;
    }

}
