package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final private static String TAG = "Magic8Ball";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonAsk = findViewById(R.id.button_ask);
        final ImageView imageBall = findViewById(R.id.image_eightBall);

        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randNumGen = new Random();
                int randomNumber = randNumGen.nextInt(ballArray.length);
                Log.d(MainActivity.TAG, "OnClick - " + randomNumber);
                imageBall.setImageResource(ballArray[randomNumber]);
            }
        });

    }
}
