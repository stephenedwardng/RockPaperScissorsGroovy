package com.example.user.rockPaperScissorsGroovy;

import java.util.Scanner;

import behaviours.Move;

/**
 * Created by user on 04/07/2017.
 */

public class Player {

    private Scanner scan;

    public Player(){
        scan = new Scanner(System.in);
    }

    public Move getMove(){
        System.out.println("Choose R, P or S");
        String input = scan.nextLine().toUpperCase();
        char choice = input.charAt(0);
        switch(choice){
            case 'R' :
                return Move.ROCK;
            case 'P' :
                return Move.PAPER;
            case 'S' :
                return Move.SCISSORS;
            default :
                return null;
        }
    }
}
