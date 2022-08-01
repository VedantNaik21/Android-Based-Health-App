package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oats);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Oats","2 Cups"));
        words.add(new Word("Milk", "1 Cup"));
        words.add(new Word("Water", "8 cup"));
        words.add(new Word("Your Preferred fruits", "1 cup"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}