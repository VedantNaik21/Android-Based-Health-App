package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.provider.UserDictionary;

import java.util.ArrayList;

public class GainWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_weight);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Banana", "2 post Meal"));
        words.add(new Word("lentils", "1 cups"));
        words.add(new Word("Milk Shakes with Whey Protein","Once a day"));
        words.add(new Word("Rice","1 Cup Atleast"));
        words.add(new Word("Milk Products","Varies"));
        words.add(new Word("Butter/ Peanut Butter","1/4th Cup"));
        words.add(new Word("Potatoes","As per Choice"));
        words.add(new Word("Dry Fruits","1 Cup"));
        words.add(new Word("Fishes and Meat","As per choice"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}