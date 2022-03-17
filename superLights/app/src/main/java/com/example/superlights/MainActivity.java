package com.example.superlights;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boolean[] checks = {false,false,false,false,false,false,false,false,false};


        final ImageView circle1 = findViewById(R.id.circle1);
        final ImageView circle2 = findViewById(R.id.circle2);
        final ImageView circle3 = findViewById(R.id.circle3);
        final ImageView circle4 = findViewById(R.id.circle4);
        final ImageView circle5 = findViewById(R.id.circle5);
        final ImageView circle6 = findViewById(R.id.circle6);
        final ImageView circle7 = findViewById(R.id.circle7);
        final ImageView circle8 = findViewById(R.id.circle8);
        final ImageView circle9 = findViewById(R.id.circle9);

        circle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[0]) {
                    circle1.setImageResource(R.drawable.red_circle);
                    checks[0] = true;
                }
                else{
                    circle1.setImageResource(R.drawable.dark_circle);
                    checks[0] = false;
                }
            }
        });
        circle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[1]) {
                    circle2.setImageResource(R.drawable.green_circle);
                    checks[1] = true;
                }
                else{
                    circle2.setImageResource(R.drawable.dark_circle);
                    checks[1] = false;
                }
            }
        });
        circle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[2]) {
                    circle3.setImageResource(R.drawable.blue_circle);
                    checks[2] = true;
                }
                else{
                    circle3.setImageResource(R.drawable.dark_circle);
                    checks[2] = false;
                }
            }
        });
        circle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[3]) {
                    circle4.setImageResource(R.drawable.blue_circle);
                    checks[3] = true;
                }
                else{
                    circle4.setImageResource(R.drawable.dark_circle);
                    checks[3] = false;
                }
            }
        });
        circle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[4]) {
                    circle5.setImageResource(R.drawable.red_circle);
                    checks[4] = true;
                }
                else{
                    circle5.setImageResource(R.drawable.dark_circle);
                    checks[4] = false;
                }
            }
        });
        circle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[5]) {
                    circle6.setImageResource(R.drawable.green_circle);
                    checks[5] = true;
                }
                else{
                    circle6.setImageResource(R.drawable.dark_circle);
                    checks[5] = false;
                }
            }
        });
        circle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[6]) {
                    circle7.setImageResource(R.drawable.green_circle);
                    checks[6] = true;
                }
                else{
                    circle7.setImageResource(R.drawable.dark_circle);
                    checks[6] = false;
                }
            }
        });
        circle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[7]) {
                    circle8.setImageResource(R.drawable.blue_circle);
                    checks[7] = true;
                }
                else{
                    circle8.setImageResource(R.drawable.dark_circle);
                    checks[7] = false;
                }
            }
        });
        circle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checks[8]) {
                    circle9.setImageResource(R.drawable.red_circle);
                    checks[8] = true;
                }
                else{
                    circle9.setImageResource(R.drawable.dark_circle);
                    checks[8] = false;
                }
            }
        });
    }
}