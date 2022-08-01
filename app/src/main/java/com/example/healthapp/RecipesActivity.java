package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.ImageButton;

public class RecipesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        ImageButton smoothies = (ImageButton) findViewById(R.id.smoothies);
        smoothies.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent smoothiesIntent = new Intent(RecipesActivity.this, SmoothiesActivity.class);
                startActivity(smoothiesIntent);
            }
        });

        ImageButton salad = (ImageButton) findViewById(R.id.salad);
        salad.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent saladIntent = new Intent(RecipesActivity.this, SaladActivity.class);
                startActivity(saladIntent);
            }
        });

        ImageButton oats = (ImageButton) findViewById(R.id.oats);
        oats.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oatsIntent = new Intent(RecipesActivity.this, OatsActivity.class);
                startActivity(oatsIntent);
            }
        });

        ImageButton chicken = (ImageButton) findViewById(R.id.chicken);
        chicken.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chickenIntent = new Intent(RecipesActivity.this, ChickenActivity.class);
                startActivity(chickenIntent);
            }
        });
    }
}