package com.example.thememakingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setTheme1(View v){
        setTheme(R.style.Theme_MyTheme);
        setContentView(R.layout.activity_main);
    }
    public void setTheme2(View v){
        setTheme(R.style.Theme_MyTheme2);
        setContentView(R.layout.activity_main);
    }
}