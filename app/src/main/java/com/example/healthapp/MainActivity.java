package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton gainWeight = (ImageButton) findViewById(R.id.gain_weight);
        gainWeight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gainActivityIntent = new Intent(MainActivity.this, GainWeightActivity.class);
                startActivity(gainActivityIntent);
            }
        });

        ImageButton loseWeight = (ImageButton) findViewById(R.id.lose_weight);
        loseWeight.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loseActivityIntent = new Intent(MainActivity.this, LoseWeightActivity.class);
                startActivity(loseActivityIntent);
            }
        });

        ImageButton bmi = (ImageButton) findViewById(R.id.bmi);
        bmi.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bmiActivityIntent = new Intent(MainActivity.this, BMIActivity.class);
                startActivity(bmiActivityIntent);
            }
        });

        ImageButton recipes = (ImageButton) findViewById(R.id.recipes);
        recipes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recipesIntent = new Intent(MainActivity.this, RecipesActivity.class);
                startActivity(recipesIntent);
            }
        });
    }
}