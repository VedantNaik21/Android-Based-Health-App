package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LoseWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_weight);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Oats Porridge","1 Bowl"));
        words.add(new Word("Mixed Vegetable Salad","1 Bowl"));
        words.add(new Word("Lentils Curry","1 Bowl"));
        words.add(new Word("Green Tea","1-2 Cups"));
        words.add(new Word("Roti","2-3 Max"));
        words.add(new Word("Fruits","2-3"));
        words.add(new Word("Cooked Veggies","1 Bowl"));
        words.add(new Word("Fruit Juice","1 Glass"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}