package com.example.tic_tac_toe;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int player = 1;
    private int winner = 0;

    private final int[][] array;
    {
        array = new int[][]{
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };
    }

    private MediaPlayer logo;
    private ImageButton icon1;
    private ImageButton icon2;
    private ImageButton icon3;
    private ImageButton icon4;
    private ImageButton icon5;
    private ImageButton icon6;
    private ImageButton icon7;
    private ImageButton icon8;
    private ImageButton icon9;

    void check(int[][] array){
        if (
                (array[0][0]==array[0][1]&&array[0][1]==array[0][2] && array[0][0]==0)
                        || (array[0][0]==array[1][0]&&array[1][0]==array[2][0] && array[0][0]==0)
                        || (array[0][0]==array[1][1]&&array[1][1]==array[2][2] && array[0][0]==0)
                        || (array[1][0]==array[1][1]&&array[1][1]==array[1][2] && array[1][0]==0)
                        || (array[2][0]==array[2][1]&&array[2][1]==array[2][2] && array[2][0]==0)
                        || (array[0][1]==array[1][1]&&array[1][1]==array[2][1] && array[0][1]==0)
                        || (array[0][2]==array[1][2]&&array[1][2]==array[2][2] && array[0][2]==0)
                        || (array[0][2]==array[1][1]&&array[1][1]==array[2][0] && array[0][2]==0)
        ){
            winner = 2;
            icon1.setImageResource(R.drawable.back);
            icon2.setImageResource(R.drawable.back);
            icon3.setImageResource(R.drawable.back);
            icon4.setImageResource(R.drawable.back);
            icon5.setImageResource(R.drawable.back);
            icon6.setImageResource(R.drawable.back);
            icon7.setImageResource(R.drawable.back);
            icon8.setImageResource(R.drawable.back);
            icon9.setImageResource(R.drawable.back);
            player = 1;}

        else if (
                (array[0][0]==array[0][1]&&array[0][1]==array[0][2] && array[0][0]==1)
                        || (array[0][0]==array[1][0]&&array[1][0]==array[2][0] && array[0][0]==1)
                        || (array[0][0]==array[1][1]&&array[1][1]==array[2][2] && array[0][0]==1)
                        || (array[1][0]==array[1][1]&&array[1][1]==array[1][2] && array[1][0]==1)
                        || (array[2][0]==array[2][1]&&array[2][1]==array[2][2] && array[2][0]==1)
                        || (array[0][1]==array[1][1]&&array[1][1]==array[2][1] && array[0][1]==1)
                        || (array[0][2]==array[1][2]&&array[1][2]==array[2][2] && array[0][2]==1)
                        || (array[0][2]==array[1][1]&&array[1][1]==array[2][0] && array[0][2]==1)
        ){
            winner = 1;
            icon1.setImageResource(R.drawable.back);
            icon2.setImageResource(R.drawable.back);
            icon3.setImageResource(R.drawable.back);
            icon4.setImageResource(R.drawable.back);
            icon5.setImageResource(R.drawable.back);
            icon6.setImageResource(R.drawable.back);
            icon7.setImageResource(R.drawable.back);
            icon8.setImageResource(R.drawable.back);
            icon9.setImageResource(R.drawable.back);
            player = 1;}

        if (winner != 0){
            int number = 11;
            for (int i = 0; i<3; i++){
                for(int j = 0; j<3; j++) {
                    array[i][j] = number;
                    number += 1;
                }
                }
            }

            if (winner == 1){
                logo.start();
                Toast.makeText(this, "The Crusaders won. Ava Maria!", Toast.LENGTH_SHORT).show();
                winner = 0;
            }
            else if (winner == 2){
                logo.start();
                Toast.makeText(this, "The Knights of the round table have won! In the name of King Arthur!", Toast.LENGTH_SHORT).show();
                winner = 0;
            }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = MediaPlayer.create(this, R.raw.win);

        icon1 = findViewById(R.id.icon1);
        icon2 = findViewById(R.id.icon2);
        icon3 = findViewById(R.id.icon3);
        icon4 = findViewById(R.id.icon4);
        icon5 = findViewById(R.id.icon5);
        icon6 = findViewById(R.id.icon6);
        icon7 = findViewById(R.id.icon7);
        icon8 = findViewById(R.id.icon8);
        icon9 = findViewById(R.id.icon9);


        icon1.setOnClickListener(v -> {
            if (player == 1){
                icon1.setImageResource(R.drawable.cross);
                player = 2;
                array[0][0] = 1;

            }
            else {
                icon1.setImageResource(R.drawable.circle);
                player = 1;
                array[0][0] = 0;
            }
            check(array);
        });

        icon2.setOnClickListener(v -> {
            if (player == 1){
                icon2.setImageResource(R.drawable.cross);
                player = 2;
                array[0][1] = 1;
            }
            else {
                icon2.setImageResource(R.drawable.circle);
                player = 1;
                array[0][1] = 0;
            }
            check(array);
        });

        icon3.setOnClickListener(v -> {
            if (player == 1){
                icon3.setImageResource(R.drawable.cross);
                player = 2;
                array[0][2] = 1;
            }
            else {
                icon3.setImageResource(R.drawable.circle);
                player = 1;
                array[0][2] = 0;
            }
            check(array);
        });

        icon4.setOnClickListener(v -> {
            if (player == 1){
                icon4.setImageResource(R.drawable.cross);
                player = 2;
                array[1][0] = 1;
            }
            else {
                icon4.setImageResource(R.drawable.circle);
                player = 1;
                array[1][0] = 0;
            }
            check(array);
        });

        icon5.setOnClickListener(v -> {
            if (player == 1){
                icon5.setImageResource(R.drawable.cross);
                player = 2;
                array[1][1] = 1;
            }
            else {
                icon5.setImageResource(R.drawable.circle);
                player = 1;
                array[1][1] = 0;
            }
            check(array);
        });

        icon6.setOnClickListener(v -> {
            if (player == 1){
                icon6.setImageResource(R.drawable.cross);
                player = 2;
                array[1][2] = 1;
            }
            else {
                icon6.setImageResource(R.drawable.circle);
                player = 1;
                array[1][2] = 0;
            }
            check(array);
        });

        icon7.setOnClickListener(v -> {
            if (player == 1){
                icon7.setImageResource(R.drawable.cross);
                player = 2;
                array[2][0] = 1;
            }
            else {
                icon7.setImageResource(R.drawable.circle);
                player = 1;
                array[2][0] = 0;
            }
            check(array);
        });

        icon8.setOnClickListener(v -> {
            if (player == 1){
                icon8.setImageResource(R.drawable.cross);
                player = 2;
                array[2][1] = 1;
            }
            else {
                icon8.setImageResource(R.drawable.circle);
                player = 1;
                array[2][1] = 0;
            }
            check(array);
        });

        icon9.setOnClickListener(v -> {
            if (player == 1){
                icon9.setImageResource(R.drawable.cross);
                player = 2;
                array[2][2] = 1;
            }
            else {
                icon9.setImageResource(R.drawable.circle);
                player = 1;
                array[2][2] = 0;

            }
            check(array);
        });
    }
}