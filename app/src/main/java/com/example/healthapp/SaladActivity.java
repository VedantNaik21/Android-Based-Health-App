package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SaladActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Tomatoes","2 medium sized"));
        words.add(new Word("Onions", "1 Medium sized"));
        words.add(new Word("Cucumber", "1 small sized"));
        words.add(new Word("Carrot", "1/2 finely chopped"));
        words.add(new Word("Grilled chicken", "(Optional)"));
        words.add(new Word("Sprouts", "1/2 Cup"));
        words.add(new Word("Salt", "As per taste"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}