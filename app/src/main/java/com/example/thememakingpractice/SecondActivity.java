package com.example.thememakingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    boolean isTheme1;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = getIntent();
        isTheme1 = intent.getBooleanExtra("THEME", true);
        if(isTheme1) {
            setTheme(R.style.Theme_MyTheme);
        } else {
            setTheme(R.style.Theme_MyTheme2);
        }
        setContentView(R.layout.activity_second);
        String text = intent.getStringExtra("TEXT");
        textView = findViewById(R.id.textView);
        textView.setText(text);
    }

    public void returnBack(View v){
        Intent intent = new Intent(this, MainActivity.class);;
        startActivity(intent);
    }
}