package com.example.thememakingpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    boolean isTheme1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                isTheme1 = ((ToggleButton)findViewById(R.id.toggleButton)).isChecked();
                // Create the intent, envelope and call its instructor and tell it where its intent is coming from 1st parameter
                // and where it is going 2nd parameter.
                Intent intent = new Intent(this, SecondActivity.class);
                // put data inside intent to send to the receiver (optional)
                intent.putExtra("THEME", isTheme1);
                // Start activity, switch screen, mail envelope
                startActivity(intent);
            break;
        }
    }
}