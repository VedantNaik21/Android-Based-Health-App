package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ChickenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Chicken Breast","250 gm"));
        words.add(new Word("Lemon", "1"));
        words.add(new Word("Chilli Flakes", "A pinch"));
        words.add(new Word("Oil", "2-3 Tb Spoon"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}