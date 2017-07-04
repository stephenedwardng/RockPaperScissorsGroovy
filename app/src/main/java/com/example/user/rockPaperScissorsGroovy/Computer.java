package com.example.user.rockPaperScissorsGroovy;

import java.util.Random;

import behaviours.Move;

/**
 * Created by user on 04/07/2017.
 */

public class Computer {

    public Move getMove(){
        Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
