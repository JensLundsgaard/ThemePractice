package com.example.thememakingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    boolean isTheme1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();
        // extract the String data that we labeled as username
        isTheme1 = intent.getBooleanExtra("THEME");
        // get a reference to the TextView in this xml so we can change the text
        setContentView(R.layout.activity_second);

    }
}