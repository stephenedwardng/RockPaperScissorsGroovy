package com.example.user.rockPaperScissorsGroovy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import behaviours.Move;

public class MainActivity extends AppCompatActivity {

    Button buttonRockInstance;
    Player player;
    Computer computer;
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRockInstance = (Button)findViewById(R.id.buttonRockId);
        player = new Player();
        computer = new Computer();
        game = new Game();

    }

    public void onRockButtonClicked(View button) {

        Move playerMove = player.getMoveRock();
        Move computerMove = computer.getMove();
        int winner = game.compareMoves(playerMove, computerMove);

        Intent intent = new Intent(this, ShowWinnerActivity.class);
        intent.putExtra("displayWinner", game.displayWinner(winner));
        startActivity(intent);

    }

    public void onPaperButtonClicked(View button) {

        Move playerMove = player.getMovePaper();
        Move computerMove = computer.getMove();
        int winner = game.compareMoves(playerMove, computerMove);

        Intent intent = new Intent(this, ShowWinnerActivity.class);
        intent.putExtra("displayWinner", game.displayWinner(winner));
        startActivity(intent);

    }

    public void onScissorsButtonClicked(View button) {

        Move playerMove = player.getMoveRock();
        Move computerMove = computer.getMove();
        int winner = game.compareMoves(playerMove, computerMove);

        Intent intent = new Intent(this, ShowWinnerActivity.class);
        intent.putExtra("displayWinner", game.displayWinner(winner));
        startActivity(intent);

    }
}
