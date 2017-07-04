package com.example.user.rockPaperScissorsGroovy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowWinnerActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_winner);

        textView = (TextView)findViewById(R.id.winnerView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String displayWinner = extras.getString("displayWinner");
        Log.d("displayWinner", displayWinner);
        textView.setText(displayWinner);

    }
}
