package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.button);
        ImageView firstDice = (ImageView) findViewById(R.id.diceone);
        ImageView secondDice = (ImageView) findViewById(R.id.dicetwo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int randomize = random.nextInt((6 - 1) + 1) + 1;
                int randomize1 = random.nextInt((6 - 1) + 1) + 1;
                switch (randomize) {
                    case (1):
                        firstDice.setImageResource(R.drawable.ic_dice1);
                        break;
                    case (2):
                        firstDice.setImageResource(R.drawable.ic_dice2);
                        break;
                    case (3):
                        firstDice.setImageResource(R.drawable.ic_dice3);
                        break;
                    case (4):
                        firstDice.setImageResource(R.drawable.ic_dice4);
                        break;
                    case (5):
                        firstDice.setImageResource(R.drawable.ic_dice5);
                        break;
                    case (6):
                        firstDice.setImageResource(R.drawable.ic_dice6);
                        break;
                }

                switch (randomize1) {
                    case (1):
                        secondDice.setImageResource(R.drawable.ic_dice1);
                        break;
                    case (2):
                        secondDice.setImageResource(R.drawable.ic_dice2);
                        break;
                    case (3):
                        secondDice.setImageResource(R.drawable.ic_dice3);
                        break;
                    case (4):
                        secondDice.setImageResource(R.drawable.ic_dice4);
                        break;
                    case (5):
                        secondDice.setImageResource(R.drawable.ic_dice5);
                        break;
                    case (6):
                        secondDice.setImageResource(R.drawable.ic_dice6);
                        break;
                }
            }
        });
    }
}