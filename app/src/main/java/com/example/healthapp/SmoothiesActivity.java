package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SmoothiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smoothies);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Frozen Strawberries","2 Cups"));
        words.add(new Word("Banana", "1 Medium sized"));
        words.add(new Word("Almond Milk", "1 cup"));
        words.add(new Word("Yogurt(Plain)", "1/2 cup"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}