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

        textView = (TextView)findViewById(R.id.count);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String displayWordCount = extras.getString("countWords");
        Log.d("WordCounter", displayWordCount);
        textView.setText(displayWordCount);

    }
}
